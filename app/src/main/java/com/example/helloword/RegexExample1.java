package com.example.helloword;
import java.util.regex.*;

public class RegexExample1 {
    public static void main(String args[]){
        String content = "hello Word";
        String pattern = ".*ord";
        boolean isin = Pattern.matches(pattern, content);
        System.out.println("是否匹配："+isin);
    }
}
