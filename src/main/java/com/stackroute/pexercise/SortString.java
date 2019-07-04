package com.stackroute.pexercise;

import java.util.Arrays;
import java.util.Collections;

public class SortString {

    public String sortStr (String str){
        if(str==null)
            return "nullvalues";
        String[] s= str.split("\\s|\\.|;|,");

        for(int i=0;i<s.length;i++) {
            Collections.sort(Arrays.asList(s), String.CASE_INSENSITIVE_ORDER);

            StringBuilder sb = new StringBuilder();

            sb.append(Arrays.asList(s));


        }

          return Arrays.toString(s);

    }
}

