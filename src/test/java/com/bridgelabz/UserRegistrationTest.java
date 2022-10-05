package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void checking_First_Name_Method() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("Honda");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checking_Last_Name_Method() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkLastName("Amaze");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checking_EMail_Method() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkEMail("blabz1@gmail.co.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checking_Phone_Number_Method() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPhoneNumber("91 9920456790");
        Assert.assertEquals(true, result);
    }



    @Test
    public void checking_Password_Method(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPassword("Password@123");
        Assert.assertEquals(true,result);
    }

    @Test
    public void checking_Password_Method_Atleast_One_Upper_Case(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPasswordAtLeastOneUpperCase("Password23");
        Assert.assertEquals(true,result);
    }
    @Test
    public void checking_Password_Method_Atleast_One_Numberic(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPasswordAtLeastOneNumeric("Password123");
        Assert.assertEquals(true,result);
    }

    @Test
    public void checking_Password_Method_Atleast_One_Special_Character(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPasswordAtLeastOneSpecialCharacter("Password@123");
        Assert.assertEquals(true,result);
    }

}
