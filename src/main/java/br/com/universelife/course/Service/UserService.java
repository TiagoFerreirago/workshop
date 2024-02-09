package br.com.universelife.course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.universelife.course.entities.User;
import br.com.universelife.course.repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User>findAll(){
		List<User>opt = userRepository.findAll();
		return opt;
	}
	
	public User findById(Long id) {
		Optional<User> opt = userRepository.findById(id);
		return opt.get();
		
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
}
