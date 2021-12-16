package com.bridgelabz.restapicall;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.restapicall.controller.User;

@RestController
@RequestMapping("/hello")
/*
 * @RestController:to create the rest controller class.
 * @RequestMapping:describe the URL.
 * @RequestParam:to pass the value as parameter.
 * @GetMapping:to get the name as a parameter.
 * @PostMpping:to post the first name and last name as parameter
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

		@PostMapping("/post")
		public String postData(@RequestBody User user) {
			return "Hello " + user.getFirstName() + " " + user.getLastName();	
		}
		@PutMapping("/put/{firstname}")
		public String putData(@PathVariable String firstname, @RequestParam(value="lastname") String lasttname) {
			return "Hello " + firstname +" "+ lasttname;
		}
}
