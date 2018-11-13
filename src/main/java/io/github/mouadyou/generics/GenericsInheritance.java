package io.github.mouadyou.generics;

public class GenericsInheritance {

    public static void main(String[] args) {
        String str = "abc";
        Object obj = new Object();
        obj = str; // works because String is-a Object, inheritance in java

        MyClass<String> myClass1 = new MyClass<String>();
        MyClass<Object> myClass2 = new MyClass<Object>();
        // myClass2 = myClass1; // compilation error since MyClass<String> is not a MyClass<Object>
        obj = myClass1; // MyClass<T> parent is Object

        System.out.println("str = " + str);
        System.out.println("obj = " + obj);
        System.out.println("myClass1 = " + myClass1);
        System.out.println("myClass2 = " + myClass2);
    }

    private static class MyClass<T> {
    }

}