package com.gla.CustomSortinInEcommerce;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 50000, 4.5, 10));
        products.add(new Product("Phone", 20000, 4.7, 20));
        products.add(new Product("Tablet", 30000, 4.2, 15));

        String sortBy="rating";
        Comparator<Product>comparator;

        switch (sortBy){
            case  "price":
                comparator=(p1,p2) -> p1.price-p2.price;
                break;

            case "rating":
                comparator=(p1,p2) -> Double.compare(p2.rating,p1.rating);
                break;

            case "discount":
                comparator=(p1,p2) -> p2.discount-p1.discount;
                break;

            default:
                comparator=(p1,p2) -> p1.name.compareTo(p2.name);
        }
        products.sort(comparator);

        for (Product p:products){
            System.out.println(p.name+" | Price:"+p.price+" | Rating:"+p.rating+" | Discount:"+p.discount);
        }
    }
}
