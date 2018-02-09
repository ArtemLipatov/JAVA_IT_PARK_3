package com.company.controllers;


import com.company.forms.QuestionForm;
import com.company.models.Question;
import com.company.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping(value = "/questions")
    public String getProducts(@ModelAttribute("model")ModelMap model,
                              @RequestParam("order_by") String orderBy){
        List<Question> questions = questionService.getQuestions(orderBy);
        model.addAttribute("questions", questions);
        return "questions_page";
    }

    @GetMapping("/questions/{question-id}")
    public String getProductPage(@ModelAttribute("model") ModelMap model,
                                 @PathVariable("question-id") Long questionId){
        Question question = questionService.getQuestion(questionId);
        model.addAttribute("question", question);
        return "add_question_page";
    }

    @GetMapping("/question/{question-id}")
    @ResponseBody
    public ResponseEntity<Question> getQuestion(@PathVariable("question-id") Long questionId){
        return ResponseEntity.ok(questionService.getQuestion(questionId));
    }

    @PostMapping("/add_question")
    public String addQuestion(@ModelAttribute QuestionForm form,
                             @ModelAttribute("model") ModelMap model) {
        String email = questionService.addQuestion(form);
        model.addAttribute("email", email);
        return "/";
    }

    @GetMapping("/add_question")
    public String getAddProductPage(@ModelAttribute("model") ModelMap model){
        return "add_question_page";
    }
}
