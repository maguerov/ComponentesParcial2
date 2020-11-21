package com.cenfotec.parcial2.domain;

import java.util.Set;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient; 
import javax.persistence.OneToMany;


@Entity
@Table(name = "TWorkshop") 
public class Workshop {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;	
	
	@Column(name="name") 
	private String name;
	
	@Column(name="author") 
	private String author;
	
	@Column(name="category") 
	private String category;
	
	@Column(name="keywords") 
	private String keywords;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="workshop")
	private Set<Activity> activities;

	public Set<Activity> getActivities() {
	return activities;
}
	
    public void setActivities(Set<Activity> activities) {
	this.activities = activities;
}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}



	public Workshop(long id, String name, String author, String category, String keywords, 
			Set<Activity> activities) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.category = category;
		this.keywords = keywords;
		this.activities = activities;
	}

	public Workshop() {
	}



	
}

