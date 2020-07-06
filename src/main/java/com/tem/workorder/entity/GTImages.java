package com.tem.workorder.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Table(name = "clean_status_images")
@Entity
public class GTImages implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6842791736185682752L;

	@Id
	@SequenceGenerator(name = "seq-gen", sequenceName = "workorder_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq-gen")
	@Column(name = "id")
	private Integer id;

	@Column(name = "img_status")
	private Boolean imgStatus;

	@Lob
	@Type(type="org.hibernate.type.BinaryType")
	@Column(name = "image")
	private byte[] imageData;

	@JsonManagedReference
	@JoinColumn(name = "workorder_id", nullable = true)
	@ManyToOne(fetch = FetchType.LAZY)
	private WorkOrder workorders;

	public WorkOrder getWorkorders() {
		return workorders;
	}

	public void setWorkorders(WorkOrder workorders) {
		this.workorders = workorders;
	}

	public Integer getId() {
		return id;
	}

	public Boolean getImgStatus() {
		return imgStatus == null ? false : true;
	}

	public void setImgStatus(Boolean imgStatus) {
		this.imgStatus = imgStatus;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

}
