public class Student {
    public static String nome;
    public static double nota1;
    public static double nota2;
    public static double nota3;

    public double statusAluno() {
        String status;
        double somaTotalTrimestes = 30 + 35 + 35;
        double mediaAluno = (nota1 + nota2 +  nota3 ) / 3;

//        if(mediaAluno <= mediaAluno * 60 / 100.0){
//            trataAlunoReprovado()
//        }

        return mediaAluno;

    }

    public double trataAlunoReprovado(){



        return 0;
    }

    @Override
    public String toString() {
        return "NOTA FINAL = " + statusAluno();
    }

//    Alex Green
//        27.00
//        31.00
//        32.00
//    NOTA FINAL = 90.00
//    PASS
}
