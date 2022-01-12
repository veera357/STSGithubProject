package com.example.demo.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.DriverEntity;
import com.example.demo.repository.DriverRepository;

@Service
@Component
public class DriverService {

	@Autowired
	private DriverRepository driverRepository;

	public DriverEntity saveDriver(DriverEntity driverEntity) {
		
		System.out.println(driverEntity.getDriverId());
		System.out.println(driverEntity.getFirstName());
		System.out.println(driverEntity.getLasttName());
		System.out.println(driverEntity.getDateofBirth());
		System.out.println(driverEntity.getCreationDate());
		
		
		return driverRepository.save(driverEntity);
	}

	public List<DriverEntity> saveDrivers(List<DriverEntity> driverEntity) {
		
		return driverRepository.saveAll(driverEntity);
	}

	public List<DriverEntity> getAllDriverDetails() {
		
		return driverRepository.findAll();
	}

	public List<DriverEntity> getAllDriverDetailsByDate( Date byDate) {
		
		//List<DriverEntity> driverList = null;
				
		//driverList = driverList.stream().filter(e -> e.getCreationDate().after(byDate))
           //     .collect(Collectors.toList());
		
		/*
		 * driverList = driverRepository.fin stream().filter(e ->
		 * e.getCreationDate().after(byDate)) .collect(Collectors.toList());
		 */
				
		return driverRepository.findAllDriverQuery(byDate);
	}

	

	
	
	
}
