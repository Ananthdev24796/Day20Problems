package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     * UC5
     *  As a User need to follow pre-defined Password rules.
     * 	Rule1 minimum 8 Characters
     *  NOTE – All rules must be passed
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
    public static boolean checkPassword(String password){
        String  userRegistrationRegEx = "[a-zA-Z0-9@&$#]{8,}";
        Pattern patternObj = Pattern.compile(userRegistrationRegEx);

        Matcher matcherObj = patternObj.matcher(password);

        return matcherObj.matches();
    }


}
