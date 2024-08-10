package com.quizapp.quizapp.services;

import com.quizapp.quizapp.models.Question;
import com.quizapp.quizapp.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.quizapp.quizapp.repositories.QuizRepository;
import org.springframework.stereotype.Service;
import com.quizapp.quizapp.models.Quiz;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question findById(Long id) {
        return questionRepository.findById(id).orElse(new Question());
    }

    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }
}
