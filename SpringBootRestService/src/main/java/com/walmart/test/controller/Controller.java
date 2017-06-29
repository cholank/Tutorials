/**
 * 
 */
package com.walmart.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.test.model.Student;

/**
 * @author vekal1
 * 
 */
@RestController
public class Controller {

	@RequestMapping("/list")
	public List<String> viewHome() {
		List<String> list = new ArrayList<String>();
		list.add("String1");
		list.add("String2");
		return list;
	}

	@RequestMapping("/")
	public String test() {
		return "REST Service DEMO..!";
	}
		
	@RequestMapping("/getStds")
	public List<Student> getStd() {
		Student std1 = new Student(1, "name1", "std1");
		Student std2 = new Student(2, "name2", "std2");
		Student std3 = new Student(3, "name2", "std3");
		List<Student> list = new ArrayList<Student>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		return list;
	}
}
