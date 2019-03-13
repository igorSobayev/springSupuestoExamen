package com.dawes.services;

import java.util.List;

import com.dawes.modelo.VisitadorVO;

public interface VisitadorService {

	Iterable<VisitadorVO> findAll();

	List<Object[]> informe();

}