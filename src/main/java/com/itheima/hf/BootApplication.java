package com.itheima.hf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 引导类 -->主入口
 */
@SpringBootApplication//添加这个注解的类才叫做 引导类
public class BootApplication {
	public static void main(String[] args) {
		//参数1:引导类的class文件，
		//参数2:args系统及参数
		SpringApplication.run(BootApplication.class,args);
	}
}
