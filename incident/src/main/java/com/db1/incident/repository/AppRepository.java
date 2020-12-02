package com.db1.incident.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1.incident.model.Applications;


public interface AppRepository extends JpaRepository<Applications, Long>  {

	
}
