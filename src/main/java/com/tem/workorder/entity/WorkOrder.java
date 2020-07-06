package com.tem.workorder.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Table(name = "workorders")
@Entity
public class WorkOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2903565106559223683L;
	
	@Id
	@SequenceGenerator(name="seq-gen", sequenceName="workorder_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="seq-gen")
	@Column(name="workorder_id", insertable = true, updatable = false)
	private Integer workorderId;
	
	@JsonBackReference
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "workorders", cascade = {CascadeType.MERGE, CascadeType.PERSIST,CascadeType.ALL}, orphanRemoval = true)
	private Business business;
	
	@JsonBackReference
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "workorders", cascade = CascadeType.ALL, orphanRemoval = true)
	private UCO uco;
	
	@JsonBackReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workorders", cascade = {CascadeType.MERGE, CascadeType.PERSIST,CascadeType.ALL}, orphanRemoval = true)
	private List<GTImages> gtImages;

	@Column(name = "actual_cln_no")
	private Integer actualCleaningNo;

	@Column(name = "actual_greace_qty")
	private Integer actualGreaceQty;

	@Column(name = "cleaning_company")
	private String cleaningComponay;

	@Column(name = "cleaning_status")
	private String cleaningStatus;

	@Column(name = "completed_date")
	private LocalDate completedDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	@Column(name = "expected_greace_qty")
	private Integer expectedGreaceQty;

	@Column(name = "fog_percent_per_month")
	private Integer fogPercentage;

	@Column(name = "greace_trap_size")
	private String gtSize;

	@Column(name = "gt_installed")
	private String gtInstalled;

	@Column(name = "gt_invoice")
	private String gtInvoice;

	@Column(name = "priority")
	private String priority;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "reported_date")
	private LocalDate reportedDate;
	
	@Column(name = "reported_to")
	private String reportedTo;

	@Column(name = "schedule_end_date")
	private LocalDate scheduleEndDate;

	@Column(name = "schedule_start_date")
	private LocalDate scheduleStartDate;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_date")
	private LocalDate updatedDate;

	@Column(name = "water_source")
	private String waterSource;

	@Column(name = "workclasss")
	private String workClass;

	public Integer getActualCleaningNo() {
		return actualCleaningNo;
	}

	public Integer getActualGreaceQty() {
		return actualGreaceQty;
	}

	public String getCleaningComponay() {
		return cleaningComponay;
	}

	public String getCleaningStatus() {
		return cleaningStatus;
	}

	public LocalDate getCompletedDate() {
		return completedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public Integer getFogPercentage() {
		return fogPercentage;
	}

	public String getGtSize() {
		return gtSize;
	}

	public void setGtSize(String gtSize) {
		this.gtSize = gtSize;
	}

	public String getGtInstalled() {
		return gtInstalled;
	}

	public String getGtInvoice() {
		return gtInvoice;
	}

	public String getPriority() {
		return priority;
	}

	public String getRemarks() {
		return remarks;
	}

	public LocalDate getReportedDate() {
		return reportedDate;
	}

	public String getReportedTo() {
		return reportedTo;
	}

	public LocalDate getScheduleEndDate() {
		return scheduleEndDate;
	}

	public LocalDate getScheduleStartDate() {
		return scheduleStartDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public String getWaterSource() {
		return waterSource;
	}

	public String getWorkClass() {
		return workClass;
	}

	public Integer getWorkorderId() {
		return workorderId;
	}

	public void setWorkorderId(Integer workorderId) {
		this.workorderId = workorderId;
	}

	public void setActualCleaningNo(Integer actualCleaningNo) {
		this.actualCleaningNo = actualCleaningNo;
	}

	public void setActualGreaceQty(Integer actualGreaceQty) {
		this.actualGreaceQty = actualGreaceQty;
	}

	public void setCleaningComponay(String cleaningComponay) {
		this.cleaningComponay = cleaningComponay;
	}

	public void setCleaningStatus(String cleaningStatus) {
		this.cleaningStatus = cleaningStatus;
	}

	public void setCompletedDate(LocalDate completedDate) {
		this.completedDate = completedDate;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Integer getExpectedGreaceQty() {
		return expectedGreaceQty;
	}

	public void setExpectedGreaceQty(Integer expectedGreaceQty) {
		this.expectedGreaceQty = expectedGreaceQty;
	}

	public void setFogPercentage(Integer fogPercentage) {
		this.fogPercentage = fogPercentage;
	}

	public void setGtInstalled(String gtInstalled) {
		this.gtInstalled = gtInstalled;
	}

	public void setGtInvoice(String gtInvoice) {
		this.gtInvoice = gtInvoice;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setReportedDate(LocalDate reportedDate) {
		this.reportedDate = reportedDate;
	}

	public void setReportedTo(String reportedTo) {
		this.reportedTo = reportedTo;
	}

	public void setScheduleEndDate(LocalDate scheduleEndDate) {
		this.scheduleEndDate = scheduleEndDate;
	}

	public void setScheduleStartDate(LocalDate scheduleStartDate) {
		this.scheduleStartDate = scheduleStartDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setWaterSource(String waterSource) {
		this.waterSource = waterSource;
	}

	public void setWorkClass(String workClass) {
		this.workClass = workClass;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public UCO getUco() {
		return uco;
	}

	public List<GTImages> getGtImages() {
		return gtImages;
	}

	public void setGtImages(List<GTImages> gtImages) {
		this.gtImages = gtImages;
	}

	public void setUco(UCO uco) {
		this.uco = uco;
	}

}
