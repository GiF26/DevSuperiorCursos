package While.src;

import java.util.Scanner;

public class Media_Idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0, somaIdades = 0;
        double mediaIdades = 0, idadeCont = 0;

        System.out.println("Digite um idade: ");
        idade = sc.nextInt();

        if (idade <= 0) {
            System.out.println("Impossivel calcular!");
        } else {
            while (idade >= 0) {
                somaIdades += idade;
                idade = sc.nextInt();
                idadeCont++;
            }

            sc.close();

            mediaIdades = somaIdades / idadeCont;
            System.out.printf("Media das idades: %.2f\n", mediaIdades);
        }
    }
}
