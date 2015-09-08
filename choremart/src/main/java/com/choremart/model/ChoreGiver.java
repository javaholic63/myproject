package com.choremart.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class ChoreGiver {
	
	@Id
	@GeneratedValue
	private Long giver_id;
	
	@Column(name="GIVER_ADDRESS")
	@NotNull
	private Address address;
	
	@Column(name="GIVER_PHONE")
	@NotNull
	private String phone;
	
	@Column(name="GIVER_EMAIL_ADDRESS")
	@NotNull
	private String email;

}
