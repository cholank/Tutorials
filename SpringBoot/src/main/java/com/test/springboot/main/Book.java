/**
 * 
 */
package com.test.springboot.main;

/**
 * @author Cholan
 *
 */
public class Book {
	private int id;
	private String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Book(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
	public Book(){
		
	}

}
