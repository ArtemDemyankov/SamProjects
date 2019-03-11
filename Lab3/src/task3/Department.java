package task3;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Group> groups;

    public Department(String nameOfDepartment) {
        this.name = nameOfDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
