package com.example.helloword;
import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
//    构造器
    public Employee(String name){
        this.name = name;
    }

//    设置age值
    public void empAget(int empAge){
        age = empAge;
    }
//    设置designation的值
    public void enmDesignation(String empDesig){
        designation = empDesig;
    }
//    设置salary值
    public void emSalary(double emSalary){
        salary = emSalary;
    }
//    打印信息
    public void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
    }
}
