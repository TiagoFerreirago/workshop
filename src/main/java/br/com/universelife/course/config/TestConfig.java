package br.com.universelife.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.universelife.course.entities.User;
import br.com.universelife.course.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

			User user = new User(null, "matheus lie", "mathes@gmail","588595254445", "55659");
			User user1 = new User(null, "karina lie", "karina@gmail","89552225565", "52357");
			userRepository.saveAll(Arrays.asList(user,user1));
	
		}
}
