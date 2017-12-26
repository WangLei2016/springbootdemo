package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author sam
 * @since 2017/7/15
 */
@Repository
public class Sam {

    //获取application.properties的属性
    @Value("${com.sam.name}")
    private String name;

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Value("${com.sam.age}")
    private int age;

    @Value("${com.sam.desc}")
    private String desc;
    
    //getter & setter
}