package br.com.universelife.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.universelife.course.entities.Category;
import br.com.universelife.course.entities.Order;
import br.com.universelife.course.entities.Product;
import br.com.universelife.course.entities.User;
import br.com.universelife.course.entities.enums.OrderStatus;
import br.com.universelife.course.repository.CategoryRepository;
import br.com.universelife.course.repository.OrderRepository;
import br.com.universelife.course.repository.ProductRepository;
import br.com.universelife.course.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository oRepository;
	
	@Autowired
	private CategoryRepository catRepository;
	
	@Autowired
	private ProductRepository prodRepository;


	@Override
	public void run(String... args) throws Exception {

			Category cat1 = new Category(null, "Electronics");
			Category cat2 = new Category(null, "Books");
			Category cat3 = new Category(null, "Computers");
			catRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
			User user = new User(null, "matheus lie", "mathes@gmail","588595254445", "55659");
			User user1 = new User(null, "karina lie", "karina@gmail","89552225565", "52357");
			userRepository.saveAll(Arrays.asList(user,user1));
			
			Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
			Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
			Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
			Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
			Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
			prodRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
			
			Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user,OrderStatus.PAID);
			Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user1,OrderStatus.CANCELED);
			Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user,OrderStatus.PAID);
			oRepository.saveAll(Arrays.asList(o1, o2, o3));
	
		}
}
