Algoritmo "soma_vetores"

Var

n , i : inteiro
a : vetor [0..9] de inteiro
b : vetor [0..9] de inteiro
c : vetor [0..9] de inteiro

Inicio

      escreva("Quantos valores terá cada vetor ?")
      leia(n)
      
      para i de 0 ate n - 1 passo 1 faca
            escreval("Quantos valores do vetor A :")
            leia(a[i])
            i <- i + 1
      fimpara
      
      para i de 0 ate n - 1 passo 1 faca
            escreval("Quantos valores do vetor B :")
            leia(b[i])
            i <- i + 1
      fimpara
      
      escreval("VETOR RESULTANTE :")
      
      para i de 0 ate n - 1 passo 1 faca
           c[i] <- a[i] + b[i]
           escreval(c[i])
      fimpara



Fimalgoritmo