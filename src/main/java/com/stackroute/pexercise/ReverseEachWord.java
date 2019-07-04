package com.stackroute.pexercise;

public class ReverseEachWord {
    public String reverse(String str)
    {
        if(str==null) //If the string is null will give message "null value"
            return "Null Value";
        String[] s= str.split("\\s");  //splits the string from space
    String finalString="";
        for(String st:s)
        {
            StringBuilder w= new StringBuilder(st);
            w.reverse();                 //reversing each word
            finalString+=w+" ";         // final String
        }

        return finalString.trim();
    }
}
