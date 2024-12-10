package ex2.src;

import ex2.Objects.ImportedProduct;
import ex2.Objects.Product;
import ex2.Objects.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Product> products = new ArrayList<>();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Enter the number of products:");
            int qtd = sc.nextInt();

            for(int i = 0; i < qtd; i++){
                Product p = new Product();
                System.out.println("Product #" + (i+1) + " data:");
                System.out.println("Common, used or imported (c/u/i)");
                char decision = sc.next().charAt(0);
                System.out.println("Name:");
                p.setName(sc.next());
                System.out.println("Price:");
                p.setPrice(sc.nextDouble());

                switch (decision){
                    case 'i':
                        System.out.println("Customs Fee:");
                        double customFee = sc.nextDouble();
                        ImportedProduct importedProduct = new ImportedProduct(p.getName(), p.getPrice(), customFee);
                        products.add(importedProduct);
                        break;

                    case 'u':
                        System.out.println("Manufacture date (DD/MM/YYYY):");
                        String dateManufacture = sc.next();
                        Date dataFormatada = dateFormat.parse(dateManufacture);
                        UsedProduct usedProduct = new UsedProduct(p.getName(), p.getPrice(), dataFormatada);
                        products.add(usedProduct);
                        break;

                    default:
                        products.add(p);
                        break;
                }
            }
            System.out.println("PRICE TAGS:");
            for(Product o : products){
                System.out.println(o.priceTag());
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
