package tryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tryapp.dao.UserDao;
import tryapp.domain.User;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	@Override
	public User addUser(User user) {
		return userDao.createUser(user);
	}

	@Override
	public Optional<User> getUserById(int id) {
		return userDao.findById(id);
	}

}
