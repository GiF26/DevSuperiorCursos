package part2.src;

import part1.Objects.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre o caminho do arquivo:");
            String caminho = sc.next();

            try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

                List<Sale> lista = new ArrayList<>();

                String line = br.readLine();
                while (line != null) {
                    String[] fields = line.split(",");
                    lista.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]),
                            fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
                    line = br.readLine();
                }

                Map<String, Double> totalPorVendedor = lista.stream()
                        .collect(Collectors.groupingBy( Sale::getSeller,
                                Collectors.summingDouble(Sale::getTotal)
                        ));

                System.out.println("\nTotal de vendas por vendedor:");
                totalPorVendedor.forEach((vendedor, total) ->
                        System.out.printf("%s - R$ %.2f\n", vendedor, total)
                );

            } catch (IOException e) {
                // Verifica se o erro é "arquivo não encontrado"
                if (e.getMessage().contains("O sistema não pode encontrar o arquivo especificado")) {
                    System.out.println("Erro: " + caminho + " (O sistema não pode encontrar o arquivo especificado)");
                } else {
                    System.out.println("Erro: " + e.getMessage()); // Outros erros de IO
                }
            }
        }
    }
}
