Algoritmo "media_pares"

Var

n, i, soma, nPar : inteiro
vet:vetor[0..9] de inteiro
media :real

Inicio

      escreva("Quantos elementos vai ter o vetor :")
      leia(n)
      
      repita
            escreva("Digite um numero : ")
            leia(vet[i])
            i <- i + 1
      ate i = n
      
      para i de 0 ate n - 1 passo 1 faca
           se vet[i] % 2 = 0 entao
              soma <- soma + vet[i]
              nPar <- nPar + 1
           fimse
      fimpara

      se soma = 0 entao
         escreval("NENHUM NUMERO PAR!")
      senao
         media <- soma / nPar
         escreval("MEDIA DOS PARES : ", media)
      fimse

Fimalgoritmo