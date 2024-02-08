package br.com.universelife.course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.universelife.course.entities.Product;
import br.com.universelife.course.repository.ProductRepository;
import jakarta.transaction.Transactional;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		List<Product> pdt = productRepository.findAll();
		return pdt;
	}
	
	public Product findById(Long id) {
		Optional<Product> opt = productRepository.findById(id);
		return opt.get();
	}
}
