package com.courses.others;

public class Instrument implements Instruments {

    public String myType;

    public Instrument(String instrumentType ) {
        myType = instrumentType;
    }

    public void play() {
        System.out.println("parent played");
    }
}
