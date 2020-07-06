package com.tem.workorder.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BusinessDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -704336342260001555L;

	private Integer id ;
	
	private String businessName ;
	
	private String licenseNo;
	
	private String location;
	
	private String contantNo;
	
	private String createdBy;
	
	private LocalDate createdDate;
	
	private LocalDate updateDate;
	
	private String organization;
	
	private String landMark;

	@JsonIgnore
	private WorkOrderDTO workorder;
	
	private String activityType;

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

	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public LocalDate getUpdateDate() {
		return updateDate;
	}


	public WorkOrderDTO getWorkorder() {
		return workorder;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}


	public void setWorkorder(WorkOrderDTO workorder) {
		this.workorder = workorder;
	}


	public void setOrganization(String organization) {
		this.organization = organization;
	}


	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}


	public String getLocation() {
		return location;
	}


	public String getActivityType() {
		return activityType;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}



}
