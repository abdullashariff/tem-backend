package com.tem.workorder.dto;

import java.io.Serializable;

public class WOResponseDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8632910404781320899L;
	
	private Integer responseCode;
	private String responseMsg;
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

}
