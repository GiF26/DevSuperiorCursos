Algoritmo "mediaidades"
//Problema "media_idades"
//Faça um programa para ler um número indeterminado de dados, contendo cada um,
//a idade de um indivíduo.
//O último dado, que não entrará nos cálculos, contém um valor de idade negativa.
//Calcular e imprimir a idade média
//deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
//mostrar a mensagem "IMPOSSIVEL CALCULAR".
Var

idade , soma, contador : inteiro
media : real

Inicio

      soma <- 0
      contador <- 0

      escreval("Digite sua idade : ")
      leia (idade)
      
      soma <- soma + idade
      contador <- contador + 1
      
      se idade < 0 entao
         escreval("IMPOSSIVEL CALCULAR : ")
      fimse

      enquanto idade >= 0 faca
      
         escreval("Digite sua idade : ")
         leia (idade)

         se idade >= 0 entao
            soma <- soma + idade
            contador <- contador + 1
         fimse

      fimenquanto
      
      media <- soma/contador
      
      escreval("MEDIA = ", media:6:2)




Fimalgoritmo