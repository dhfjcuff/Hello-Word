package com.example.helloword;

public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount(){
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    InstanceCounter(){
        InstanceCounter.addInstance();
    }
    public static void main(String[] arguments){
        System.out.println("开始运行初始值"+
        InstanceCounter.getCount());
        Math.random();
        for (int i=0;i<500;i++){
            new InstanceCounter();
        }
        System.out.println("结束值"+
                InstanceCounter.getCount());
        System.out.println("转义\n字符");
    }
}
