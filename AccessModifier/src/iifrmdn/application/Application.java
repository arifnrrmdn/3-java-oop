package iifrmdn.application;

import iifrmdn.data.Product;

public class Application {
    public static void main(String[] args) {

        var product1 = new Product("Mie Ayam Bakso",15000);
        System.out.println("Nama Product : " + product1.name);
        System.out.println("Harga Product : " + product1.price);

    }
}
