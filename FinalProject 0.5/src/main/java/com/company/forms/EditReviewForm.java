package com.company.forms;

import com.company.models.Review;
import lombok.Data;

@Data
public class EditReviewForm {
    private Long id;
    private String text;

    public void update(Review review){
        review.setText(this.text);
    }
}
