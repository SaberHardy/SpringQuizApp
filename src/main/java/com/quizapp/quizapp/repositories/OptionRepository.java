package com.quizapp.quizapp.repositories;

import com.quizapp.quizapp.models.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {

}
