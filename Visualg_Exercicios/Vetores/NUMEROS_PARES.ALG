Algoritmo "numeros_pares"

Var

n,i,quantidadePar: inteiro

vet : vetor [0..9] de inteiro

Inicio

      escreva("Quantos numeros voce vai digitar ?")
      leia (n)
      
      repita
            escreva("Digite um numero :")
            leia(vet[i])
            i <- i + 1
      ate i = n
      
      escreval()

      escreval("NUMEROS PARES :")

      para i de 0 ate n - 1 passo 1 faca
           se vet[i]%2 = 0 entao
              escreva(vet[i])
              quantidadePar <- quantidadePar + 1
           fimse
      fimpara
      
      escreval()
      
      escreva("QUANTIDADE DE PARES = " ,quantidadePar)

Fimalgoritmo