package com.courses.others;

public class Cat extends Animal {
    public String name = "";

    public Cat(String name,String food, String location) {
        super(food, location, "meow");
        this.setFood(food);
        this.setLocation(location);
        this.name=name;
    }

    @Override
    public void makeNoice(){
        System.out.println("The animal makes noice "+ super.getVoice());
    }

    @Override
    public void eat(){
        System.out.println("The animal wants to eat "+ super.getFood());
    }

    public String getName(){
        return "My cat name is " + this.name;
    }

}
