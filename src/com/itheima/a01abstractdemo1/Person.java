package com.itheima.a01abstractdemo1;

public abstract class Person {
    public String name;
    public int age;

    //作用：当创建子类对象的时候，给属性进行赋值的
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract void work();

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

}
