package br.com.universelife.course.Service;

import java.util.List;
import java.util.Optional;

import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.universelife.course.Service.exception.resourcenotfoundexception.DatabaseException;
import br.com.universelife.course.Service.exception.resourcenotfoundexception.ResourceNotFoundException;
import br.com.universelife.course.entities.User;
import br.com.universelife.course.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User>findAll(){
		List<User>opt = userRepository.findAll();
		return opt;
	}
	@Transactional
	public User findById(Long id) {
		Optional<User> opt = userRepository.findById(id);
		return opt.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	@Transactional
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	@Transactional
	public void delete(Long id) {
		try {
		userRepository.deleteById(id);
	}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	@Transactional
	public User update(Long id, User obj) {
		try {
		User entity = userRepository.getReferenceById(id);
		updateUser(entity, obj);
		return userRepository.save(entity);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}
	
	private void updateUser(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}
