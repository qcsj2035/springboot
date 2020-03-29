package com.itheima.hf.controller;

import com.itheima.hf.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	//获取普通配置
	@Value("${name}")
	private String name;
	//获取对象配置
	@Value("${person.name}")//这里的名称必须和application.yml保持一致
	private String name2;//这里的名字可以随便起
	@Value("${person.user.id}")
	private int id;
	//获取数组配置
	@Value("${teacher[1]}")
	private int age;
//	@Value("${teacher[0]}")
//	private String name1;
	@Value("${msg1}")
	private String msg1;
	@Value("${msg2}")
	private String msg2;

	@Autowired
	private Person person;
	@Autowired
	private Environment env;




	@GetMapping("index")
	//@PostMapping
	//@RequestMapping(value = "index",method = RequestMethod.GET)//请求的方式
	public String hello(){
		System.out.println(name);
		System.out.println(name2);
		System.out.println(id);
		System.out.println(age);
//		System.out.println(name1);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("-------");
		System.out.println(env.getProperty("person.name"));
		System.out.println(env.getProperty("teacher[1]"));
		System.out.println(person);
		return "hello springboot";

	}

}
