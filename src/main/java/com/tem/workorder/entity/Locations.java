package com.tem.workorder.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "locations")
@Entity
public class Locations implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = -6842791736185682752L;

		@Id
		@Column(name = "id")
		private Integer id ;
		
		@Column(name = "sector")
		private String sector ;

		@Column(name = "area")
		private String area;
		
		@Column(name = "state")
		private String state;
		
		@Column(name = "country")
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
