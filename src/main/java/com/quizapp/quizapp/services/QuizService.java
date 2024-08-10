package com.quizapp.quizapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.quizapp.quizapp.repositories.QuizRepository;
import org.springframework.stereotype.Service;
import com.quizapp.quizapp.models.Quiz;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }

    public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public void deleteQuizById(Long id) {
        quizRepository.deleteById(id);
    }
}
