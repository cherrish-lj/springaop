package com.springlearn;

public class SingtonTest {

	public void syso(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		//枚举单列调用实列
		Sing.SingtonTest.syahello("枚举单列调Demo");
		//静态内部类
		SingtonTest.getInstance().syso("静态内部类单列DEMO");
		
		long[] dd = new long[1];
		System.out.println(dd.length);
	}
	
	//静态内部类实现懒汉单列
    private static class SingletonHolder {  
    	private static final SingtonTest INSTANCE = new SingtonTest();  
    }  
    
    private SingtonTest (){
    	
    }  
    
    public static final SingtonTest getInstance() {  
    	return SingletonHolder.INSTANCE;  
    } 
}
