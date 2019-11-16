package com.asit.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String getMsg(String name){
		return name;
	}
}
