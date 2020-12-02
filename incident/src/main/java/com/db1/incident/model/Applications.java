package com.db1.incident.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "D_APPLICATION_HEALTH", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "id"
        })
})

public class Applications {

	@Id
	private Long id;
	
	@NotBlank
    @Size(max = 45)
    private String appName;
	
    @Size(max = 45)
    private String subAppName;
    
    public Applications() {

    }
    
	public Applications(Long id, String appName, String subAppName) {
		super();
		this.id = id;
		this.appName = appName;
		this.subAppName = subAppName;
	}

	public Long getId() {
		return id;
	}

	public String getAppName() {
		return appName;
	}

	public String getSubAppName() {
		return subAppName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setSubAppName(String subAppName) {
		this.subAppName = subAppName;
	}
	
	
	
    
}
