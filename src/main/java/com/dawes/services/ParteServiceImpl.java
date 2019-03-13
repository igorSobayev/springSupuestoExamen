package com.dawes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.ParteVO;
import com.dawes.repository.ParteRepository;

@Service
public class ParteServiceImpl implements ParteService {
	
	@Autowired
	ParteRepository pr;

	/* (non-Javadoc)
	 * @see com.dawes.services.ParteService#findAllById(java.lang.Iterable)
	 */
	@Override
	public Iterable<ParteVO> findAll() {
		return pr.findAll();
	}

	/* (non-Javadoc)
	 * @see com.dawes.services.ParteService#findAllById(java.lang.Iterable)
	 */
	@Override
	public Optional<ParteVO> findById(Integer id) {
		return pr.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.dawes.services.ParteService#findAllById(java.lang.Iterable)
	 */
	@Override
	public Iterable<ParteVO> findAllById(Iterable<Integer> ids) {
		return pr.findAllById(ids);
	}
	
	

}
