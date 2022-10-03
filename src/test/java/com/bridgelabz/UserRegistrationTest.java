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


}
