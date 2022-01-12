package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DriverEntity;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping("/driver")
@Component
public class DriverController {

	@Autowired
	public DriverService driverService;
	
	@PostMapping("/create")
	public DriverEntity saveDriver(@RequestBody DriverEntity driverEntity) {
		return driverService.saveDriver(driverEntity);
	}
	
	@GetMapping("/drivers")
	public List<DriverEntity> getAllDriverDetails(){
		return driverService.getAllDriverDetails();
	}
		
	@GetMapping("testDate")
	public List<DriverEntity> testDate(
			@RequestParam("byDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date byDate) {
		return driverService.getAllDriverDetailsByDate(byDate);
		
		//@RequestParam("date") @DateTimeFormat(pattern="yyyy.MM.dd") Date date,
		//@RequestParam("localdate") @DateTimeFormat(pattern="yyyy.MM.dd") LocalDate localdate, 
		//@RequestParam("localdatetime") @DateTimeFormat(pattern="yyyy.MM.dd HH:mm:ss") LocalDateTime localdatetime) {
}
}
	
	