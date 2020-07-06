package com.tem.workorder.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class WorkOrderDTO extends WOResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2903565106559223683L;
	
	private Integer workorderId;
	
	private String orderId;

	private Integer actualCleaningNo;

	private Integer actualGreaceQty;

	private String cleaningComponay;

	private String cleaningStatus;

	private LocalDate completedDate;

	private String createdBy;

	private LocalDate createdDate;

	private String endDate;

	private String expectedGreacyQty;

	private Integer fogPercentage;

	private String gtSize;

	private String gtInstalled;

	private String gtInvoice;

	private String priority;

	private String remarks;

	private LocalDate reportedDate;

	private LocalDate scheduleEndDate;

	private LocalDate scheduleStartDate;

	private LocalDate startDate;

	private String updatedBy;

	private LocalDate updatedDate;

	private String waterSource;

	private String workClass;

	private BusinessDTO business;

	private UCODTO uco;

	//@JsonIgnore
	private List<GTImagesDTO> gtImages;
	
	private Integer expectedGreaceQty;

	public String getOrderId() {
		return orderId;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getExpectedGreacyQty() {
		return expectedGreacyQty;
	}

	public Integer getFogPercentage() {
		return fogPercentage;
	}

	public Integer getExpectedGreaceQty() {
		return expectedGreaceQty;
	}

	public void setExpectedGreaceQty(Integer expectedGreaceQty) {
		this.expectedGreaceQty = expectedGreaceQty;
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

	public String getUpdatedBy() {
		return updatedBy;
	}

	public String getWaterSource() {
		return waterSource;
	}

	public String getWorkClass() {
		return workClass;
	}

	public BusinessDTO getBusiness() {
		return business;
	}

	public UCODTO getUco() {
		return uco;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getActualCleaningNo() {
		return actualCleaningNo;
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

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setExpectedGreacyQty(String expectedGreacyQty) {
		this.expectedGreacyQty = expectedGreacyQty;
	}

	public void setFogPercentage(Integer fogPercentage) {
		this.fogPercentage = fogPercentage;
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

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getCompletedDate() {
		return completedDate;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public LocalDate getReportedDate() {
		return reportedDate;
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

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setCompletedDate(LocalDate completedDate) {
		this.completedDate = completedDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public void setReportedDate(LocalDate reportedDate) {
		this.reportedDate = reportedDate;
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

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<GTImagesDTO> getGtImages() {
		return gtImages;
	}

	public void setGtImages(List<GTImagesDTO> gtImages) {
		this.gtImages = gtImages;
	}

	public void setWaterSource(String waterSource) {
		this.waterSource = waterSource;
	}

	public void setWorkClass(String workClass) {
		this.workClass = workClass;
	}

	public void setBusiness(BusinessDTO business) {
		this.business = business;
	}

	public void setUco(UCODTO uco) {
		this.uco = uco;
	}

	public Integer getWorkorderId() {
		return workorderId;
	}

	public void setWorkorderId(Integer workorderId) {
		this.workorderId = workorderId;
	}

}
