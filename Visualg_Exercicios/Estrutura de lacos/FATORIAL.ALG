Algoritmo "fatorial"

//Problema "fatorial" (adaptado de URI 1153)
//Fazer um programa para ler um número natural N (valor máximo: 15), e depois
//calcular e mostrar o fatorial de N.

Var

n, i, fatorial : inteiro


Inicio

      escreval("Digite o valor de N : ")
      leia(n)
      
      se n > 15 entao
         escreval ("Numero muito grande !")
      senao

         fatorial <- n * (n - 1)

         se  (n <= 1) entao
              fatorial <- 1
         senao
              n <- n - 1
              i <- n - 1
         fimse

         para i de i ate 1 passo - 1 faca
              fatorial <- fatorial  * i
              i <- i - 1
         fimpara

         escreval("Fatorial : ", fatorial)

      fimse


Fimalgoritmo

// NA RESOLUCAO DO EXECICIO FOI ULTILZADO A LOGICA INVERSA , AO INVES DE CONTAR
// N * N - 1 , ELE FEZ 1 * I + N OUSEJA : EU ULTILIZEI A FORMA DESCRESCENTE E ELE
// A CRESCENTE
