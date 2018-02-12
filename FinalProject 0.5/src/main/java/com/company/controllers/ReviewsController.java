package com.company.controllers;


import com.company.forms.EditReviewForm;
import com.company.forms.ReviewForm;
import com.company.models.Review;
import com.company.models.User;
import com.company.services.AuthenticationService;
import com.company.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/add_review")
    public String addReview(ReviewForm form){
        reviewService.addReview(form);
        return "redirect:/products/" + form.getProductId();
    }

    @GetMapping("/edit_review")
    public String getProfilePage(@ModelAttribute("model")ModelMap model, @RequestParam(value = "id") Long reviewId, Authentication authentication){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        Review review = reviewService.getReview(reviewId);
        model.addAttribute("review", review);
        return "edit_review";
    }

    @PostMapping("/edit_review")
    public String editReview(EditReviewForm form){
        reviewService.updateReview(form);
        return "redirect:/products/" + reviewService.getReview(form.getId()).getProduct().getId();
    }

    @PostMapping("/delete_review")
    public String editReview(@RequestParam(value = "id")Long reviewId){
        Long id = reviewService.getReview(reviewId).getProduct().getId();
        reviewService.deleteReview(reviewId);
        return "redirect:/products/" + id;
    }
}
