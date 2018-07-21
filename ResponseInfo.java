package com.vechicle.inventory.response;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ResponseInfo {
	
	private Boolean isSuccess;
	private String errorMsg;
	private List<?> returnValues;
	
	
	
	public ResponseInfo() {
	}

	
	/**
	 * @param isSuccess
	 * @param errorMsg
	 * @param returnValues
	 */
	public ResponseInfo(Boolean isSuccess, String errorMsg,
			List<?> returnValues) {
		super();
		this.isSuccess = isSuccess;
		this.errorMsg = errorMsg;
		this.returnValues = returnValues;
	}
	/**
	 * @return the isSuccess
	 */
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	/**
	 * @return the returnValues
	 */
	public List<?> getReturnValues() {
		return returnValues;
	}
	/**
	 * @param returnValues the returnValues to set
	 */
	public void setReturnValues(List<?> returnValues) {
		this.returnValues = returnValues;
	}
	
	
	
	

}
