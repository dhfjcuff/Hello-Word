package com.example.helloword;
import com.example.helloword.Employee;

public class EmployeeTest {
    public static void main(String[] aegs) {
        Employee empOne = new Employee("第一个类");
        Employee empTwo = new Employee("第二个类");
        empOne.empAget(11);
        empOne.enmDesignation("高级程序员");
        empOne.emSalary(1000);
        empOne.printEmployee();


    }
}
