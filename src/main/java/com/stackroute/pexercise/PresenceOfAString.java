package com.stackroute.pexercise;

public class PresenceOfAString {

    // find the presence of a name
    public boolean findString(String str1,String str2){

        if(str1==null||str2==null)
            return false;
        if(str1.contains(str2))   //checking if string has the name
            return true;
        else
            return false;
    }
}
