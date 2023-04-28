public class Manager extends Employee{

    Manager(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " my name is " + this.name);
    }

}
