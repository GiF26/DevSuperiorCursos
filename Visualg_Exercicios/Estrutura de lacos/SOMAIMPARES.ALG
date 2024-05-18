Algoritmo "somaimpares"
//Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e
//mostre a soma dos números impares entre eles.

Var

x, y, troca, soma, contador : inteiro


Inicio

         escreval("Digite dois numeros")
         leia(x)
         leia(y)
         
         troca <- x
         
         se x > y entao
            x <- y
            y <- troca
         fimse
         
         se (x < 0) ou (y < 0) entao

            para x de x ate y - 1 faca
               se x % 2 = 0 entao
                  contador <- contador + 1
               senao
                  contador <- contador + 2
               fimse

               soma <- x + contador
            fimpara
            
            escreval(soma)
            
         senao

            para x de x ate y - 1 faca

            se troca % 2 = 0 entao
               contador <- contador + 1
            senao
               contador <- contador + 2
            fimse

            soma <- x + contador

            fimpara

         escreval(soma)
            
         fimse


Fimalgoritmo

//minha resolucao ficou certa para os numeros acima de mas nao para abaixo o
//correto seria apenas

// ****** até a condicao da troca e as variaveis o exercicio foi feito
//corretamente

//soma <- 0
//para contador de x + 1 ate y - 1 faca
    // se contador % 2 <> 0 entao
      //  soma <- soma + contador
     //fimse
//fimpara

//escreval(soma)

