package com.db1.incident.payload;

public class CauseResponse {
	
    private Long id;
    private String cause;
	public Long getId() {
		return id;
	}
	public String getCause() {
		return cause;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
    
}
