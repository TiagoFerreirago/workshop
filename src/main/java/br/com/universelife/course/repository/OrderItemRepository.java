package br.com.universelife.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.universelife.course.entities.Order;
import br.com.universelife.course.entities.OrderItem;
import br.com.universelife.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
