package com.db1.incident.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db1.incident.model.Applications;
import com.db1.incident.model.RootCause;


public interface CauseRepository extends JpaRepository<RootCause, Long>  {

	
}
