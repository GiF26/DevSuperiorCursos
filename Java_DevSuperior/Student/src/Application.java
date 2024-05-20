import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();

        obj.nome = sc.nextLine();
        obj.nota1 = sc.nextDouble();
        obj.nota2 = sc.nextDouble();
        obj.nota3 = sc.nextDouble();

        System.out.println(obj.statusAluno());

        if(obj.statusAluno() <= obj.statusAluno() * 60 / 100.0){
            obj.trataAlunoReprovado();
        }else{
            System.out.println("APROVADO");
        }

        //    Alex Green
//        27.00
//        31.00
//        32.00
//    NOTA FINAL = 90.00
//    PASS

//        Alex Green
//        17.00
//        20.00
//        15.00
//        NOTA FINAL = 52.00
//        FAILED
//        FALTARAM 8.00 PONTOS
    }
}
