package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.DriverEntity;

@Repository
public interface DriverRepository extends JpaRepository<DriverEntity, Integer> {
	
	@Query("FROM DRIVER_ENTITY WHERE CREATION_DATE >= 'byDate'")
	List<DriverEntity> findAllDriverQuery(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date byDate );
	
	
	
	

}
