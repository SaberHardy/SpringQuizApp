package com.quizapp.quizapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizAttemptsRepository extends JpaRepository<QuizRepository, Long> {

}
