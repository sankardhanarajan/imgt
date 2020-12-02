package com.db1.incident.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "D_APPLICATION_OUTAGE", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "id"
        })
})
public class RootCause {
	@Id
	private Long id;
	
	@NotBlank
    @Size(max = 45)
    private String rootCause;

	public RootCause() {

	}

	public RootCause(Long id, String rootCause) {
		this.id = id;
		this.rootCause = rootCause;
	}

	public Long getId() {
		return id;
	}

	public String getRootCause() {
		return rootCause;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}

	


}
