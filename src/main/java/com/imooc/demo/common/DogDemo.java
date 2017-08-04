package com.imooc.demo.common;

/**
 * Create By Bridge on 2017/8/4
 * function: 对象的Demo测试
 */
public class DogDemo {
    //默认构造函数
//    public DogDemo(){}

    public DogDemo(String name){
        //带参数的构造函数
        //这个构造器仅有一个参数：name
        System.out.println("这是一个小狗的名字： " + name);
    }
    private String breed;
    private int age;
    private String color;

    public DogDemo() {

    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eating(){}
    public void sleeping(){}

    public static void main(String[] args){

        //new 实例化的时候，调用默认构造方法将其初始化。
        DogDemo dogDemo = new DogDemo("Tommy");

    }

}
