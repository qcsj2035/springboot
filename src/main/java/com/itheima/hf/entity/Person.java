package com.itheima.hf.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
	private String name;
	private Integer age;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static class   User  implements Serializable {
		private String sex;
		private int id;

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		 @Override
		 public String toString() {
			 return "User{" +
					 "sex='" + sex + '\'' +
					 ", id=" + id +
					 '}';
		 }
	 }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", user=" + user +
				'}';
	}
}
