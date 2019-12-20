package com.asit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("name")
	private String name;
	@Override
	public String toString() {
		return "姓名："+name;
	}
}
