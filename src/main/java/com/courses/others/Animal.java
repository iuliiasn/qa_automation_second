package com.courses.others;

public class Animal {

 private String food;

 private String location;

 private String voice;
    private String name;

    public Animal(String food, String location, String voice) {
     this.food=food;
     this.location=location;
     this.voice=voice;
 }

 public void makeNoice(){
     System.out.println("The animal makes noice");
 }

 public void eat(){
     System.out.println("The animal wants to eat");
 }

 public void sleep(){
     System.out.println();
 }

 public void setFood(String food){
     this.food=food;
 }

 public void setLocation(String location){
     this.location=location;
 }

 public void setVoice(String voice){
     this.voice=voice;
 }

 public String getFood()
 {
     return this.food;
 }

 public String getLocation()
 {
   return this.location;
 }

 public String getVoice(){
    return this.voice;
 }

    public String getName(){
        return "Your function is not defined";
    }
}
