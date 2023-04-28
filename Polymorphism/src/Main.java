public class Main {
    public static void main(String[] args) {

        var employee = new Employee("Dadang");
        employee.sayHello("Dudung");

        employee = new Manager("Dudung");
        employee.sayHello("Dadang");

        employee = new VicePresident("Asep");
        employee.sayHello("Dadang");


        sayHello(new Employee("Dadang"));
        sayHello(new Employee("Diding"));
        sayHello(new Employee("Dudung"));


    }


    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }

}