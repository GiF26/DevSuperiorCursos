import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter full file path:");
            String pathFile = sc.next();

            try(BufferedReader bf = new BufferedReader(new FileReader(pathFile))){
                List<Product> lista = new ArrayList<>();

                String line  = bf.readLine();
                while (line != null){
                    System.out.println(line);
                    String[] fields = line.split(",");
                    lista.add(new Product(fields[0], Double.parseDouble(fields[1])));
                    line = bf.readLine();
                }

                // localiza valores do objeto produto na lista
                // inicia valor com 0
                // x = numero entrada y = numero saida (soma to entrada com a ultima saida)
                // soma valores e divide pelo tamanho da lista
                double mediaVal = lista.stream()
                        .map(p -> p.getValor()). // Pega valor do produto
                        reduce(0.0, (x,y) -> x + y) / lista.size();

                System.out.println(mediaVal);

                //Compara e tranforma em maiusculo
                Comparator<String> comp = Comparator.comparing(String::toUpperCase);

                //filtra a lista pelo valor menor do que a media
                //pega a descrição na lista ordenada pela ordem invertida (de Z á A)
                //tranforma a coleção em lista
                List<String> names = lista.stream()
                        .filter(p -> p.getValor() < mediaVal)
                        .map(p -> p.getDescricao()).sorted(comp.reversed())
                        .collect(Collectors.toList());

                names.forEach(System.out::println);


            }
        }
    }
}

//Fazer um programa para ler um conjunto de produtos a partir de um arquivo em formato .csv (suponha que exista pelo menos um produto).
//Em seguida mostrar o preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos produtos que possuem preço
//inferior ao preço médio.

