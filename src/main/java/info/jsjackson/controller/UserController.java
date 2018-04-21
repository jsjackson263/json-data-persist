/**
 * 
 */
package info.jsjackson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.jsjackson.domain.User;
import info.jsjackson.service.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author josan
 *
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/list")
	public Iterable<User> list() {
		Iterable<User> userList = userService.list();
		log.debug("Saving the following users: " + userList.toString());
		return userList;
	}
}
