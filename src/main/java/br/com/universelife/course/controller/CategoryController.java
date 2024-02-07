package br.com.universelife.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.universelife.course.Service.CategoryService;
import br.com.universelife.course.Service.OrderService;
import br.com.universelife.course.Service.UserService;
import br.com.universelife.course.entities.Category;
import br.com.universelife.course.entities.Order;
import br.com.universelife.course.entities.User;

@RestController
@RequestMapping(value = "/orders")
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@GetMapping()
	public ResponseEntity<List<Category>>findAll(){
		List<Category>list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category>findById(@PathVariable Long id){
		Category cat = service.findById(id);
		return ResponseEntity.ok().body(cat);
	}
	
	
}
