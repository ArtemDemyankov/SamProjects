import task1.*;
import task2.*;
import task3.*;
import task4.*;
import task5.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nВведите номер задания (0 - выход):");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 0)
                break;
            switch (n) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                default:
                    System.out.println("Неверный номер!");
            }
        }
    }

    private static void task5() {
        Student st1 = new Student("Artem", 20, 9.5);
        Student st2 = new Student("Nikita", 18, 7.2);

        StudentComparator.RESULT.log("Information st1:", st1);
        System.out.println(StudentComparator.AGE.compare(st1, st2));
    }

    private static void task4() {
        RGB rgb = RGB.white;
        System.out.println(rgb);
        System.out.println(rgb.getHexNumber());
        System.out.println(rgb.getPreviousColor());
        System.out.println(rgb.getNextColor());
    }

    private static void task3() {
        MathOperator mathOperator = MathOperator.ADD;
        System.out.println(mathOperator.execute(4, 5));
    }

    private static void task2() {
        for (Week value : Week.values()){
            System.out.println(value);
        }

        System.out.println();
        Week week = Week.SATURDAY;
        System.out.println(week.getText());
        System.out.println(week.getAbbreviation());
        System.out.println(week.isWeekend());

        if(week == Week.SATURDAY){
            System.out.println("Да, это суббота");
        }

        switch (week){
            case SATURDAY:
                System.out.println("Суббота");
                break;
        }
    }

    private static void task1() {
        SwimmingAthleteImpl swimmingAthlete = new SwimmingAthleteImpl();
        JumpingAthleteImpl jumpingAthlete = new JumpingAthleteImpl();
        TeamPlayerImpl teamPlayer = new TeamPlayerImpl();
        AllOverParticipantImpl allOverParticipant = new AllOverParticipantImpl();

        swimmingAthlete.participate();
        System.out.println();
        jumpingAthlete.participate();
        System.out.println();
        teamPlayer.participate();
        System.out.println();
        allOverParticipant.participate();
    }
}
