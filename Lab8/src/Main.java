import task1.Shifrator;
import task2.*;

public class Main {
    public static void main(String[] args) {

        //task1
        int a = 123;
        System.out.println(Shifrator.shifrator(a));


        //task2
        UserElement userElement1 = new UserElement("vssa", "sasa", "dds");
        UserElement userElement2 = new UserElement("vs", "sa", "s");
        EquipmentElement equipmentElement1 = new EquipmentElement("sassa", "vvxcv");
        EquipmentElement equipmentElement2 = new EquipmentElement("ssa", "xcv");

        CompanyList<Company> list = new CompanyList<>();
        list.addNewElement(userElement1);
        list.addNewElement(userElement2);
        list.addNewElement(equipmentElement1);
        list.addNewElement(equipmentElement2);

        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }
}
