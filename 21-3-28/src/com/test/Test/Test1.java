package com.test.Test;
class Test4{
    protected int a;
    public Test4(){
        this.func();
    }
    public void func(){
        System.out.println("func()");
    }
}
class Test5 extends Test4{
    public void func(){
        System.out.println("testfunc()");
    }
    public Test5(){
        this.func();
    }
}
abstract class Test6 {
    public abstract void func();
}
public class Test1{
    void func(){
        System.out.println("func");
    }
    int b;

    public static void main(String[] args) {
        Test5 t=new Test5();
        t.func();
        Test4 tt=new Test4();
        tt.func();

    }
}
