package com.mmadapps.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
public class CodeRedUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message = "Name may not be empty")
	private String name;
	@NotNull(message = "gender may not be empty")
	private String gender;
	@NotNull(message = "mobile number may not be empty")
	private String mobileNo;
	@NotNull(message = "requsetAbout may not be empty")
	private String requsetAbout;
	

}
