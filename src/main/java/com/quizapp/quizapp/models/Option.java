package com.quizapp.quizapp.models;

import jakarta.persistence.*;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private Boolean correct;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
