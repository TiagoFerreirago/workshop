package br.com.universelife.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.universelife.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
