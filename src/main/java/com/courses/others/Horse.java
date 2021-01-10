package com.courses.others;

public class Horse extends Animal {
    public String name = "";

    public Horse(String name, String food, String location) {
        super(food, location, "ihaa");
        this.setFood("Grass");
        this.setLocation("Rancho");
        this.name=name;
    }

    @Override
    public void makeNoice() {
        System.out.println("The animal makes noice" + getVoice());
    }


    @Override
    public void eat() {
        System.out.println("The animal wants to eat"+ getFood());
    }
}

