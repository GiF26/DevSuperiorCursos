Algoritmo "menordetodos"

funcao menor(a : inteiro ; b : inteiro ; c : inteiro) : inteiro
       var menorNu : inteiro
inicio
      se (a < b) ou (a < c) entao
         menorNu <- a
      fimse
      se (b < a) ou (b < c) entao
         menorNu <- b
      senao
           menorNu <- c
      fimse

      retorne menorNu

fimfuncao


Var

i, a, b, c : inteiro
Inicio

      escreval("Digite tres numeros inteiros")
      leia(a)
      leia(b)
      leia(c)

      escreval("Menor = " , menor(a,b,c))

Fimalgoritmo