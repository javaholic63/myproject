package com.choremart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="chore_type")
public class ChoreType {
	
	@Id
	@GeneratedValue
	@Column(name="TYPE_ID")
	private Long type_id;
	
	@Column(name="TYPE_ID")
	private Long tyoe_id;
	
	@Column(name="TYPE_NAME")
	private String type_name;
	
	@ManyToOne
	private ChoreCategory choreCategory;
	
	@Column(name="TYPE_DESCRIPTION")
	private String type_description;
	
	@Column(name="TYPE_ADD_DATE")
	private String type_add_date;
	
	@Column(name="TYPE_LCTS")
	private String type_LCTS;

	public ChoreCategory getChoreCategory() {
		return choreCategory;
	}

	public Long getTyoe_id() {
		return tyoe_id;
	}

	public String getType_add_date() {
		return type_add_date;
	}

	public String getType_description() {
		return type_description;
	}

	public Long getType_id() {
		return type_id;
	}

	public String getType_LCTS() {
		return type_LCTS;
	}

	public String getType_name() {
		return type_name;
	}

	public void setChoreCategory(ChoreCategory choreCategory) {
		this.choreCategory = choreCategory;
	}

	public void setTyoe_id(Long tyoe_id) {
		this.tyoe_id = tyoe_id;
	}

	public void setType_add_date(String type_add_date) {
		this.type_add_date = type_add_date;
	}

	public void setType_description(String type_description) {
		this.type_description = type_description;
	}

	public void setType_id(Long type_id) {
		this.type_id = type_id;
	}

	public void setType_LCTS(String type_LCTS) {
		this.type_LCTS = type_LCTS;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	
	
	

}
