package com.bridgelabz.restapicall;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
/*
 * @RestController:to create the rest controller class.
 * @RequestMapping:describe the URL.
 * @RequestParam:to pass the value as parameter.
 */
public class HelloRestController {
	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello from BridgeLabz";
	}
	 @RequestMapping(value={"/query"}, method=RequestMethod.GET)
	    public String sayHello(@RequestParam(value="name") String name) {
	        return "Hello" + name + "From Bridgelabz";
	    }
	  @GetMapping("/param/{name}")
	    public String sayHelloParam(@PathVariable String name) {
	        return "Hello " + name + " From Bridgelabz";
	    }
}