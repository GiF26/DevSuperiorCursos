import Entities.item;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        try(Scanner sc = new Scanner(System.in)){

            ArrayList<item> items = new ArrayList<>();
            ArrayList<item> itemsValor = new ArrayList<>();

            System.out.println("Quantos Produtos voce deseja adicionar ?");
            int qtd = sc.nextInt();

            for(int i = 0; i < qtd; i++){
                item item = new item();

                System.out.println("Nome do item: ");
                item.setNome(sc.next());
                sc.nextLine();
                System.out.println("Preco: ");
                item.setPrecoUnitario(sc.nextDouble());
                System.out.println("Quantidade");
                item.setQuantidade(sc.nextInt());

                items.add(item);
            }

            System.out.println("Digite o caminho que deseja criar o arquivo");
            String path = sc.next();
            sc.nextLine();

            String[] linhas = new String[items.size()];

            for(int i = 0; i < items.size(); i++){
                linhas[i] = items.get(i).toString();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                for(String linha : linhas){
                    bw.write(linha);
                    bw.newLine();
                }

                System.out.println("Deseja criar um relatorio com valor total dos items vendidos? s/n");
                char decision = sc.next().charAt(0);

                if(decision == 's'){
                    boolean relatorioVenda = new File(path + "\\relatorioDeVendas.csv").createNewFile();
                    path = path + "\\relatorioDeVendas.csv";

                    for(int i = 0; i < itemsValor.size(); i++){
                        linhas[i] = items.get(i).getNome() + "," + items.get(i).valorTotal();
                    }

                    try(BufferedWriter bw2 = new BufferedWriter(new FileWriter(path))) {
                        for (String linha : linhas) {
                            bw2.write(linha);
                            bw2.newLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }catch (IOException e){
                System.out.println("Programa terminado pois o arquivo nao foi localizado");
            }
        }
    }
}

//TV LED,1290.99,1
//Video Game Chair,350.50,3
//Iphone X,900.00,2
//Samsung Galaxy 9,850.00,2
