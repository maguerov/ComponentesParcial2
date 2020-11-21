package com.cenfotec.parcial2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.parcial2.domain.Workshop;

public interface WorkshopRepository extends JpaRepository<Workshop, Long>{
	public List<Workshop> findByNameContaining(String word);
	public List<Workshop> findByCategoryContaining(String word);
}
