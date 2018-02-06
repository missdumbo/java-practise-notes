package com.codebase.frw.spring.aop;

public class User {
	private Integer age;
	private String name;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		System.out.println("Age : " + age);
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}

	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
}
