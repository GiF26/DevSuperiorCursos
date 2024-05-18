Algoritmo "abaixo_da_media"

Var

n , i : inteiro
vet : vetor [0..9] de real
abaixoMed : vetor [0..9] de real
media, soma :real

Inicio

      escreva("Quantos elementos vai ter o vetor ? ")
      leia(n)
      
      repita
            escreva("Digite um numero :")
            leia(vet[i])
            i <- i + 1
      ate i = n
      
      para i de 0 ate n - 1 faca
          soma <- soma + vet[i]
      fimpara
      
      media <- soma/n

      escreva("MEDIA DO VETOR = ", media)
      escreval()

      escreva("ELEMENTOS ABAIXO DA MEDIA :")

      para i de 0 ate n - 1 faca
          se vet[i] < media entao
             escreval(vet[i])
          fimse
      fimpara

Fimalgoritmo