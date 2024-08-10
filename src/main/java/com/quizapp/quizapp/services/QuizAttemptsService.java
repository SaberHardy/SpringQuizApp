package com.quizapp.quizapp.services;

import com.quizapp.quizapp.models.QuizAttempts;
import com.quizapp.quizapp.repositories.QuizAttemptsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizAttemptsService {
    @Autowired
    private QuizAttemptsRepository quizAttemptsRepository;

    public List<QuizAttempts> getAllQuizAttempts() {
        return quizAttemptsRepository.findAll();
    }

    public QuizAttempts getQuizAttemptsById(Long id) {
        return quizAttemptsRepository.findById(id).orElse(new QuizAttempts());
    }

    public QuizAttempts saveQuizAttempts(QuizAttempts quizAttempts) {
        return quizAttemptsRepository.save(quizAttempts);
    }

    public void deleteQuizAttemptsById(Long id) {
        quizAttemptsRepository.deleteById(id);
    }
}
