package com.springlearn.dto;

import java.io.Serializable;

import com.springlearn.enums.AppType;

public class ParamDTO  implements Serializable{

	private String name;
	
	private String address;

	
	private AppType appType;
	
	
	
	public AppType getAppType() {
		return appType;
	}

	public void setAppType(AppType appType) {
		this.appType = appType;
	}

	public ParamDTO(String name,String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
