package com.db1.incident.payload;

import java.sql.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * Created by SathyaDasan.
 */
public class OutageRequest {
    @NotBlank
    @Valid
    private Long app_id;

    @NotBlank
    @Valid
    private Long rootcasuse_id;
    
   @NotBlank
   @Valid
   private Date dateCreated;

public Long getApp_id() {
	return app_id;
}

public Long getRootcasuse_id() {
	return rootcasuse_id;
}

public Date getDateCreated() {
	return dateCreated;
}

public void setApp_id(Long app_id) {
	this.app_id = app_id;
}

public void setRootcasuse_id(Long rootcasuse_id) {
	this.rootcasuse_id = rootcasuse_id;
}

public void setDateCreated(Date dateCreated) {
	this.dateCreated = dateCreated;
}

    
}
