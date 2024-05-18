import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        String sexo;
        int refrigerante,cerveja,espetinho;
        double artistico = 0 , precoIn = 0, precoRefri, precoCer, precoEspe, consumo, valorTot;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sexo : ");
        sexo = sc.next();
        System.out.println("Quantidade de cervejas:");
        cerveja = sc.nextInt();
        System.out.println("Quantidade de refrigerantes:");
        refrigerante = sc.nextInt();
        System.out.println("Quantidade de espetinhos:");
        espetinho = sc.nextInt();
        sc.close();

        precoCer = cerveja * 5;
        precoRefri = refrigerante * 3;
        precoEspe = espetinho * 7;
        consumo = precoCer + precoRefri + precoEspe;

        System.out.println(" RELATÓRIO : ");
        System.out.println(" Consumo : " + consumo);

        if (consumo < 30 ){
            artistico = 4;
            System.out.println(" Artistico : " + artistico);
        }else {
            System.out.println(" Isento de Couvert! ");
        }

        if (sexo.equals("m") || sexo.equals("M") ) {
            precoIn += 10;
        }else if (sexo.equals("f") || sexo.equals("F") ){
            precoIn += 8;
        }

        System.out.println(" Ingresso : " + precoIn);

        valorTot = consumo + artistico + precoIn;

        System.out.println("\n" +
                " Valor a pagar : " + valorTot);

    }
}
