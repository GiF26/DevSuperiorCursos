Algoritmo "soma_vetor"

Var

n, i : inteiro
v : vetor [0..9] de real
soma, media : real

Inicio

      escreva("Quantos numeros voce vai digitar ?")
      leia(n)
      
      repita
         escreva("Digite um numero : ")
         leia(v[i])
         i <- i + 1
      ate i = n
      
      escreva("VALORES")

      para i de 0 ate n passo 1 faca
         se v[i] <> 0 entao
            escreva(v[i]:4:1, ", ")
         fimse
         soma <- soma + v[i]
      fimpara
      
      escreval()

      media <- soma/n

      escreval("SOMA = ", soma)
      escreval("MEDIA = ", media)

Fimalgoritmo

//exercicio correto porem uma boa pratica seria fazer um laco para soma