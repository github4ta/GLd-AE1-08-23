package by.itacademy.sergeymelnik;

public class MainCheck {
    public static void main(String[] args) {
        Rooster rooster = new Rooster();
        rooster.initiate();
        Bird bird = new Bird();
        bird.initiate();
        bird.canFly();
        System.out.println(rooster.getLegs());
        rooster.setLegs(10);
        System.out.println(bird.getLegs());
        System.out.println(rooster.getLegs());
        rooster.fromBird();
    }
}
