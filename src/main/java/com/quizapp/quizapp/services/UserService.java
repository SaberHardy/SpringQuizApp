package com.quizapp.quizapp.services;

import com.quizapp.quizapp.models.QuizAttempts;
import com.quizapp.quizapp.models.AppUser;
import com.quizapp.quizapp.repositories.QuizAttemptsRepository;
import com.quizapp.quizapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<AppUser> getAllQuizAttempts() {
        return userRepository.findAll();
    }

    public AppUser getQuizAttemptsById(Long id) {
        return userRepository.findById(id).orElse(new AppUser());
    }

    public AppUser saveQuizAttempts(AppUser user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
