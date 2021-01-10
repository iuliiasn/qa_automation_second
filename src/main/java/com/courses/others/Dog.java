package com.courses.others;

public class Dog extends Animal {
    public String name = "";

    public Dog(String name, String food, String location) {
        super(food, location, "waf");
        this.setFood("Pedigree");
        this.setLocation("Home");
        this.name=name;
    }

    @Override
    public void makeNoice(){
        System.out.println("The animal makes noice "+ super.getVoice());
    }

    @Override
    public void eat(){
        System.out.println("The animal wants to eat"+super.getFood());
    }


}
