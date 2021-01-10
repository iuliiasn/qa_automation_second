package com.courses.others;

public class InstrumentsPlay {

    public static void main(String[] args) {

        Instruments[] instruments = new Instruments[3];
        instruments[0] = new Guitar(7);
        instruments[1] = new Drum("14*5.5");
        instruments[2] = new Saxophone(16);

        for (Instruments bbb:instruments){
            bbb.play();
        }
    }
}
