package com.cakemanager.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakemanager.app.dao.CakeDao;
import com.cakemanager.app.entities.CakeEntity;

@Service
public class CakeService {

	@Autowired
	private CakeDao cakeDao;
	
	public CakeEntity createCake(CakeEntity cakeEntity) {
		return cakeDao.save(cakeEntity);
	}
	public CakeEntity getCakeById(Integer cakeId) {
		return cakeDao.findOne(cakeId);
	}
	public Iterable<CakeEntity> getAllCakes() {
		return cakeDao.findAll();
	}
}
