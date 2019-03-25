package task2;

import java.util.Date;

public class UserElement extends Company{
    private String fio;
    private String department;
    private String phone;
    private Date date;

    public UserElement(String fio, String department, String phone) {
        this.fio = fio;
        this.department = department;
        this.phone = phone;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "UserElement{" +
                "fio='" + fio + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                '}';
    }
}
