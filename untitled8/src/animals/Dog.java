package animals;

public class Dog extends Animal implements Playable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть собачий корм.");
    }

    @Override
    public void play() {
        System.out.println(name + " грається з м'ячем.");
    }
}
