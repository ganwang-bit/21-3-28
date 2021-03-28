package com.test.Test1;

interface Shape{
    void func();
}
class Cat implements Shape {
    public void func(){
        System.out.println("ss");
    }
}
public class Sheep {
    public static void main(String[] args) {
        Shape s=new Cat();
        s.func();
    }
}
