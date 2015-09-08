package com.choremart.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="chore_order")
public class ChoreOrder {
	
	
	@Id
	@GeneratedValue
	private Long order_id;
	
	@Column(name="ORDER_BY")
	@NotNull
	private ChoreGiver orderBy;
	
	@Column(name="ORDER_TITLE")
	@NotNull
	private String title;
	
	@Column(name="CHORE_TYPE")
	@NotNull
	private ChoreType choreType;
	
	@Column(name="CHORE_CAT")
	@NotNull
	private ChoreType choreCategory;
	
	@Column(name="CHORE_ORDER_TITLE")
	@NotNull
	private String orderTitle;
	
	@Column(name="CHORE_ORDER_DETAILS")
	@NotNull
	private String orderDetails;
	
	@Column(name="CHORE_ORDER_ADDRESS")
	@NotNull
	private Address address;
	
	@Column(name="CHORE_ORDER_DATE")
	@NotNull
	Date startDate;
	
	@Column(name="CHORE_ORDER__END_DATE")
	@NotNull
	Date endDate;
	
	@Column(name="CHORE_ORDER_DURATION")
	@NotNull
	String duration;
	
	@Column(name="CHORE_ORDER_NOTES")
	String notes;

}
