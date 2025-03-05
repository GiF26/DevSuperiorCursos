package src;

import Objects.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main_Desafio {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Entre o caminho do arquivo:");
            String caminho = sc.next();

            try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

                List<Sale> lista = new ArrayList<>();

                String line  = br.readLine();
                while (line != null){
                    String[] fields = line.split(",");
                    lista.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]),
                            fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
                    line = br.readLine();
                }

               List<Sale> listaOrdenada =  lista.stream()
                        .filter(x -> x.getYear() == 2016)
                        .sorted((x, y) -> Double.compare(y.averagePrice(), x.averagePrice()))
                        .limit(5).collect(Collectors.toList());

                System.out.println("\nCinco primeiras vendas de 2016 de maior preço médio");
                listaOrdenada.forEach(System.out::println);

                double totalLogan = lista.stream()
                        .filter(x -> x.getSeller().equals("Logan") && (x.getMonth() == 1 || x.getMonth() == 7))
                        .map(x -> x.getTotal())
                        .reduce(0.0, (x, y) -> x + y);
                System.out.printf("\nValor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f", totalLogan);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
