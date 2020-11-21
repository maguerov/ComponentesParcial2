package com.cenfotec.parcial2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.parcial2.domain.Activity;

public interface ActivityRepository extends JpaRepository<Activity,Long>{

}
