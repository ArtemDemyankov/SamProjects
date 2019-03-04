import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        System.out.print("Input x1: ");
        scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        System.out.print("Input y1: ");
        scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        System.out.print("Input x2: ");
        scanner = new Scanner(System.in);
        int x2 = scanner.nextInt();
        System.out.print("Input y2: ");
        scanner = new Scanner(System.in);
        int y2 = scanner.nextInt();
        System.out.print("Input x3: ");
        scanner = new Scanner(System.in);
        int x3 = scanner.nextInt();
        System.out.print("Input y3: ");
        scanner = new Scanner(System.in);
        int y3 = scanner.nextInt();
        double a = D(x1,y1,x2,y2);
        double b = D(x1,y1,x3,y3);
        double c = D(x2,y2,x3,y3);
        double P = a + b + c;
        System.out.println("P = " + P);
        double p = (a+b+c)/2;
        double S = pow((p*(p-a)*(p-b)*(p-c)),0.5);
        System.out.println("S = " + S);
    }

    public static double D (int x1, int y1, int x2, int y2)
    {
        return sqrt(pow((x2-x1), 2)+pow((y2-y1), 2));
    }
}
