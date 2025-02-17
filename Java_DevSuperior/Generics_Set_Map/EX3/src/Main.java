import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            boolean decision = true;

            HashSet<String> listaNomes = new HashSet<>();

            while (decision){
                System.out.println("Escreva 'sair' caso queira sair do sistema.");

                System.out.println("\nLista de nomes armazenados:");
                if (listaNomes.isEmpty()) {
                    System.out.println("[Nenhum nome armazenado até agora]");
                } else {
                    listaNomes.forEach(System.out::println);
                    System.out.println("---------------------------------------");
                }

                    System.out.println("Digite um nome");
                    String nome = sc.nextLine();

                if (nome.equalsIgnoreCase("sair")) {
                    decision = false;
                    System.out.println("Saindo do programa...");
                } else if (listaNomes.contains(nome)) {
                    System.out.println("Nome já existente! Por favor, tente outro.");
                } else {
                    listaNomes.add(nome);
                    System.out.println("Nome '" + nome + "' armazenado com sucesso!");
                }
            }

            System.out.println("\nLista final de nomes armazenados:");
            listaNomes.forEach(System.out::println);

        }
    }
}