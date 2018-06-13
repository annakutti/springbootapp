/**
 * 
 */
package com.sanya.springboot.sample.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sanya Varghese
 *
 */
@RestController
public class HelloWorldController {

	@GetMapping("/springboot/hello")
	public String sayHello(){
		return "Hello World - from Spring boot APP";
	}
}
