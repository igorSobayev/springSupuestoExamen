package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.GastosVO;

@Repository
public interface GastosRepository extends CrudRepository <GastosVO, Integer> {

}
