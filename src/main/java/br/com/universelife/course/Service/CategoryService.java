package br.com.universelife.course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.universelife.course.entities.Category;
import br.com.universelife.course.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository repository;

	public List<Category>findAll(){
		List<Category>list=repository.findAll();
		return list;
	}
	
	public Category findById(Long id) {
		Optional<Category> opt= repository.findById(id);
		return opt.get();
	}
}
