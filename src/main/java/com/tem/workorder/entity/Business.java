package com.tem.workorder.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.View;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;

@Table(name = "business")
@Entity
public class Business implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -704336342260001555L;

	@Id
	@SequenceGenerator(name = "seq-gen", sequenceName = "workorder_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq-gen")
	@Column(name="id", insertable = true, updatable = false)
	private Integer id;
	
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "workorder_id", nullable = true)
	private WorkOrder workorders;

	@Column(name = "business_name")
	private String businessName;

	@Column(name = "license_no")
	private String licenseNo;

	@Column(name = "location")
	private String location;

	@Column(name = "contant_no")
	private String contantNo;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "update_date")
	private LocalDate updateDate;

	@Column(name = "organization")
	private String organization;

	@Column(name = "land_mark")
	private String landMark;

	@Column(name = "activitytype")
	private String activityType;


	public String getLocation() {
		return location;
	}

	public String getActivityType() {
		return activityType;
	}


	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}


	public void setLocation(String location) {
		this.location = location;
	}

	public WorkOrder getWorkorders() {
		return workorders;
	}

	public void setWorkorders(WorkOrder workorders) {
		this.workorders = workorders;
	}

	public Integer getId() {
		return id;
	}

	public String getBusinessName() {
		return businessName;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public String getLocations() {
		return location;
	}

	public String getContantNo() {
		return contantNo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public String getOrganization() {
		return organization;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public void setLocations(String location) {
		this.location = location;
	}

	public void setContantNo(String contantNo) {
		this.contantNo = contantNo;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
}
