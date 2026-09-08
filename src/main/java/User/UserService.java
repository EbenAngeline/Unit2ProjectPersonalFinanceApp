
package User;



import Models.Expense;
import Models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        userRepository.createUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAllUsers();
    }

    public Optional<User> updateUser(Integer id, User userDetails) {
        return userRepository.updateUser(id, userDetails);
    }

    public boolean deleteUser(Integer id) {
        return userRepository.deleteUser(id);
    }
}


