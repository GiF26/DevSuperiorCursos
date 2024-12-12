package src;

import Objects.Lesson;
import Objects.Task;
import Objects.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            List<Lesson> lessons = new ArrayList<>();

            System.out.println("Quantas aulas tem o curso");
            int qtd = sc.nextInt();
            for(int i = 0; i < qtd; i++){
                System.out.println("Dados da " + (i+1) + "a aula");
                System.out.println("Conteúdo ou tarefa (c/t)?");
                char decision = sc.next().charAt(0);
                System.out.println("Título:");
                String titulo = sc.next();
                sc.nextLine();

                if(decision == 'c'){
                    System.out.println("URL do vídeo:");
                    String url = sc.next();
                    System.out.println("Duração em segundos:");
                    int duracao = sc.nextInt();
                    lessons.add(new Video(titulo, url, duracao));
                }else{
                    System.out.println("Descrição:");
                    String descricao = sc.next();
                    sc.nextLine();
                    System.out.println("Quantidade de questões:");
                    int qtdQuestoes = sc.nextInt();
                    lessons.add(new Task(titulo, descricao, qtdQuestoes));
                }
            }
            int duracaoTotal = 0;
            for(Lesson o: lessons){
                duracaoTotal += o.duration();
            }
            System.out.println("DURAÇÃO TOAL DO CURSO = " + duracaoTotal);
        }
    }
}
