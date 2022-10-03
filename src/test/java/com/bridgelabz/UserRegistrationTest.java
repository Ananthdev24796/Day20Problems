package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void checking_First_Name_Method(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("Honda");
        Assert.assertEquals(true,result);
    }
    @Test
    public void checking_Last_Name_Method(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkLastName("Amaze");
        Assert.assertEquals(true,result);
    }
    @Test
    public void checking_EMail_Method(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkEMail("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void checking_Phone_Number_Method(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPhoneNumber("91 9920456790");
        Assert.assertEquals(true,result);
    }


}
