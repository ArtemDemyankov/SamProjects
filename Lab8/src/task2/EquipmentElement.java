package task2;

import java.util.Date;

public class EquipmentElement extends Company {
    private String name;
    private String inv_number;
    private Date date;

    public EquipmentElement(String name, String inv_number) {
        this.name = name;
        this.inv_number = inv_number;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "EquipmentElement{" +
                "name='" + name + '\'' +
                ", inv_number='" + inv_number + '\'' +
                ", date=" + date +
                '}';
    }
}
