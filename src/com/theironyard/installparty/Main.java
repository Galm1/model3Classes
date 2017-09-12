package com.theironyard.installparty;

public class Main {

    public static void main(String[] args) {
	 home myHome = new home(false, "brown", 4);
	 car myCar = new car(2, "Blue and White", "Mini Cooper");

	 System.out.println(myHome.homeDetails());
	 System.out.println(myCar.carDetails());
    }
}
