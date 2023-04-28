public class Child extends Parent{

    //sebaiknya tidak usah dioverride agar tidak terjadi variable hiding
    String name;

    void doIt() {
        System.out.println("Do it from Child");
        System.out.println("Parent name is " + super.name);
    }
}
