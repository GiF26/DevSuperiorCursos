Algoritmo "multiplos"
// Problema "multiplos" (adaptado de URI 1044)

//Fazer um programa para ler dois n�meros inteiros, e dizer se um n�mero �
//m�ltiplo do outro. Os n�meros podem ser digitados em qualquer ordem.

Var

num1,num2 : inteiro

Inicio
      escreval("Digite dois numeros inteiros : ")
      leia(num1)
      leia(num2)

      se (num1 % num2 = 0) ou (num2 % num1 = 0) entao
         escreval("S�o multiplos")
      senao
         escreval("N�o s�o multiplos")
      fimse

Fimalgoritmo

//l�gica correta , exercicio foi pensado da mesma forma que a corre��o