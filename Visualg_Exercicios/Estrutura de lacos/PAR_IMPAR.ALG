Algoritmo "par_impar"

//Problema "par_impar" (adaptado de URI 1074)
//Leia um valor inteiro N. Este valor ser� a quantidade de n�meros inteiros
//que ser�o lidos em seguida.Para cada valor lido, mostre uma mensagem dizendo
//se este valor lido � PAR ou IMPAR, e tamb�m se � POSITIVO ou NEGATIVO.
//No caso do valor ser igual a zero (0), seu programa dever� imprimir
//apenas NULO.

Var
n, x: inteiro

parOuImpar, PosiNegaNulo : caractere

Inicio

      escreval("quantos numeros voce vai digitar")
      leia(n)

      para n de 1 ate n faca
           escreva("Digite um numero : ")
           leia(x)

           se x % 2 = 0 entao
              parOuImpar <- "PAR"
           senao
              parOuImpar <- "IMPAR"
           fimse
           
           se x  > 0 entao
              PosiNegaNulo <- " POSITIVO"
           senao
           se x < 0 entao
              PosiNegaNulo <- " NEGATIVO"
           senao
              PosiNegaNulo <- " NULO"
              parOuImpar <- ""
           fimse
           fimse
           
           escreval(parOuImpar, PosiNegaNulo)

      fimpara

Fimalgoritmo

//NO EXERCICIO ELE TRATA TODAS AS CONDICOES EM UM BLOCO DE IF SO
//E NAO TRATA CARACTERES