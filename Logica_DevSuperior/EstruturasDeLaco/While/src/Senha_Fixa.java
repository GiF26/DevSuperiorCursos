package While.src;

import java.util.Scanner;

public class Senha_Fixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002, senhaCli = 0;

        System.out.println("Digite a senha");
        senhaCli = sc.nextInt();

        while (senhaCli != senha){
            System.out.println("Senha Incorreta. Tente novamente");
            senhaCli = sc.nextInt();
        }
        sc.close();

        System.out.println("Acesso Permitido!");
    }
}
