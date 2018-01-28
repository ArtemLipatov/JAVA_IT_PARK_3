package com.company.forms;

import com.company.models.User;
import com.company.models.UsersProfile;
import lombok.Data;

@Data

public class NamesForm {
    private String firstName;
    private String lastName;

    public void update(UsersProfile usersProfile){
        usersProfile.setFirstName(this.firstName);
        usersProfile.setLastName(this.lastName);
    }
}
