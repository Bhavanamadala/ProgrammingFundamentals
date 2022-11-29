package com.bhavana.Email;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {
    public static void main(String args[]){
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("bhavana@domain.co.in");
        emails.add("madala@domain.com");
        emails.add("vasundhara.name@domain.com");
        emails.add("scriptbees#@domain.co.in");
        emails.add("teamlead@domain.com");
        emails.add("bhavana@domaincom");
        emails.add("@yahoo.com");
        emails.add("scriptbees#domain.com");
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
    }
}
