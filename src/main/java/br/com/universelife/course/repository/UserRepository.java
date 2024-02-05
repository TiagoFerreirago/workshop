package br.com.universelife.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.universelife.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
