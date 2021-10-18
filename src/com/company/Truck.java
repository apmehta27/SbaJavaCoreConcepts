package com.company;

public class Truck extends Car{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalesPrice() {
        if(weight > 2000){
            return  ((.90) * super.getRegularPrice());
        }else {
            return ((.10) * super.getRegularPrice());
        }

    }



}
