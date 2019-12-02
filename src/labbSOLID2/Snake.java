package labbSOLID2;

public class Snake extends Animal {

    public Snake(String color) {
        super(color);
    }

    @Override
    void speak() {
        System.out.println("Snake is hissing!");
    }

    @Override
    void sleep() {
        System.out.println("Snake is sleeping!");
    }

    @Override
    void eat() {
        System.out.println("Snake is devouring!");
    }

    @Override
    public void walk() {
        System.out.println("Slithering!");
    }
}
