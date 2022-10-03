package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     * UC3
     * As a User need to
     * enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc,
     * bl & co) and 2 optional (xyz & in) withprecise @ and . positions
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
    public static boolean checkEMail(String email){
        String  userRegistrationRegEx = "^[a-z]{1,}(.[a-z]{1,})+[@][bl]+.co(.in)";
        Pattern patternObj = Pattern.compile(userRegistrationRegEx);

        Matcher matcherObj = patternObj.matcher(email);

        return matcherObj.matches();
    }
    public static boolean checkPhoneNumber(String number){
        String  userRegistrationRegEx = "[91]{2} [0-9]{10}";
        Pattern patternObj = Pattern.compile(userRegistrationRegEx);

        Matcher matcherObj = patternObj.matcher(number);

        return matcherObj.matches();
    }


}
