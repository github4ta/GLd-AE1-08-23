package by.itacademy.sergeymelnik;

public class Bird {
    String wings;
    int legs;

    public void initiate(){
        wings = "rooster wing";
        legs = 2;

    }

    public void canFly (){

        System.out.println("I can fly");
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
