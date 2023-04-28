package unikom.iifrmdn.data;

public class Avanza implements Car{

    @Override
    public void drive() {
        System.out.println("Avanza Drive..");
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public void setTire() {

    }
}
