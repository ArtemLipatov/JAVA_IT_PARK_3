package com.company.services;

import com.company.forms.QuestionForm;
import com.company.models.Question;
import com.company.repositories.QuestionsRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionsRepository questionsRepository;

    @Override
    @SneakyThrows
    public void addQuestion(QuestionForm form) {
        LocalDateTime questionTime = LocalDateTime.now();
        Question question = Question.builder()
                .questionDateTime(questionTime)
                .userName(form.getName())
                .email(form.getEmail())
                .phonenumber(form.getPhonenumber())
                .text(form.getText())
                .build();

        questionsRepository.save(question);
    }

    @Override
    public Question getQuestion(Long questionId) {
        return questionsRepository.findOne(questionId);
    }

    @Override
    public List<Question> getQuestions(String orderBy) {
        switch (orderBy) {
            case "id" : return questionsRepository.findByOrderById();
        }
        return questionsRepository.findAll();
    }
}
