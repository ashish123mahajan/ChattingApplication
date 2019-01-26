package dac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dac.pojo.User;
import dac.repository.UserRepository;

@Service
public class LoginService {

	
	@Autowired
	UserRepository userRepository;
	
	public User authenticateUser(String email,String pass) {
		User user=null;
		user=userRepository.findByEmailAndPassword(email, pass);		
		return user;
		
	}
}
