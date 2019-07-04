package com.stackroute.pexercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccuranceOfString {

    public String multiple(String str, String word) {
        if(str==null||word==null) // if any of the string is null will return message "null values"
            return "null values";

        String s = "";
        Pattern pat = Pattern.compile(word);   // using matcher and pattern to check the occurance of a string
        Matcher mat = pat.matcher(str);
        if(!mat.find())
            return "Notfound";

        while (mat.find())
            {
                s = s+ "found at " + mat.start() + "-" + mat.end()+"\n";
            }
            return s.trim(); // returning the stasrting and end index of the given string

    }
}