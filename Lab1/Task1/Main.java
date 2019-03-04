import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input temperature in fahrenheit: ");
        Scanner scanner = new Scanner(System.in);
        double F = scanner.nextDouble();
        double C = (F - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + C);
    }
}
