//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Staff employee1 =new Staff();
    employee1.name = "Mahmoud";
    employee1.staffId = 5656;
    employee1.salary = 2000;
    employee1.setStaffData();
    Staff employee2 =new Staff();
        employee2.name = "Ali";
        employee2.staffId = 5657;
        employee2.salary = 1200;
        employee2.setStaffData();
    Staff employee3 =new Staff();
        employee3.name = "Amr";
        employee3.staffId = 5658;
        employee3.salary = 1500;
        employee3.setStaffData();
    chef person1 =new chef();
        person1.name="Mahdy";
        person1.age=50;
        person1.specialty="executive chef";
        person1.printCefData();
    chef person2 =new chef();
        person2.name="shirble";
        person2.age=30;
        person2.specialty="pastry chef";
        person2.printCefData();

    menueItem item1 = new menueItem();
        item1.itemTitle ="Pasta";
        item1.itemPrice =200;
        item1.printMenue();
    menueItem item2 = new menueItem();
        item2.itemTitle ="Pizza";
        item2.itemPrice =300;
        item2.printMenue();
    menueItem item3 = new menueItem();
        item3.itemTitle ="soup";
        item3.itemPrice =100;
        item3.printMenue();
    menueItem item4 = new menueItem();
        item4.itemTitle ="apple pie";
        item4.itemPrice =150;
    item4.printMenue();
        }
    }
