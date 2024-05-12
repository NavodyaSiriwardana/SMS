package com.sms.dto.common;

public class ResponseDTO {
	
	private String massage;
    private boolean isSucces;
    
    
    
	public ResponseDTO() {
		super();
	}


	public ResponseDTO(String massage, boolean isSucces) {
		super();
		this.massage = massage;
		this.isSucces = isSucces;
	}


	public String getMassage() {
		return massage;
	}


	public void setMassage(String massage) {
		this.massage = massage;
	}


	public boolean isSucces() {
		return isSucces;
	}


	public void setSucces(boolean isSucces) {
		this.isSucces = isSucces;
	}
	
	

}
