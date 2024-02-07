package br.com.universelife.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.universelife.course.entities.Order;
import br.com.universelife.course.entities.User;
import br.com.universelife.course.entities.enums.OrderStatus;
import br.com.universelife.course.repository.OrderRepository;
import br.com.universelife.course.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository oRepository;


	@Override
	public void run(String... args) throws Exception {

			User user = new User(null, "matheus lie", "mathes@gmail","588595254445", "55659");
			User user1 = new User(null, "karina lie", "karina@gmail","89552225565", "52357");
			userRepository.saveAll(Arrays.asList(user,user1));
			
			
			Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user,OrderStatus.PAID);
			Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user1,OrderStatus.CANCELED);
			Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user,OrderStatus.PAID);
			oRepository.saveAll(Arrays.asList(o1, o2, o3));
	
		}
}
