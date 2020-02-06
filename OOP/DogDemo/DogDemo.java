package OOP.DogDemo;

class Dog {
    String name;
    int numLegs;
    String breed;
    boolean fleas;
    boolean hungry;

    boolean isHungry() {
        return hungry;
    }

    void eat() {
        hungry = false;
    }

    void play() {
        hungry = true;
    }
}

public class DogDemo {

    public static void dogEat(Dog dog) {
        dog.hungry = false;
    }

    public static void main(String[] args) {

        Dog spot = new Dog();
        spot.name = "Spot";
        spot.numLegs = 3;
        spot.breed = "Collie";
        spot.fleas = true;

        System.out.println("Name: " + spot.name);
        System.out.println("Breed: " + spot.breed);
        System.out.println("# of legs: " + spot.numLegs);
        System.out.println("Has fleas? " + spot.fleas);

        spot.play();
        System.out.println("Hungry? " + spot.hungry);

        if (spot.isHungry()) {
            spot.eat();
            dogEat(spot);
        }
        System.out.println("Hungry? " + spot.hungry);

    }

}