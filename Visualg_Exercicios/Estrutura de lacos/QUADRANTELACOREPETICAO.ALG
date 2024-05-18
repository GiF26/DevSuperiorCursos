Algoritmo "quadrantelacomrepeticao"

//Problema "quadrante" (adaptado de URI 1115)
//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
//indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
//quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). O algoritmo será encerrado
//quando pelo menos uma de duas coordenadas for NULA (nesta situação sem
//escrever mensagem alguma).
Var
x,y : inteiro


Inicio
x <- 1
y <- 1

      enquanto (x <> 0) e (y <> 0) faca
         escreval("Digite os valores das coordenadas X e Y :")
         leia(x)
         leia(y)
         
         se (x > 0) e (y > 0) entao
            escreva ("Quadrante 1 ")
         fimse
         se (x < 0) e (y > 0) entao
            escreva ("Quadrante 2 ")
         fimse
          se (x < 0) e (y < 0) entao
            escreva ("Quadrante 3 ")
         fimse
         se (x > 0) e (y < 0) entao
            escreva ("Quadrante 4 ")
         fimse
      fimenquanto
         


Fimalgoritmo

//necessario ser "e" do que ou (estou fazendo primeiro depois olhare a solucao)

//minha solução esta um pouco diferente pq ja leio o valor dentro do laço
//porem esta correta
