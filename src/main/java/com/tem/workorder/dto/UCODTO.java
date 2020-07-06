package com.tem.workorder.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class UCODTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7643488018007752112L;

	private Integer id;

	private String ucoInvoice;

	private Boolean ucoCollected;

	private WorkOrderDTO workorders;

	private String remarks;
	
	private String volume;

	public Integer getId() {
		return id;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getUcoInvoice() {
		return ucoInvoice;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUcoInvoice(String ucoInvoice) {
		this.ucoInvoice = ucoInvoice;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Boolean getUcoCollected() {
		return ucoCollected;
	}

	public WorkOrderDTO getWorkorders() {
		return workorders;
	}

	public void setUcoCollected(Boolean ucoCollected) {
		this.ucoCollected = ucoCollected;
	}

	public void setWorkorders(WorkOrderDTO workorders) {
		this.workorders = workorders;
	}

}
