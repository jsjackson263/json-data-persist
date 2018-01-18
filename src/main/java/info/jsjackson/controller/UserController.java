/**
 * 
 */
package info.jsjackson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.jsjackson.domain.User;
import info.jsjackson.service.UserService;

/**
 * @author josan
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/list")
	public Iterable<User> list() {
		return userService.list();
	}
}
