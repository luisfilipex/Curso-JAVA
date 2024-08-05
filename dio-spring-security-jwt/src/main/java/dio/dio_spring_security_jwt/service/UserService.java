package dio.dio_spring_security_jwt.service;

import dio.dio_spring_security_jwt.model.User;
import dio.dio_spring_security_jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }
}
