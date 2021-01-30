package com.cakemanager.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.cakemanager.app.entities.CakeEntity;

public interface CakeDao extends CrudRepository<CakeEntity, Integer>{

}
