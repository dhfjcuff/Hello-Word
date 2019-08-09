package com.example.helloword;

//public class Puppy {
//    static String name="莽哥";
//    public Puppy(String name){
//        System.out.println("小狗名字是："+name);
//    }
//    public static void main(String[] args){
//        Puppy myPuppy = new Puppy(name);
//    }
//}

public class Puppy{
    int puppyAge;
    public Puppy(String name){
        System.out.println("小狗名字叫："+name);
    }
    public void setAge(int age){
        puppyAge =age;
    }
    public int getAge(){
        System.out.println("获取小狗年龄："+puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
//        创建对象
        Puppy myPuppy = new Puppy("莽哥");
//        调用对象的方法
        myPuppy.setAge(3);
        myPuppy.getAge();
//        访问成员变量
        System.out.println("变量值："+myPuppy.puppyAge);
    }
}
