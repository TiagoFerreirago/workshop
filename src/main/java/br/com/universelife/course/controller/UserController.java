package br.com.universelife.course.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.universelife.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User>findall(){
		User user = new User(1L, "Bruno", "Bruno@gmail.com", "84955-54552", "1234");
		return ResponseEntity.ok().body(user);
	}
}
