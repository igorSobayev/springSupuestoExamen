package com.dawes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.GastosVO;
import com.dawes.repository.GastosRepository;

@Service
public class GastosServiceImpl implements GastosService {

	@Autowired
	GastosRepository gr;

	/* (non-Javadoc)
	 * @see com.dawes.services.GastosService#findAll()
	 */
	@Override
	public Iterable<GastosVO> findAll() {
		return gr.findAll();
	}
	
	
}
