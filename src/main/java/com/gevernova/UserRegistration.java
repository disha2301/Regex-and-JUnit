package com.gevernova;

import java.util.regex.Pattern;

public class UserRegistration {

    // Use case 1: Validate First Name (Starts with Capital & min 3 characters)
    public boolean validateFirstName(String firstName){
        return Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
    }

    //Use case 2: Validate last name
    public boolean validateLastName(String lastName){
        return Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
    }

    //Use case 3: Validate the email
    public boolean validateEmail(String email){
        return Pattern.matches("^[a-zA-z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$",email);
    }

    // User case 4: Validate the mobile number
    public boolean validatePhoneNumber(String mobile){
        return Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile);
    }

    // Use Case 5: Validate Password (min 8 chars, at least 1 upper, 1 number, exactly 1 special char)
    public boolean validatePassword(String password){
        return Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$", password) && password.replaceAll("[^\\W_]","").length()==1;// exactly 1 special character
    }
}

