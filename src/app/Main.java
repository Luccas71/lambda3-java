package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.ProductService;

public class Main {

    public static void main(String[] args) {
        
               Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Mouse", 90.0));
        list.add(new Product("Mousepad", 45.0));
        list.add(new Product("Monitor", 400.0));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');

        System.out.println("Sum: " + sum);
    }
}