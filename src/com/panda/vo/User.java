package com.panda.vo;

import java.io.Serializable;
/*
* @author MrC
* @date 2016年9月20日下午12:09:41
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class User implements Serializable{
	private String name ; 
	private int age;
	private Tel tel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Tel getTel() {
		return tel;
	}
	public void setTel(Tel tel) {
		this.tel = tel;
	}
}
