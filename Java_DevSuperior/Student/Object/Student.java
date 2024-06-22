public class Student {
    public static String nome;
    public static double nota1;
    public static double nota2;
    public static double nota3;
    double somaTotalNotasAlunos;
    double somaTotalTrimestes = 30 + 35 + 35;
    double notaMinima = somaTotalTrimestes * 60/100;

    public boolean statusAluno() {
        somaTotalNotasAlunos = nota1 + nota2 +  nota3 ;

        if(somaTotalNotasAlunos < notaMinima){
            return false;
        }
        return true;
    }

    public double trataAlunoReprovado(){
        return notaMinima - somaTotalNotasAlunos;
    }

    @Override
    public String toString() {
        if(!statusAluno()){
            return "Aluno reprovado! Nota final = " + somaTotalNotasAlunos +
                                    "\nFalta = " + trataAlunoReprovado() + " pontos para a aprovação";
        }
        return "Aluno aprovado!" +
                "\nNota final = " + somaTotalNotasAlunos;
    }
}
