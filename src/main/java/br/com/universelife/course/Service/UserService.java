package br.com.universelife.course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.universelife.course.Service.exception.resourcenotfoundexception.ResourceNotFoundException;
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
		return opt.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = userRepository.getReferenceById(id);
		updateUser(entity, obj);
		return userRepository.save(entity);
	}

	private void updateUser(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}
