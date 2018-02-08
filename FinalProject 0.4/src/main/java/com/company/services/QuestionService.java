package com.company.services;

import com.company.forms.QuestionForm;
import com.company.models.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestions(String orderBy);
    Question getQuestion(Long questionId);
    String addQuestion(QuestionForm form);
}
