package dac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dac.pojo.User;
import dac.repository.UserRepository;

@RestController
public class SimpleController {

	@Autowired
	UserRepository userRepository;
	
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
}
