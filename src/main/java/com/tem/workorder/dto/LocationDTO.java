package com.tem.workorder.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class LocationDTO implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = -6842791736185682752L;

		private Integer id ;
		
		private String sector ;

		private String area;
		
		private String state;
		
		private String country;
		
		public Integer getId() {
			return id;
		}

		public String getSector() {
			return sector;
		}

		public String getArea() {
			return area;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public void setSector(String sector) {
			this.sector = sector;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getState() {
			return state;
		}

		public String getCountry() {
			return country;
		}

		public void setState(String state) {
			this.state = state;
		}

		public void setCountry(String country) {
			this.country = country;
		}

}
