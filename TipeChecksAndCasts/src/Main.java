public class Main {
    public static void main(String[] args) {

        sayHello(new Employee("Dadang"));
        sayHello(new Manager("Dudung"));
        sayHello(new VicePresident("Asep"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else{
            System.out.println("Hello " + employee.name);
        }
    }
}