package com.company.controllers;


import com.company.forms.QuestionForm;
import com.company.models.Question;
import com.company.models.User;
import com.company.services.AuthenticationService;
import com.company.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping(value = "/questions")
    public String getQuestions(@ModelAttribute("model")ModelMap model,
                              @RequestParam("order_by") String orderBy, Authentication authentication){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        List<Question> questions = questionService.getQuestions(orderBy);
        model.addAttribute("questions", questions);
        return "questions_page";
    }

    @GetMapping("/questions/{question-id}")
    public String getQuestionPage(@ModelAttribute("model") ModelMap model,
                                 @PathVariable("question-id") Long questionId){
        Question question = questionService.getQuestion(questionId);
        model.addAttribute("question", question);
        return "add_question_page";
    }

    @GetMapping("/question/{question-id}")
    @ResponseBody
    public ResponseEntity<Question> getQuestion(@ModelAttribute("model") ModelMap model,
            @PathVariable("question-id") Long questionId, Authentication authentication){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return ResponseEntity.ok(questionService.getQuestion(questionId));
    }

    @PostMapping("/add_question")
    public String addQuestion(@ModelAttribute QuestionForm form,
                             @ModelAttribute("model") ModelMap model) {
        questionService.addQuestion(form);
        return "redirect:/";
    }

    @GetMapping("/add_question")
    public String getAddQuestionPage(@ModelAttribute("model") ModelMap model, Authentication authentication){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "add_question_page";
    }
}
