import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            Set<Integer> a = new HashSet<>();
            Set<Integer> b = new HashSet<>();
            Set<Integer> c = new HashSet<>();

            System.out.println("How many students for course A?");
            int qtd = sc.nextInt();

            for (int i = 0; i < qtd; i++){
                a.add(sc.nextInt());
            }

            System.out.println("How many students for course B?");
            qtd = sc.nextInt();

            for (int i = 0; i < qtd; i++){
                b.add(sc.nextInt());
            }

            System.out.println("How many students for course C?");
            qtd = sc.nextInt();

            for (int i = 0; i < qtd; i++){
                c.add(sc.nextInt());
            }

            Set<Integer> total = new HashSet<>(a);
            total.addAll(b);
            total.addAll(c);

            System.out.println("Total students: " + total.size());
        }
    }
}

//How many students for course A? 3
//        21
//        35
//        22
//How many students for course B? 2
//        21
//        50
//How many students for course C? 3
//        42
//        35
//        13
//Total students: 6]