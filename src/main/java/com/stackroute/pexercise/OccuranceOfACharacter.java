package com.stackroute.pexercise;

public class OccuranceOfACharacter {
    //fcount the total number of occurrences of a given character in a string
    public int occurance(String str, char ch)
    {   if(str==null)
        return 0;
        int len= str.length(); // length of the string
        int l=str.replaceAll(Character.toString(ch),"").length(); //length of the string without the character
        int charcount = len-l; //occurance of th character

        return charcount;

    }
}
