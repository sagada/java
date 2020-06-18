package com.wmp.out.ch7;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }
}

class A {
    void methodA(){
        I i = InstanceManager.getInstacne();
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I
{
    public abstract void methodB();
}

class B implements I {

    @Override
    public void methodB() {
        System.out.println("methodB in B Class");
    }
    public String toString(){return "class B";}
}

class InstanceManager{
    public static I getInstacne(){
        return new B();
    }
}