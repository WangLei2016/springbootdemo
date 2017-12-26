package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Sam;

/**
 * @author sam
 * @since 2017/7/14
 */
@RestController
@RequestMapping
public class IndexController {
	@Autowired
	
    private Sam sam;

    @RequestMapping("/index")
    public String index() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~``"+sam.getName() + " " + sam.getAge() + " " + sam.getDesc());

        return "index";
    }

}