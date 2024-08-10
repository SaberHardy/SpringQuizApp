package com.quizapp.quizapp.repositories;

import com.quizapp.quizapp.models.QuizAttempts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizAttemptsRepository extends JpaRepository<QuizAttempts, Long> {

}
