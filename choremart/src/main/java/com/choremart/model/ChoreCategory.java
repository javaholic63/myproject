package com.choremart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "CHOREMART", name="chore_categories")
public class ChoreCategory {
	
	
	
	@Id
	@GeneratedValue
	private Long cat_id;
	
	@Column(name="CAT_NAME")
	@NotNull
	private String cat_name;
	
	@OneToMany(mappedBy="choreCategory", cascade=CascadeType.ALL)
	private List<ChoreType> choreType = new ArrayList<ChoreType>();
	
	@Column(name="CAT_DESCRIPTION")
	private String cat_description;
	
	@Column(name="CAT_ADD_DATE")
	private String cat_add_date;
	
	@Column(name="CAT_LCTS")
	private String cat_LCTS;

	public String getCat_add_date() {
		return cat_add_date;
	}

	public String getCat_description() {
		return cat_description;
	}

	public Long getCat_id() {
		return cat_id;
	}

	public String getCat_LCTS() {
		return cat_LCTS;
	}

	public String getCat_name() {
		return cat_name;
	}

	public List<ChoreType> getChoreType() {
		return choreType;
	}

	public void setCat_add_date(String cat_add_date) {
		this.cat_add_date = cat_add_date;
	}

	public void setCat_description(String cat_description) {
		this.cat_description = cat_description;
	}

	public void setCat_id(Long cat_id) {
		this.cat_id = cat_id;
	}

	public void setCat_LCTS(String cat_LCTS) {
		this.cat_LCTS = cat_LCTS;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public void setChoreType(List<ChoreType> choreType) {
		this.choreType = choreType;
	}
	
	
}
