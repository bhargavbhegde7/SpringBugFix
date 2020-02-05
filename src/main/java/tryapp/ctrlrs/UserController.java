package tryapp.ctrlrs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tryapp.domain.User;
import tryapp.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
	
	@PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
	
	@GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable("id")Integer id) {
        return userService.getUserById(id);
    }
}
