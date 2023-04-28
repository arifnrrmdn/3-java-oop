public class VicePresident extends Manager{

    //kalo default constructor tidak perlu override
    VicePresident(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " my name is VP " + this.name);
    }

}
