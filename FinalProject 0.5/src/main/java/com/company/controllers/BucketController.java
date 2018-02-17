package com.company.controllers;

import com.company.forms.BuyProductForm;
import com.company.models.User;
import com.company.services.AuthenticationService;
import com.company.services.BucketService;
import com.company.services.OrderedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

public class BucketController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private BucketService bucketService;

    @Autowired
    private OrderedService orderedService;

    @GetMapping("/bucket")
    public String getProfilePage(@ModelAttribute("model")ModelMap model,
                                 Authentication authentication){
        User user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        boolean hasBucket = bucketService.hasUserBuckets(user);
        model.addAttribute("hasBuckets", hasBucket);
        boolean hasOrdered = orderedService.hasUserOrdered(user);
        model.addAttribute("hasOrdered", hasOrdered);
        return "bucket";
    }

    @PostMapping("/add_bucket")
    @ResponseBody
    public ResponseEntity<Object> buyProduct(BuyProductForm form){
        bucketService.save(form);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/delete_bucket")
    public String deleteBucket(@RequestParam(value = "id") Long bucketId){
        bucketService.delete(bucketId);
        return "redirect:/bucket";
    }
}
