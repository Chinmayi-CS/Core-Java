package com.xworkz.inheritance;

public class SmartPhoneRunner {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        mobile1.name="Motorola edge 40 Neo";
        mobile1.Brand="Motorola";
        mobile1.size="12+128gb";
        mobile1.price=40000;
        System.out.println("Name :"+mobile1.name);
        System.out.println("Brand :"+mobile1.Brand);
        System.out.println("Size :"+mobile1.size);
        System.out.println("Price :"+mobile1.price);
        mobile1.operate();
        mobile1.generate();

        SmartPhone smartPhone1 = new Mobile();
        smartPhone1.name="1 plus";
        smartPhone1.Brand="One plus";
        smartPhone1.size="12+256gb";
        smartPhone1.price=50000;
        smartPhone1.generate();
        smartPhone1.operate();
        System.out.println("Name :"+smartPhone1.name);
        System.out.println("Brand :"+smartPhone1.Brand);
        System.out.println("Size :"+smartPhone1.size);
        System.out.println("Price :"+smartPhone1.price);


    }
}
