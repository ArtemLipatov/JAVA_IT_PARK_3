package com.company.services;

import com.company.forms.QuestionForm;
import com.company.models.Question;
import com.company.repositories.QuestionRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    @SneakyThrows
    public String addQuestion(QuestionForm form) {
        LocalDateTime questionTime = LocalDateTime.now();
        Question addQuestion = Question.builder()
                .questionDateTime(questionTime)
                .userName(form.getName())
                .email(form.getEmail())
                .phonenumber(form.getPhonenumber())
                .text(form.getText())
                .build();

        questionRepository.save(addQuestion);
        return addQuestion.getEmail();
    }

    @Override
    public Question getQuestion(Long questionId) {
        return questionRepository.findOne(questionId);
    }

    @Override
    public List<Question> getQuestions(String orderBy) {
        switch (orderBy) {
            case "id" : return questionRepository.findByOrderById();
        }
        return questionRepository.findAll();
    }
}
