package task3;

import java.util.ArrayList;

public class University {
    private University() {
    }

    public static void showAllDepartments(ArrayList<Department> departments) {
        for (Department value : departments) {
            System.out.println(value.getName());
        }
    }

    public static void showAllGroups(ArrayList<Group> groups) {
        for (Group value : groups) {
            System.out.println(value.getId());
        }
    }

    public static void showAllStudents(ArrayList<Student> students) {
        for (Student value : students) {
            System.out.println(value.getFirstName() + " " + value.getLastName());
        }
    }

    public static void showAllHeadmans(ArrayList<Group> groups) {
        for (Group value : groups) {
            System.out.println(value.getHeadman().getFirstName() + " " + value.getHeadman().getLastName());
        }
    }

    public static ArrayList<Student> searchStudent(ArrayList<Student> students,String lastName){
        ArrayList<Student> foundStudents = new ArrayList<>();
        for (Student value : students){
            if(value.getLastName().equals(lastName))
                foundStudents.add(value);
        }
        return foundStudents;
    }
}
