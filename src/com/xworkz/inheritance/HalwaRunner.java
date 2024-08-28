package com.xworkz.inheritance;

public class HalwaRunner {
    public static void main(String[] args) {

        Sweet sweet1 = new Sweet();
        sweet1.name="Badam Halwa";
        sweet1.colour="Orange";
        sweet1.quality="good";
        sweet1.operate();
        sweet1.generate();
        System.out.println("Name :"+sweet1.name);
        System.out.println("Colour :"+sweet1.colour);
        System.out.println("Quality :"+sweet1.quality);

        Halwa halwa1=new Halwa();
        halwa1.name="Carrot halwa";
        halwa1.colour="orange";
        halwa1.quality="Best";
        halwa1.operate();
        halwa1.generate();
        System.out.println("Name :"+halwa1.name);
        System.out.println("Colour :"+halwa1.colour);
        System.out.println("Quality :"+halwa1.quality);
    }
}