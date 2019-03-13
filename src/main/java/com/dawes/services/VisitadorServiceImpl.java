package com.dawes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.VisitadorVO;
import com.dawes.repository.VisitadorRepository;

@Service
public class VisitadorServiceImpl implements VisitadorService {
	
	@Autowired
	VisitadorRepository vr;
	
	/* (non-Javadoc)
	 * @see com.dawes.services.VisitadorService#findAll()
	 */
	@Override
	public List<Object[]> informe() {
		return vr.informe();
	}

	/* (non-Javadoc)
	 * @see com.dawes.services.VisitadorService#findAll()
	 */
	@Override
	public Iterable<VisitadorVO> findAll() {
		return vr.findAll();
	}
	

}
