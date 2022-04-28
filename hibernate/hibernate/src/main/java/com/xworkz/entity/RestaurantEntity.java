package com.xworkz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
	@Entity
	@Table(name="restaurants")
	public class RestaurantEntity {
		
		@Id
		@Column(name="id")
		private int restuarantId;
		@Column(name="contactNo")
		private long contactNo;
		private String name;
		private double rating;
		private String type;
	}

