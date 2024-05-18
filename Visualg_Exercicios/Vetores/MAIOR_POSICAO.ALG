Algoritmo "MAIOR_POSICAO"

Var

n,i, posicao:inteiro
vet : vetor [0..9] de real
maior : real

Inicio

      escreva("Quantos numeros voce vai digitar ?")
      leia(n)
      
      repita
            escreva("Digite um nuumero : ")
            leia(vet[i])
            i <- i + 1
      ate i = n
      
      para i de 0 ate n - 1 passo 1 faca
           se vet[i] > maior entao
              maior <- vet[i]
              posicao <- i
           fimse
      fimpara
      
      escreval()
      escreva("MAIOR VALOR =", maior)
      escreval()
      escreva("POSICAO DO MAIOR VALOR =",posicao)



Fimalgoritmo