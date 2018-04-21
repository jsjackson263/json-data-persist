/**
 * 
 */
package info.jsjackson.service;

import java.util.List;

import org.springframework.stereotype.Service;

import info.jsjackson.domain.User;
import info.jsjackson.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

/**
 * @author josan
 *
 */
@Service
@Slf4j
public class UserService {

	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Iterable<User> list() {
		return userRepository.findAll();
	}
	
	/**
	 * takes a list of users and saves them all at once.
	 * @param users
	 * @return users
	 */
	public Iterable<User> save(List<User> users) {
		//return userRepository.save(users);
		log.debug("Saving the following users: " + users.toString());
		return userRepository.saveAll(users);
		
	}
}
