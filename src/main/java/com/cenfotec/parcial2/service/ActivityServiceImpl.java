package com.cenfotec.parcial2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.parcial2.domain.Activity;
import com.cenfotec.parcial2.repo.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService{

	@Autowired
	ActivityRepository activityRepo;
	
	
	public void save(Activity act) {
		activityRepo.save(act);
	}
}
