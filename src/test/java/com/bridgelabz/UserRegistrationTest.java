package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void checking_First_Name_Method_1(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("Honda");
        Assert.assertEquals(true,result);
    }
    @Test
    public void checking_First_Name_Method_2(){
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("honda");
        Assert.assertEquals(true,result);
    }

}
