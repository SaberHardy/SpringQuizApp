package com.quizapp.quizapp.services;

import com.quizapp.quizapp.models.QuizAttempts;
import com.quizapp.quizapp.models.User;
import com.quizapp.quizapp.repositories.QuizAttemptsRepository;
import com.quizapp.quizapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllQuizAttempts() {
        return userRepository.findAll();
    }

    public User getQuizAttemptsById(Long id) {
        return userRepository.findById(id).orElse(new User());
    }

    public User saveQuizAttempts(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
