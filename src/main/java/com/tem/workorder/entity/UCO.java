package com.tem.workorder.entity;

import java.io.Serializable;

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

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Table(name = "used_cooking_oil")
@Entity
public class UCO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7643488018007752112L;

	@Id
	@SequenceGenerator(name = "seq-gen", sequenceName = "workorder_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq-gen")
	@Column(name = "id")
	private Integer id;

	@Column(name = "uco_invoice")
	private String ucoInvoice;

	@Column(name = "uco_collected")
	private Boolean ucoCollected;

	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "workorder_id", nullable = true)
	private WorkOrder workorders;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "volume")
	private String volume;

	public Integer getId() {
		return id;
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

	public WorkOrder getWorkorders() {
		return workorders;
	}

	public void setUcoCollected(Boolean ucoCollected) {
		this.ucoCollected = ucoCollected;
	}

	public void setWorkorders(WorkOrder workorders) {
		this.workorders = workorders;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

}
