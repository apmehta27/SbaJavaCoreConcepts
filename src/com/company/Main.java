package com.company;

public class Main {

    public static void main(String[] args) {
        double finalSedanPrice;
        double finalFordPriceOne;
        double finalFordPriceTwo;
        double finalTruckPrice;

        Car car1 = new Sedan(20,20000,"blue",25);
        finalSedanPrice= car1.getSalesPrice();
        System.out.println("The final price of the sedan is " + finalSedanPrice);

        Car car2 = new Ford(30,25000,"red",1973,1000);
        finalFordPriceOne = car2.getSalesPrice();
        System.out.println("The final price of the first Ford is " + finalFordPriceOne);

        Car car3 = new Ford(40,35000,"Magenta",1974,2000);
        finalFordPriceTwo = car3.getSalesPrice();
        System.out.println("The final price of second ford is " + finalFordPriceTwo);

        Car car4 = new Car(30,20000,"yellow");
        double carSalesPrice = car4.getSalesPrice();
        System.out.println("The price of the car is " + carSalesPrice);

        Car car5 = new Truck(40,40000,"pink",3000);
        finalTruckPrice = car5.getSalesPrice();
        System.out.println("The final price of the Truck is "+ finalTruckPrice);

	// write your code here
    }
}
