
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static task1.BELARUS.*;
import static task2.Task2.*;
import task3.*;
import task4.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nВведите номер задания (0-выход): ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            if (task == 0)
                break;
            switch (task) {
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
                default:
                    System.out.println("Ошибка ввода!");
            }
        }
    }

    private static void task1() {
        System.out.println(shortInfo());
        System.out.println();
        System.out.println(fullInfo());
    }

    private static void task2() {
        Scanner scanner;
        System.out.print("Введите число: ");
        scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        System.out.println(formatMoney(money));
        System.out.println();

        System.out.print("Введите год: ");
        scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
        System.out.println();

        System.out.print("Введите кол-во строк: ");
        scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[m][n];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = rnd.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println(Arrays.toString(linearize(a)));
    }

    private static void task3() {
        ArrayList<Student> students1 = new ArrayList<>();
        ArrayList<Student> students2 = new ArrayList<>();
        ArrayList<Group> groups = new ArrayList<>();
        ArrayList<Department> departments = new ArrayList<>();

        students1.add(new Student("Artem", "Demyankov", "+375447902566"));
        students1.add(new Student("Pasha", "Tekhnik", "+375294343994"));
        students1.add(new Student("Lena", "Voytova", "+375290438245"));
        students2.add(new Student("Nikita", "Kruk", "+375448547865"));
        students2.add(new Student("Oleg", "Lisitskiy", "+375294750238"));
        students2.add(new Student("Masha", "Antipenko", "+375294048672"));

        groups.add(new Group(610101));
        groups.add(new Group(610102));

        departments.add(new Department("FCAD"));

        students1.get(0).setGroup(groups.get(0));
        students1.get(1).setGroup(groups.get(0));
        students1.get(2).setGroup(groups.get(0));
        students2.get(0).setGroup(groups.get(1));
        students2.get(1).setGroup(groups.get(1));
        students2.get(2).setGroup(groups.get(1));

        groups.get(0).setStudents(students1);
        groups.get(1).setStudents(students2);
        groups.get(0).setHeadman(students1.get(0));
        groups.get(1).setHeadman(students2.get(2));

        departments.get(0).setGroups(groups);

        University.showAllDepartments(departments);
        System.out.println();
        University.showAllGroups(groups);
        System.out.println();
        University.showAllStudents(students1);
        System.out.println();
        University.showAllStudents(students2);
        System.out.println();
        University.showAllHeadmans(groups);
        System.out.println();
        ArrayList<Student> foundStudents = University.searchStudent(students1, "Demyankov");
        University.showAllStudents(foundStudents);
    }

    private static void task4() {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Пушкин", 1833, "Евгений Онегин"));
        books.add(new Book("Пушкин", 1831, "Борис Годунов"));
        books.add(new Book("Достоевский", 1866, "Преступление и наказание"));
        books.add(new Book("Достоевский", 1879, "Братья Карамазовы"));
        books.add(new Book("Гоголь", 1836, "Ревизор"));

        Library library = new Library("Национальная библиотека Беларуси", "Независимости 116");
        library.setBooks(books);

        library.showNumOfBooks();
        library.showNumOfAuthors();
        library.showBooksForPeriod(1832, 1866);
    }
}

