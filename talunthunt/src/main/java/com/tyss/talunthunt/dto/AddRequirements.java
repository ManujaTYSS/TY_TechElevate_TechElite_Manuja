package com.tyss.talunthunt.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="add_requirements")

public class AddRequirements {
	@Id	
	@GenericGenerator(name = "string_based_custom_sequence", strategy = "com.tyss.talunthunt.dto.RequirementIdGenerator")
	@GeneratedValue(generator="string_based_custom_sequence")
	private String clientId;
	@Column(name="client_name")
	private String client;
	@Column(name="technology")
	private String technology;
	@Column(name="year_of_Experience")
	private double yoe;
	@Column(name="client_location")
	private String location;
	@Column(name="no_Of_positions")
	private int nop;
	@Column(name="opening_date")
	private Date odate;
	@Column(name="closing_date")
	private Date cdate;
	@Column(name="role")
	private String role;
	@Column(name="rate")
	private double rate;
	@Column(name="client_contactperson")
	private String contact;
	@Column(name="job_description")
	private String jd;
	
	
	
	
	

}
