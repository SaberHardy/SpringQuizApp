package com.quizapp.quizapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.quizapp.quizapp.services.QuizService;
import com.quizapp.quizapp.models.Quiz;
import org.springframework.ui.Model;

import java.sql.SQLOutput;

@Controller
@RequestMapping("quizzes")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping
    public String getAllQuizzes(Model model) {
        model.addAttribute("quizzes", quizService.getAllQuizzes());
        return "quizzes";
    }

    @GetMapping("/add")
    public String showAddQuizForm(Model model) {
        model.addAttribute("quiz", new Quiz());
        return "add-quiz";
    }

    @PostMapping("/add")
    public String addQuiz(@ModelAttribute Quiz quiz) {
        quizService.saveQuiz(quiz);
        return "redirect:/quizzes";
    }

    @GetMapping("/edit/{id}")
    public String editQuiz(@PathVariable Long id, Model model) {
        model.addAttribute("quiz", quizService.getQuizById(id));
        return "edit-quiz";
    }

    @GetMapping("/delete/{id}")
    public String deleteQuiz(@PathVariable Long id, Model model) {
        quizService.deleteQuizById(id);
        return "redirect:/quizzes";
    }
}
