package dac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dac.pojo.Messages;
import dac.pojo.User;
import dac.repository.UserRepository;
import dac.services.LoginService;

@RestController
public class SimpleController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LoginService loginService;
	
	//url- http://localhost:9091/hello
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello controller is working");
		User user=new User();
		user.setFname("Ashish");
		user.setLname("Mahajan");
		user.setIs_active(1);
		user.setPassword("ashish");
		user.setPhone("7588647455");
		user.setEmail("ash.n.mahajan@gmail.com");
		userRepository.save(user);
		return "hello spring-boot";
	} 
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json",consumes="application/json")
	public @ResponseBody User login(@RequestBody User user) {
		System.out.println("user");
		User authuser=loginService.authenticateUser(user.getEmail(), user.getPassword());
		return authuser;
	}
	
	@RequestMapping(value = "/msg/{userId}", method = RequestMethod.POST)
	public String message(@PathVariable("userId") long UserId,@RequestBody Messages messages) {
		
		return "message sent";
	}
}
