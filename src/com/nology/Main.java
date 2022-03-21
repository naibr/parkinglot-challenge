package com.nology;

public class Main {

    public static void main(String[] args) {
        Motorcycle chopper = new Motorcycle(13, 1);
        Van transporter = new Van(5, 3);

        chopper.park();
        transporter.park();

    }


}
