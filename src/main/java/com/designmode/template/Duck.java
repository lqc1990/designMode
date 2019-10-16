package com.designmode.template;

/**
 * @author lqc
 */
public class Duck implements Comparable {

    private String name;
    private int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object obj) {
        Duck otherDuck = (Duck) obj;
        if(this.age < otherDuck.age){
            return -1;
        } else if(this.age == otherDuck.age){
            return 0;
        } else {
            return 0;
        }
    }
}
