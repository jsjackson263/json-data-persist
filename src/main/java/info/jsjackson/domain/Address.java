/**
 * 
 */
package info.jsjackson.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author josan
 *
 */
@Data
@AllArgsConstructor
@Embeddable
public class Address {

	private String street;
	private String suite;
	private String city;
	private String zipcode;
	
	@Embedded
	private Geo geo;
	
	public Address() {}
}
