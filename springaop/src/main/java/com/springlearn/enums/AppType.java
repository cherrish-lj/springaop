package com.springlearn.enums;

public enum AppType {
	
	
	APP(1,"app"),
	IOS(2,"app")
	;
	
	
	
	private int index;
	private String name;
	
	private AppType() {}
	
	private AppType(int index,String name) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public static AppType get(int index) {
		
		for(AppType t : AppType.values()) {
			if(t.index == index) {
				return t;
			}
		}
		return null;
	}
	public static AppType get(String index) {
		
		for(AppType t : AppType.values()) {
			if(t.name().equals(index) ) {
				return t;
			}
		}
		return null;
	}
}
