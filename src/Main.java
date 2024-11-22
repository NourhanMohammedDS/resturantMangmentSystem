//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Staff employee1 =new Staff();
    employee1.name = "Mahmoud";
    employee1.staffId = 5656;
    employee1.salary = 2000;
    employee1.printStaffData();
    Staff employee2 =new Staff();
        employee2.name = "Ali";
        employee2.staffId = 5657;
        employee2.salary = 1200;
        employee2.printStaffData();
    Staff employee3 =new Staff();
        employee3.name = "Amr";
        employee3.staffId = 5658;
        employee3.salary = 1500;
        employee3.printStaffData();
    Chef person1 =new Chef();
        person1.name="Mahdy";
        person1.age=50;
        person1.specialty="executive chef";
        person1.printChefData();
    Chef person2 =new Chef();
        person2.name="shirble";
        person2.age=30;
        person2.specialty="pastry chef";
        person2.printChefData();

    MenueItem item1 = new MenueItem();
        item1.itemTitle ="Pasta";
        item1.itemPrice =200;
        item1.printMenue();
    MenueItem item2 = new MenueItem();
        item2.itemTitle ="Pizza";
        item2.itemPrice =300;
        item2.printMenue();
    MenueItem item3 = new MenueItem();
        item3.itemTitle ="soup";
        item3.itemPrice =100;
        item3.printMenue();
    MenueItem item4 = new MenueItem();
        item4.itemTitle ="apple pie";
        item4.itemPrice =150;
    item4.printMenue();
        }
    }
