package com.theironyard.installparty;

public class car {

    int doors;
    String colors;
    String type;

    public car (int doors, String colors, String type){

        this.doors = doors;
        this.colors = colors;
        this.type = type;
    }
    public String carDetails(){
        return "I have a " + this.colors + " " + this.type + " with" + this.doors + " doors.";
    }
}
