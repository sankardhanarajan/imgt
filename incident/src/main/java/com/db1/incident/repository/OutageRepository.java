package com.db1.incident.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1.incident.model.Outage;


public interface OutageRepository extends JpaRepository<Outage, Long>  {

	
}
