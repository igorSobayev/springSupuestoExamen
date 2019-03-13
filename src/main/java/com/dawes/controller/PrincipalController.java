package com.dawes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ParteVO;
import com.dawes.services.ParteService;
import com.dawes.services.VisitadorService;

@Controller
public class PrincipalController {
	
	@Autowired
	VisitadorService vs;
	
	@Autowired
	ParteService ps;
	
	// Método encargado de servir la vista indice
	@RequestMapping("/")
	public String index() {
		return "/index";
	}
	
	// Método encargado de servir la vista de los visitadores
	// Este método busca todos los visitadores y los devuelve al modelo para
	// trabajar con el en la vista
	@RequestMapping("/visitadores")
	public String visitadores(Model modelo) {
		modelo.addAttribute("visitadores", vs.findAll());
		return "/visitadores";
	}
	
	// Método encargado de devolver todos los partes del visitador
	// Recoge por parámetros el idvisitador y el nombre del visitador
	// para poder utilizarlos, el nombre lo utilizo para simplemente nombrar
	// a la página
	// el idVisitador lo utilizo para resolver el método
	@RequestMapping("/mostrarVisitador")
	public String mostrarVisitador(@RequestParam int idVisitador, @RequestParam String nombre, Model modelo) {

		// lista que va a contenedor todas las partes
		List<ParteVO> partes = (List<ParteVO>) ps.findAll();
		// lista final enviada al modelo
		List<ParteVO> partes_vista = new ArrayList<ParteVO>();
		
		// Miro que partes tiene el visitador y los guardo en una lista
		for (int i = 0; i < partes.size(); i++) {
			if (partes.get(i).getVisitador().getIdVisitador() == idVisitador) {
				
				ParteVO parte = partes.get(i);
				
				partes_vista.add(parte);
			}
		}
		
		// Devuelvo los atributos necesarios
		modelo.addAttribute("nombre", nombre);
		modelo.addAttribute("partes", partes_vista);
		return "/mostrarVisitador";
	}
	
	// Ya funciona
	@RequestMapping("/informe")
	public String informe(Model modelo)  {
		
		List<Object[]> informes = vs.informe();
		
//		for (Object[] informe:informes) {
//			System.out.println("Visitador " + informe[0]);
//			System.out.println("Gasto" + informe[1]);
//			System.out.println("Suma total" + informe[2]);
//		}
		
		modelo.addAttribute("informes", informes);
		return "/informe";
	}

}
