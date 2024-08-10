package com.quizapp.quizapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.quizapp.quizapp.repositories.OptionRepository;
import org.springframework.stereotype.Service;
import com.quizapp.quizapp.models.Option;

import java.util.List;

@Service
public class OptionService {
    @Autowired
    private OptionRepository optionRepository;

    public void saveOption(Option option) {
        optionRepository.save(option);
    }

    public List<Option> getAllOptions() {
        return optionRepository.findAll();
    }

    public Option getOptionById(Long id) {
        return optionRepository.findById(id).orElse(new Option());
    }

    public void deleteOptionById(Long id) {
        optionRepository.deleteById(id);
    }
}
