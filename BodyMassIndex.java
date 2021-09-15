import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person p = new Person();

        System.out.print("Enter with your name:");

        Person.name = sc.next();

        System.out.print("Enter your weight in kg:");

        Person.weight = sc.nextFloat();

        System.out.print("Enter your height in Centimeters:");

        Person.height = sc.nextFloat();

        p.calculator();

        if (p.calculator() < 18.5) {
            System.out.println("You are thin " + p.calculator());
        } else if (p.calculator() >= 18.5 && p.calculator() <= 24.9) {
            System.out.println("Normal " + p.calculator());
        } else if (p.calculator() >= 25 && p.calculator() <= 29.9) {
            System.out.println("Overweight " + p.calculator());
        } else if (p.calculator() >= 30 && p.calculator() <= 39.9) {
            System.out.println("Obesity " + p.calculator());
        } else {
            System.out.println("Dangerous obesity " + p.calculator());
        }

    }
}
