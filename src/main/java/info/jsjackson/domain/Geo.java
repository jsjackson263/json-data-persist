/**
 * 
 */
package info.jsjackson.domain;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author josan
 *
 */
@Data
@AllArgsConstructor
@Embeddable
public class Geo {

	private String lat;
	private String lng;
	
	
	public Geo() {}
}
