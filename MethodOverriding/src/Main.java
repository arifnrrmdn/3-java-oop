public class Main {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Marcel";
        manager.sayHello("Gus Samsudin");

        var vp = new VicePresident();
        vp.name = "Gus Samsudin";
        vp.sayHello("Marcel");
    }
}