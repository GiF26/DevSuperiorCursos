Algoritmo "MenorDeTres"
// Disciplina   : [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 
//  Problema "menor_de_tres"
//  
// Fazer um programa para ler tr�s n�meros inteiros. Em seguida, mostrar qual o
// menor dentre os tr�s n�meros lidos. Em caso de empate, mostrar apenas
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
//entao s� acertei at� a parte da primeira condi��o