package animals;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть риб'ячий корм.");
    }
}
