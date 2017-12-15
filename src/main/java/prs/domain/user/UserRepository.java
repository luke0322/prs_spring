package prs.domain.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByUserNameAndPassword(String uname, String pwd);
}