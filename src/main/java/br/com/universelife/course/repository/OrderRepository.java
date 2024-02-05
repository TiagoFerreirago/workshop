package br.com.universelife.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.universelife.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
