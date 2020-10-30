package net.alea.beaconsimulator.bluetooth.model;

import java.util.Random;

public class SimpleUUID {

    private double SimpleUuid;



    public static double randomSimpleUUID(){
        Random rand = new Random();
        return rand.nextDouble();
    }
}
