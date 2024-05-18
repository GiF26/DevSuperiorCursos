Algoritmo "paresconsecutivos"

//O programa deve ler um valor inteiro X indefinidas vezes.

//(O programa irá parar quando o valor de X for igual a 0).

//Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X,
//inclusive o X, se for par.

//Se o valor de entrada for 4, por exemplo, a saída deve ser 40,
//que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de
//entrada for 11, por exemplo, a saída deve ser 80, que é a
//soma de 12+14+16+18+20.


Var

valor, contador, soma, somaImp , i, somaTotal: inteiro

Inicio

valor <- 1

   enquanto valor <> 0 faca

      escreval("Digite um valor :")
      leia(valor)

      soma <- valor + 2

         enquanto i <= 3 faca

            escreval(soma)

            soma <- soma + 2
            somaTotal <- soma + soma
            i <- i + 1

      fimenquanto

      escreval(somaTotal)

   fimenquanto

Fimalgoritmo

//minha solução funciona porem tem um jeito melhor que seria

//        enquanto valor <> faca
//
//           se valor % 2 <> 0 faca
//              valor <- valor + 1
//           fimse

//           soma <- 5 * valor + 20
//           escreval("SOMA = " , soma)

//        fimequanto
        