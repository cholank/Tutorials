/**
 * 
 */
package com.veera.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.veera.model.DBDatas;
import com.veera.service.DBService;

/**
 * @author Cholan
 *
 */
@RestController
public class DBController {
	
	DBService dbService;
	
	@RequestMapping(value="/getStatus", method=RequestMethod.POST)
	public boolean getStatus(@RequestBody DBDatas dbObj) throws Exception{
		return dbService.getStatus(dbObj);		
	}
	
	@RequestMapping(value="/")
	public String getServiceStatus(){
		return "Success";
	}

}
