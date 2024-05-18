Algoritmo "MenorDeTres"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 
//  Problema "menor_de_tres"
//  
// Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
// menor dentre os três números lidos. Em caso de empate, mostrar apenas
//uma vez.

Var

val1,val2,val3 : inteiro


Inicio

   escreval("Digite o primeiro valor")
   leia(val1)
   escreval("Digite o segundo valor")
   leia(val2)
   escreval("Digite o terceiro valor")
   leia(val3)


   se (val1 < val2) e (val1 < val3) entao
      escreva("Menor = ", val1)
   senao
        se (val2 < val3) entao
           escreva("Menor = ", val2)
   senao
      escreva("Menor = ", val3)
   fimse
   fimse

Fimalgoritmo

//minha logic nao foi concluid pois precisava saber a sintaxe de senao se
//entao só acertei até a parte da primeira condição