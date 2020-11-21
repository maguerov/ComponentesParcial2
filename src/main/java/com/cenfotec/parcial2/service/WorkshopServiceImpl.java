package com.cenfotec.parcial2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.parcial2.domain.Workshop;
import com.cenfotec.parcial2.repo.WorkshopRepository;


@Service
public class WorkshopServiceImpl implements WorkshopService {

	@Autowired
	WorkshopRepository repo;
	
	@Override
	public void save(Workshop workshop) {
		repo.save(workshop);
	}

	@Override
	public Optional<Workshop> get(long id) {
		return repo.findById(id);
	}

	@Override
	public List<Workshop> find(String name) {
		return repo.findByNameContaining(name);
	}
	
	@Override
	public List<Workshop> findCat(String name) {
		return repo.findByCategoryContaining(name);
	}
	
	@Override
	public List<Workshop> findAuthor(String name) {
		return repo.findByAuthorContaining(name);
	}
	
	@Override
	public List<Workshop> getAll() {
		return repo.findAll();
	}
}
