/**
 * 
 */
package info.jsjackson.domain;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/** All data will be stored in one single user table for simplicity
 * 
 * @author josan
 *
 */
@Data
@AllArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;
	private String name;
	private String username;
	private String email;
	private String phone;
	private String website;
	
	@Embedded
	private Address address;
	@Embedded
	private Company company;
	
	public User() {}
	
}
