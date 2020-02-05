package tryapp.service;

import org.springframework.stereotype.Service;
import tryapp.domain.User;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
	public List<User> getUsers();
	public User addUser(User user);
	public Optional<User> getUserById(int id);
}
