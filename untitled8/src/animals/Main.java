package animals;

public class Main {
    public static void main(String[] args) {
        // Створення тварин
        Animal dog = new Dog("Бобік");
        Animal cat = new Cat("Мурчик");
        Animal fish = new Fish("Золотка");

        // Перевірка поведінки тварин
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        fish.eat();
        fish.sleep();

        // Граються тільки ті тварини, які реалізують Playable
        if (dog instanceof Playable) {
            ((Playable) dog).play();
        }

        if (cat instanceof Playable) {
            ((Playable) cat).play();
        }
    }
}
