import java.util.Arrays;

public class Printer {

    public void print(String data) {
        System.out.println(data);
    }

    public void print(int data) {
        System.out.println(data);
    }

    public void print(double data) {
        System.out.println(data);
    }

    public void print(String data, int number) {
        System.out.println(data + " and " + number);
    }

    public void print(String[] dataArray) {
        System.out.println(Arrays.toString(dataArray));
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello, World!");
        printer.print(123);
        printer.print(45.67);
        printer.print("Result", 100);
        printer.print(new String[] {"apple", "banana", "cherry"});
    }
}
