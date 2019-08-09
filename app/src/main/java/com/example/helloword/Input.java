package com.example.helloword;
import android.app.admin.SystemUpdateInfo;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    public static void main(String arges[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数据：");
        if (scan.hasNextLine()){
            String word = scan.nextLine();
            System.out.println("数据："+word);
        }
        scan.close();
    }

}
