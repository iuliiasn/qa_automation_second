package com.courses.others;

public class Saxophone extends Instrument implements Instruments {
    public int diameter = 160;

    public Saxophone(int diameter) {
        super("Saxophone");
        this.diameter = diameter;
    }
        public void play()
        {
            System.out.println("Now plays Saxophone");
        }
    }
