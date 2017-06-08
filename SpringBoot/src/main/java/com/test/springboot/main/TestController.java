/**
 * 
 */
package com.test.springboot.main;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


/**
 * @author Cholan
 *
 */
@RestController
@EnableAutoConfiguration
public class TestController {
	@RequestMapping("/tester")
	public String tester(){
	return "Success test ";	
	}

}
