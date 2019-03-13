package com.dawes.services;

import java.util.Optional;

import com.dawes.modelo.ParteVO;

public interface ParteService {

	Iterable<ParteVO> findAllById(Iterable<Integer> ids);

	Optional<ParteVO> findById(Integer id);

	Iterable<ParteVO> findAll();

}