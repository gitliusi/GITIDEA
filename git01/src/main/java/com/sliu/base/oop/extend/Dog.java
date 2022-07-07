package com.sliu.base.oop.extend;

public class Dog extends Animal {
    private String name;
    private int age;

    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        super.eat();
        System.out.println(" dog eat");
    }
    public boolean equals(Object obj){
        if (this==obj)
            return true;
        if(obj == null)
            return false;
        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            return this.name.equals(dog.name) && this.age == dog.age;
        }
        return false;

    }
}
