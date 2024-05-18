Algoritmo "media_ponderada"

//Problema "media_ponderada" (adaptado de URI 1079)
//Leia um valor inteiro N, que representa o número de casos de teste que vem
//a seguir. Cada caso de teste consiste de 3 valores reais, para os quais você
//deverá calcular e mostrar a média ponderada, sendo que o primeiro valor tem
//peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
//Vale lembrar que a média ponderada é a soma de todos os valores multiplicados
//pelo seu respectivo peso, dividida pela soma dos pesos.
Var

n, i : inteiro

n1, n2, n3, media : real


Inicio

      escreval("Quantos casos voce vai digitar")
      leia(n)

      repita

           escreval("Digite tres numeros : ")
           leia(n1)
           leia(n2)
           leia(n3)
           
           media <- ((n1 * 2) + (n2 * 3) + (n3 * 5))/10
           escreval("MEDIA = ", media)
           
           i <- i + 1
           
      ate i = n

Fimalgoritmo

//USEI O REPITA ATE AO INVES DE PARA