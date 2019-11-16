package com.asit.hello;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller("/hello")
public class HellWorldCtl {
	@Resource(name="helloService")
	HelloService service;
	
	@RequestMapping("/getMsg1")
	public String getMsg1(){
		return service.getMsg("getMsg1");
	}
	@RequestMapping("/getMsg2")
	public String getMsg2(){
		return service.getMsg("getMsg2");
	}
}
