package com.courses.others;

public class VetQueue<queue> {
    public static void main (String[] args){

        Cat felix = new Cat ("Felix","Whiskas", "Home");
        Dog max = new Dog ("Max","Pedigree", "Home");
        Horse spirit = new Horse ("Spirit","Grass", "Rancho");

        Vet Doctor = new Vet();


        Animal[] animals = new Animal[3];
        animals[0] = felix;
        animals[1] = max;
        animals[2] = spirit;

        for (int i=0; i<animals.length; i++){
            System.out.println(animals[i].getVoice() + " " + animals[i].getLocation());
        }

    }

//   for(Animal animal : animals) {
//        Vet.treatAnimal(animal);
//        System.out.println(animal.getVoice());
//    }
}
