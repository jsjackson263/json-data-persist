/**
 * 
 */
package info.jsjackson.service;

import java.util.List;

import org.springframework.stereotype.Service;

import info.jsjackson.domain.User;
import info.jsjackson.repository.UserRepository;

/**
 * @author josan
 *
 */
@Service
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
		return userRepository.save(users);
		
	}
}
