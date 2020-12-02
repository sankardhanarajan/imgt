package com.db1.incident.service;

import com.db1.incident.model.*;
import com.db1.incident.payload.AppResponse;
import com.db1.incident.payload.CauseResponse;
import com.db1.incident.payload.OutageRequest;
import com.db1.incident.payload.PagedResponse;
import com.db1.incident.repository.AppRepository;
import com.db1.incident.repository.CauseRepository;
import com.db1.incident.repository.OutageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

@Service
public class AppService {
	
	@Autowired
	private AppRepository appRepo;
	
	@Autowired
	private CauseRepository causeRepo;
	
	@Autowired
	private OutageRepository outageRepo;

	public PagedResponse<AppResponse> getAllApplications() {
		List<Applications> apps=appRepo.findAll();
		
		AppResponse[] appArray = new AppResponse[apps.size()];
		
		
		for (int i=0; i< apps.size();i++)
		{
			AppResponse tempApp = new AppResponse();
			tempApp.setId(apps.get(i).getId().longValue());
			tempApp.setAppName(apps.get(i).getAppName());
			appArray[i] = tempApp;
		}
	     
		List <AppResponse> appResponses = Arrays.asList(appArray);
		
		return new PagedResponse<>(appResponses);
	}

	public PagedResponse<CauseResponse> getCauses() {
		List<RootCause> causes=causeRepo.findAll();
		
		CauseResponse[] causeArray = new CauseResponse[causes.size()];

		for (int i=0; i< causes.size();i++)
		{
			CauseResponse tempCause = new CauseResponse();
			tempCause.setId(causes.get(i).getId().longValue());
			tempCause.setCause(causes.get(i).getRootCause());
			causeArray[i] = tempCause;
		}
	     
		List <CauseResponse> causeResponses = Arrays.asList(causeArray);
		
		return new PagedResponse<>(causeResponses);
	}

	public void createOutage(OutageRequest outRequest, Long uId) {
		Outage srvOut = new Outage();
		
		srvOut.setUser_id(uId);
		srvOut.setApp_id(outRequest.getApp_id());
		srvOut.setRootcasuse_id(outRequest.getRootcasuse_id());
		srvOut.setDateCreated(outRequest.getDateCreated());
		
		outageRepo.save(srvOut);
	}
	
}
