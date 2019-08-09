package com.example.helloword;

import java.util.regex.*;

public class RegexGroup {
    public static void main(String arges[]) {
        String word ="\nResponsible for the market development and to provide customers with technical support and services. ";
        String patter = "(for) (the)";
        Pattern r=Pattern.compile(patter);
        Matcher m = r.matcher(word);
        if (m.find()){
            System.out.println("匹配数组一:"+m.group(1));
            System.out.println("匹配数组二:"+m.group(2));
            System.out.println("匹配数组0:"+m.group(0));
        }

    }
}
