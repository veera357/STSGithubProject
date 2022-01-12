package com.example.demo.entity;

//import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity(name ="DRIVER_ENTITY")
@Table
@Data
public class DriverEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driverId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
    private Date creationDate;
	@PrePersist
	private void onCreate() {
		creationDate = new Date();
	}
	
	   
	@Column
	private String firstName;
	
	@Column
	private String lasttName;
	
	@Column
	private String dateofBirth;
	//private String creationDate;
    
	
	public Integer getDriverId() {
		return driverId;
	}
	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "DriverEntity [driverId=" + driverId + ", creationDate=" + creationDate + ", firstName=" + firstName
				+ ", lasttName=" + lasttName + ", dateofBirth=" + dateofBirth + "]";
	}
	public DriverEntity(Integer driverId, Date creationDate, String firstName, String lasttName, String dateofBirth) {
		super();
		this.driverId = driverId;
		this.creationDate = creationDate;
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.dateofBirth = dateofBirth;
	}
	public DriverEntity() {
		// TODO Auto-generated constructor stub
	}
	

	
	
	
}
