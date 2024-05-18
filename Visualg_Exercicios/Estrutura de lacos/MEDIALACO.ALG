Algoritmo "validacaodenota"

//Problema "validacao_de_nota" (adaptado de URI 1117)
//Faça um programa que leia as notas referentes às duas avaliações de um aluno.
//Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
//válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
//ser validada separadamente.

Var
nota1, nota2, media : real


Inicio

      escreval("Digite a primeira nota :")
      leia(nota1)

      enquanto (nota1 < 0) ou (nota1 > 10)  faca
         escreval("Valor invalido!Tente novamente : ")
         leia(nota1)
      fimenquanto
      
      escreval("Digite a segunda nota : ")
      leia(nota2)
      
      enquanto (nota2 < 0) ou (nota2 > 10) faca
         escreval("Valor invalido!Tente novamente : ")
         leia(nota2)
      fimenquanto
      
      media <- (nota1 + nota2) / 2
      
      escreval("MEDIA = ", media)

Fimalgoritmo

//exercicio correto