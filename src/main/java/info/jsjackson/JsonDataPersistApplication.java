package info.jsjackson;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import info.jsjackson.domain.User;
import info.jsjackson.service.UserService;

/**
 *  Reads JSON data from a Spring Boot application, populates it into an H2 database.
 * @author josan
 *
 */
@SpringBootApplication
public class JsonDataPersistApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonDataPersistApplication.class, args);
	}
	
	/**
	 * read in the users.json file,  and map that data to the domain model
	 * @param userService
	 * @return
	 */
	@Bean
	CommandLineRunner runner (UserService userService) {
		return args -> {
			//read the json data, & write to database
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>() {}; 
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
			
			try {
				List<User> users = mapper.readValue(inputStream, typeReference);
				userService.save(users);
				System.out.println("List of users users saved!");
			} catch (IOException e) {
				System.out.println("Unable to successfully save the list of users: " + e.getMessage());
			}
		};
		
	}
}
