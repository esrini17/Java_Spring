package com.cakemanager.app.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
@EqualsAndHashCode(of = "id")
@Entity
@Table(name="cake_entity")
public class CakeEntity {

	public CakeEntity() {
	}

	public CakeEntity(Integer id, String title, String description, String image) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.image = image;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="title",nullable=false)
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="image")
	private String image;
	
	
	
	


}
