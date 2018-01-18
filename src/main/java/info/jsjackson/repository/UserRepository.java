/**
 * 
 */
package info.jsjackson.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import info.jsjackson.domain.User;

/**
 * @author josan
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
