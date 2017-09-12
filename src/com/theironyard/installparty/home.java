package com.theironyard.installparty;

public class home {

    boolean clean;
    String color;
    int rooms;

    public home (boolean clean, String color, int rooms){

        this.clean = clean;
        this.color = color;
        this.rooms = rooms;
    }

    public String homeDetails(){
        return "Is it clean...? " + this.clean + ". The color is: " + this.color + ". And it has " + this.rooms + " rooms.";
    }
}
