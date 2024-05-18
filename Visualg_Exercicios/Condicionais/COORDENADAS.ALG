Algoritmo "coordenadas"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

//Leia os valores das coordenadas X e Y de um ponto no plano
//cartesiano. A seguir, determine qual o quadrante ao qual pertence o
//ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem, escreva a
//mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
//“Eixo X” ou “Eixo Y”, conforme for a situação.

Var

x,y :inteiro
quadrante,eixo :caractere

Inicio
      escreval(" Escreva as coordenadas : ")
      leia(x)
      leia(y)
      
      se (x > 0) e (y > 0) entao
         quadrante <- "Quadrante 1 "
      fimse
      se (x < 0) e (y > 0) entao
         quadrante <- "Quadrante 2 "
      fimse
      se (x < 0) e (y < 0) entao
         quadrante <- "Quadrante 3 "
      fimse
      se (x > 0) e (y < 0) entao
         quadrante <- "Quadrante 4 "
      fimse
      se (x = 0) e (y = 0) entao
         quadrante <- "Origem "
      fimse
      se x = 0 entao
         eixo <- "eixo y "
         escreval(eixo)
      fimse
      se y = 0 entao
         eixo <- "eixo x "
         escreval(eixo)
      fimse
      
      escreval(Quadrante)

Fimalgoritmo