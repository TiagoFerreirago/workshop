package br.com.universelife.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.universelife.course.entities.Category;
import br.com.universelife.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
