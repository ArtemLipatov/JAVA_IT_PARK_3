package com.company.services;

import com.company.forms.RegistrationForm;

public interface RegistrationService {
    String registration(RegistrationForm form);
    boolean confirm(String confirmString);
}
