package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     * UC1
     * As a User need to enter a valid First Name
     * First name starts with Cap and has minimum 3 characters
     */

        public static boolean checkFirstName(String fName){
            String userRegistrationRegEx = "^[A-Z]{1}[a-z]{2,}";
            Pattern patternObj = Pattern.compile(userRegistrationRegEx);

            Matcher matcherObj = patternObj.matcher(fName);

            return matcherObj.matches();
        }
    public static boolean checkLastName(String lName){
        String userRegistrationRegEx = "^[A-Z]{1}[a-z]{2,}";
        Pattern patternObj = Pattern.compile(userRegistrationRegEx);

        Matcher matcherObj = patternObj.matcher(lName);

        return matcherObj.matches();
    }


}
