Algoritmo "crescente"

//Problema "crescente" (adaptado de URI 1113)
//Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
//Escreva para cada X e Y uma mensagem que indique se estes valores
//foram digitados em ordem crescente ou decrescente. O
//programa deve finalizar quando forem digitados dois valores iguais.

Var
x, y : inteiro

Inicio

     escreval("Escreva os valores de x e y : ")
     leia(x)
     leia(y)

      enquanto x <> y faca

         se x < y entao
            escreval("Ordem crescente")
         senao
            escreval("Ordem decrescente")
         fimse

         escreval(xAnt, " - ", yAnt)
         
         escreval("Escreva os valores de x e y : ")
         leia(x)
         leia(y

      fimenquanto

Fimalgoritmo
//exercicio foi interpretado de forma errada codigo original :

//xAnt <- 0
//yAnt <- 1
//x <- 0
//y <- 1

   //   enquanto x <> y faca
     //    escreval("Escreva os valores de x e y : ")
       //  leia(x)
         //leia(y)

         //escreval(xAnt, " - ", yAnt)

         //se (x > xAnt) e (y > yAnt) entao
           // escreval("Ordem crescente")
         //senao
           // escreval("Ordem decrescente")
         //fimse

         //xAnt <- x
         //yAnt <- y

      /fimenquanto
