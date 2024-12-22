import Entities.item;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static ArrayList<item> items = new ArrayList<>();
    static String path;

    public static void main(String[] args) throws IOException {

        try(Scanner sc = new Scanner(System.in)){

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
            path = sc.next();
            sc.nextLine();

            escreveLinhas(path);
        }
    }

    public static String[] montaLinhas(ArrayList items){
        String[] linhas = new String[items.size()];
        for(Object i : items){
            int cont = 0;
            linhas[cont] = i.toString();
        }

        return linhas;
    }

    public static void escreveLinhas(String strPath) throws IOException {
        String[] linhas = montaLinhas(items);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))){
            for(String linha : linhas){
                bw.write(linha);
                bw.newLine();
            }
        }catch (IOException e){
            new File(strPath + "\\arq0001").createNewFile();
            System.out.println("Programa terminado pois o diretorio esta vazio. arq001 foi criado voce pode utiliza-lo");
        }
    }
}

