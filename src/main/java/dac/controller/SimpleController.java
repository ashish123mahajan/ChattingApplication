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
	
	//url- http://localhost:9091/signup
	@RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json",consumes="application/json")
	public @ResponseBody User signup(@RequestBody User user) {
		User signUpuser=new User();
		signUpuser.setFname(user.getFname());
		signUpuser.setLname(user.getLname());
		signUpuser.setIs_active(1);
		signUpuser.setPassword(user.getPassword());
		signUpuser.setPhone(user.getPhone());
		signUpuser.setEmail(user.getEmail());
		signUpuser.setStatus(0);
		signUpuser.setIs_active(1);
		return userRepository.save(signUpuser);
	} 
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json",consumes="application/json")
	public @ResponseBody User login(@RequestBody User user) {
		System.out.println("user");
		User authuser=loginService.authenticateUser(user.getEmail(), user.getPassword());
		return authuser;
	}
	
	@RequestMapping(value = "/getMessage", method = RequestMethod.POST, produces = "application/json",consumes="application/json")
	public @ResponseBody String getMessage(@RequestBody Messages messages) {
		
		return "message sent";
	}
}
