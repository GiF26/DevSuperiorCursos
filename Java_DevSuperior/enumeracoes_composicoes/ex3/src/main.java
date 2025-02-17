package ex3.src;

import ex3.Objects.*;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            /**** Criação do cliente *****/
            System.out.println("Enter cliente data:");
            System.out.println("Name:");
            String nome = sc.nextLine();
            System.out.println("Email:");
            String email = sc.next();
            System.out.println("Birth");
            String birth = sc.next();
            Client client = new Client(nome, email, dateFormat.parse(birth));
            /**** Fim da criação do cliente *****/

            /**** Criação do order *****/
            System.out.println("Enter order data:");
            Order o = new Order();
            System.out.println("Enter status");
            o.setStatus(OrderStatus.valueOf(sc.next().toUpperCase()));
            o.setMoment(Date.from(Instant.now()));
            System.out.println(o.getMoment() + " - " + o.getStatus());
            client.setOrder(o);
            /**** Fim da criação do order *****/

            /**** Criação do orderItem e produtos *****/
            System.out.println("How many items to this order?");
            int qtyItens = sc.nextInt();

            for(int i = 0; i < qtyItens; i++){
                OrderItem oi = new OrderItem();
                Product p = new Product();
                System.out.println("Enter #" + (i + 1) + " item data:");
                sc.nextLine();
                System.out.println("Product name:");
                p.setName(sc.next());
                System.out.println("Product price:");
                p.setPrice(sc.nextDouble());
                oi.setPrice(p.getPrice());
                System.out.println("Quantity:");
                oi.setQuantity(sc.nextInt());

                oi.setP(p);
                client.getOrder().addItem(oi);
            }
            /**** Fim da criação do orderItem e produtos *****/

            System.out.println("ORDER SUMMARY:");
            System.out.println("Order moment: " + client.getOrder().getMoment().toLocaleString());
            System.out.println("Order status: " + client.getOrder().getStatus());
            System.out.println(client);

            System.out.println("Order items:");
            for(int i = 0; i < client.getOrder().getOrderItems().size(); i++){
                Product p = client.getOrder().getOrderItems().get(i).getP();
                System.out.println(p.getName() +
                            ", $" + p.getPrice() +
                            ", Quantity: " + client.getOrder().getOrderItems().get(i).getQuantity() +
                            ", Subtotal: " + client.getOrder().getOrderItems().get(i).subtotal());
            }

            System.out.println("Total price: " + o.total());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
