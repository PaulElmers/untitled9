package animals;

public class Cat extends Animal implements Playable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть котячий корм.");
    }

    @Override
    public void play() {
        System.out.println(name + " грається з клубком ниток.");
    }
}
