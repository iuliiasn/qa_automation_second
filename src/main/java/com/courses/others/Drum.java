package com.courses.others;

public class Drum extends Instrument implements Instruments {

    public String size = "14*5.5";

    public Drum(String size){
        super("Drum" );
        this.size = size;
    }

        public void play() {
            System.out.println("Now plays Drum");
    }

}
