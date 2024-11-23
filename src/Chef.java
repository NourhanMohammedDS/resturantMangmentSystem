public class Chef {
    String name ;
    int age;
    String specialty;

    Chef(){
        System.out.println("this chef constructor");
    }
    Chef(String name){
        System.out.println(name);
    }
    Chef(String name,int age,String specialty){
        System.out.println("----------------------");
        System.out.println("chef : "+name+"\nage : "+age+"\nspecialty : "+specialty);
    }


}
