package com.company;

public class Sedan extends Car{
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Sedan(int length) {
        this.length = length;
    }

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalesPrice() {
//        double sedanSalesPrice;
//        System.out.println("Sedan" + super.getSalesPrice());
        if (length > 20) {
            return ((.95) * super.getSalesPrice());
        }else{
            return ((.90) * super.getSalesPrice());
        }

    }
}
