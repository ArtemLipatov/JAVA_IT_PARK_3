package com.company.forms;

import com.company.models.User;
import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class ProfileForm {
    private Long userId;
    private String firstName;
    private String lastName;
    private String organization;
    private String phonenumber;

    public void update(User user){
        user.setId(this.userId);
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setOrganization(this.organization);
        user.setPhonenumber(this.phonenumber);
    }
}
