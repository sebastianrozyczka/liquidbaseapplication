package pl.sebroz.liquidbaseapplication.services;

import org.springframework.stereotype.Service;
import pl.sebroz.liquidbaseapplication.model.User;
import pl.sebroz.liquidbaseapplication.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User newUser() {
        return new User();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
