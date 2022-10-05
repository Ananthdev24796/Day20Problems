package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void checking_First_Name_Method_Passed() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("Honda");
        Assert.assertEquals(true, result);
    }@Test
    public void checking_First_Name_Method_Failed() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("honda");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checking_Last_Name_Method_Passed() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkLastName("Amaze");
        Assert.assertEquals(true, result);
    }
    @Test
    public void checking_Last_Name_Method_Failed() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkLastName("amaze");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checking_EMail_Method_Passed() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkEMail("blabz1@gmail.co.au");
        Assert.assertEquals(true, result);
    }
    @Test
    public void checking_EMail_Method_Failed() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkEMail("blabz1@gmailcom.co.1au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void checking_Phone_Number_Method_Passed() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPhoneNumber("91 9920456790");
        Assert.assertEquals(true, result);
    }
    @Test
    public void checking_Phone_Number_Method_Failed() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPhoneNumber("919920456790");
        Assert.assertEquals(true, result);
    }



    @Test
    public void checking_Password_Method_Passed(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPassword("Password@123");
        Assert.assertEquals(true,result);
    }
    @Test
    public void checking_Password_Method_Failed(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPassword("Password123");
        Assert.assertEquals(true,result);
    }


}
