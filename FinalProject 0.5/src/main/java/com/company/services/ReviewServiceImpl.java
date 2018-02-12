package com.company.services;

import com.company.forms.EditReviewForm;
import com.company.forms.ReviewForm;
import com.company.models.Review;
import com.company.repositories.ProductsRepository;
import com.company.repositories.ReviewsRepository;
import com.company.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewsRepository reviewsRepository;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    ProductsRepository productsRepository;

    @Override
    public void addReview(ReviewForm form) {
        LocalDateTime reviewTime = LocalDateTime.now();
        Review review = Review.builder()
                .product(productsRepository.findOne(form.getProductId()))
                .users(usersRepository.findOne(form.getUserId()))
                .text(form.getText())
                .reviewDateTime(reviewTime)
                .build();
        reviewsRepository.save(review);
    }

    @Override
    public Review getReview(Long reviewId) {
        return reviewsRepository.findOne(reviewId);
    }

    @Override
    public void updateReview(EditReviewForm form) {
        Review review = reviewsRepository.findOne(form.getId());
        form.update(review);
        reviewsRepository.save(review);

    }

    @Override
    public void deleteReview(Long reviewId) {
        reviewsRepository.delete(reviewId);
    }
}
