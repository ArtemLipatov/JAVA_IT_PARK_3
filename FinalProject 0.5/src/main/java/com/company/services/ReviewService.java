package com.company.services;

import com.company.forms.EditReviewForm;
import com.company.forms.ReviewForm;
import com.company.models.Review;

public interface ReviewService {
    void addReview(ReviewForm form);
    Review getReview(Long reviewId);
    void updateReview(EditReviewForm form);
    void deleteReview(Long reviewId);


}
