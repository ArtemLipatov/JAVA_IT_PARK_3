package com.company.forms;

import com.company.models.User;
import lombok.Data;

@Data

public class ProfileForm {
    private String firstName;
    private String lastName;
    private String organization;
    private String phonenumber;

    public void update(User user){
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setOrganization(this.organization);
        user.setPhonenumber(this.phonenumber);
    }
}
