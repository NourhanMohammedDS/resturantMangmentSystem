public class Staff {
    int staffId;
    String name;
    double salary;
    String position;
    Staff(){
        System.out.println("***the Staff Members ***");}

Staff(int staffId,String position,String name,double salary){
    System.out.println("Mr: "+name+"\nID : "+staffId+"\ndepartment is  "+position+"\nSalary = "+salary+" $");

    }
}
