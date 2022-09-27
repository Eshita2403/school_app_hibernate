package com.ty.school.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int roll;
		@Column(name="student_name", unique= true)
		private String name;
		@Column(name="student_percent", nullable = false)
		private double percentage;
		
		
		
		public int getRol() {
			return roll;
		}
		public void setRol(int rol) {
			this.roll = rol;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPercentage() {
			return percentage;
		}
		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}
		
	}


