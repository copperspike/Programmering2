package labbSOLID2;

public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black"),
                            new Hedgehog("Pink"),
                            new Bird("Yellow"),
                            new Snake("Purple")};

        System.out.println("###############");
        System.out.println();

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.walk();
            animal.paint("Grey");
            System.out.println(animal.getClass().getSimpleName() + " is " + animal.getColor());
            System.out.println();

            System.out.println("###############");
            System.out.println();
        }
    }
}
