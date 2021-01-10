package com.courses.others;

public class Guitar extends Instrument implements Instruments{
    public int string = 7;
    public Guitar (int string) {
        super("Guitar");
        this.string = string;

    }
        public void play () {
            System.out.println("Now plays Guitar");
        }
    }
