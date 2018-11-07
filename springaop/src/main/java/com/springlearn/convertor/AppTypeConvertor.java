package com.springlearn.convertor;

import org.springframework.core.convert.converter.Converter;

import com.springlearn.enums.AppType;

public class AppTypeConvertor implements Converter<String, AppType>{

	@Override
	public AppType convert(String source) {
		if(null == source) {
			return null;
		}
		Integer key = null;
		try {
			key = Integer.parseInt(source);
		} catch (Exception e) {
			
		}
		
		Boolean result = null == key?Boolean.TRUE:Boolean.FALSE;
		
		if(result) {
			return AppType.get(source);
		}
		
		return AppType.get(key);
	}

}
