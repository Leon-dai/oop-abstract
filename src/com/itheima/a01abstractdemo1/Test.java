package com.itheima.a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("zhangsan", 18);
        s.work();
        System.out.println(s.getName() + ", " + s.getAge());
    }
}
