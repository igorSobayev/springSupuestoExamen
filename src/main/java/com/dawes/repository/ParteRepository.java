package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.ParteVO;

@Repository
public interface ParteRepository extends CrudRepository <ParteVO, Integer> {

}
