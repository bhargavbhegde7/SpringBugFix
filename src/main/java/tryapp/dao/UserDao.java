package tryapp.dao;

import org.springframework.stereotype.Service;
import tryapp.domain.User;

import java.util.List;
import java.util.Optional;

@Service
public interface UserDao {
	List<User> getUsers();
	User createUser(User user);
    Optional<User> findById(int id);
}
