package com.carlos.avisamedelcoche.rs.filters;

public class ErrorMessage {

	private String error;
	
	public ErrorMessage(){
		
	}
	
	public ErrorMessage(String error){
		this.setError(error);
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
}
