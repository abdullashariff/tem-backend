package com.tem.workorder.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class GTImagesDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6842791736185682752L;

	private Integer id ;
	
	private Boolean imgStatus ;

	private String imageData ;

	private WorkOrderDTO workorder;
	
	public Integer getId() {
		return id;
	}

	public String getImageData() {
		return imageData;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getImgStatus() {
		return imgStatus == null ? false : true;
	}

	public void setImgStatus(Boolean imgStatus) {
		this.imgStatus = imgStatus;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}
	
	public WorkOrderDTO getWorkorder() {
		return workorder;
	}

	public void setWorkorder(WorkOrderDTO workorder) {
		this.workorder = workorder;
	}
	
}
