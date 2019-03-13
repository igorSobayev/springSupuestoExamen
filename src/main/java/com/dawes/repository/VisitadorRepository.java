package com.dawes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.VisitadorVO;

@Repository
public interface VisitadorRepository extends CrudRepository <VisitadorVO, Integer> {
	
	// La consulta no funciona debido a que que no se como 
	// trabajar con una lista de tipo Object y extrar los datos a thymeleaf, ademas
	// de la gran complejidad de una consulta de 4 uniones
	// La idea es:
	// Primero seleccionamos los campos que vamos a mostrar en la tabla, en este caso
	// seleccionamos el nombre del visitador, la denominacion de los gastos y la suma del imprte total
	// luego declaramos las tablas a las que vamos a hacer la consulta y unimos cada una de ellas
	// con la relación que tienen de la otra ( con los id)
	// finalmente agrupamos por nombre y el nombre del gasto y sumamos todo
	
//	@Query("select v.nombre as visitador, g.denominacion as gasto, sum(lp.importe) as total "
//			+ "from VisitadorVO as v, ParteVO as p "
//			+ ", LineaParteVO as lp, GastoVO as g where v.idVisitador = p.idVisitador and "
//			+ "p.idParte = lp.idParte and lp.IdGastos = g.idGastos "
//			+ "group by visitador and gasto "
//			+ "having total")
//	List<Object> informe();	
	
	@Query("select v, spgg.denominacion, sum(spg.importe) from VisitadorVO v join fetch v.setPartes sp "
			+ "join fetch sp.setParteGastos spg join fetch spg.gastos spgg group by v.idVisitador, spgg.denominacion")
	List<Object[]> informe();
	

}
