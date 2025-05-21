package com.gevernova;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    // Positive test case for first name
    @Test
    public void testValidFirstName_Positive(){
        assertTrue(userRegistration.validateFirstName("Disha"));
    }

    // Negative test case for first name
    @Test
    public void testValidFirstName_Negative(){
        assertFalse(userRegistration.validateFirstName("dy"));
    }

    // Positive test case for last name
    @Test
    public void testValidLastName_Positive(){
        assertTrue(userRegistration.validateLastName("Yadav"));
    }

    // Negative test case for last name
    @Test
    public void testValidLastName_Negative(){
        assertFalse(userRegistration.validateLastName("yd"));
    }

    // Test case for email
    @Test
    public void testValidEmail(){
        assertTrue(userRegistration.validateEmail("disha.yadav@gmail.co.in"));
    }

    // Positive test case for phone number
    @Test
    public void testValidPhoneNumber_Positive(){
        assertTrue(userRegistration.validatePhoneNumber("91 9876789809"));
    }

    // Negative test case for phone number
    @Test
    public void testValidPhoneNumber_Negative(){
        assertFalse(userRegistration.validatePhoneNumber("784512"));
    }

    // Positive test case for password
    @Test
    public void testValidPassword_Positive(){
        assertTrue(userRegistration.validatePassword("Strong@123"));
    }

    // Negative test case for password
    @Test
    public void testValidPassword_Negative(){
        assertFalse(userRegistration.validatePassword("abc"));
    }

    // Negative Email Tests using Parameterized Test
    @ParameterizedTest
    @ValueSource(strings = {
            "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
            ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
            "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"
    })
    public void testInvalidEmails(String emails){
        assertFalse(userRegistration.validateEmail(emails));
    }

    // Positive Email Tests using Parameterized Test
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"
    })
    public void testValidEmails(String emails){
        assertTrue(userRegistration.validateEmail(emails));
    }
}
