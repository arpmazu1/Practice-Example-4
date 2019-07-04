package com.stackroute.pexercise;

public class ReplaceCharacter {
    public String replaceChar( String str){
        if(str==null)
            return "Null value";

        String st=str.replaceAll("d","f"); //replace all d with f

        String st2=st.replaceAll("l","t"); //replace all l to t

        return st2;
    }
}
