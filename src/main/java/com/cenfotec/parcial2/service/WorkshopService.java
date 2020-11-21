package com.cenfotec.parcial2.service;

import java.util.List;
import java.util.Optional;

import com.cenfotec.parcial2.domain.Workshop;

public interface WorkshopService {
	
	public void save(Workshop workshop);
	public Optional<Workshop> get(long id);
	public List<Workshop> getAll();
	public List<Workshop> find(String name);
	public List<Workshop> findCat(String name);

	public List<Workshop> findAuthor(String name);
}
