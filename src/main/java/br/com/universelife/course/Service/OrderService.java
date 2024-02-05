package br.com.universelife.course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.universelife.course.entities.Order;
import br.com.universelife.course.entities.User;
import br.com.universelife.course.repository.OrderRepository;
import br.com.universelife.course.repository.UserRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order>findAll(){
		List<Order>list = orderRepository.findAll();
		return list;
	}
	
	public Order findById(Long Id) {
		Optional<Order> opt = orderRepository.findById(Id);
		return opt.get();
	}
}
