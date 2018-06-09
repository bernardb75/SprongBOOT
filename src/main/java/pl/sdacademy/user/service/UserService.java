package pl.sdacademy.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sdacademy.user.entity.User;
import pl.sdacademy.user.repository.UserRepository;

@Service
public class UserService  {

    private  final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public User createUser(String name, String surname, String email){
        return null;
    }
}
