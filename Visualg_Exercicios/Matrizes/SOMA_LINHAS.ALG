Algoritmo "soma_linhas"

Var
m , n , i, j : inteiro
soma : real
mat : vetor [0..5, 0..5] de real
vet : vetor [0..5] de real

Inicio

      escreva("Qual a quantidade de linhas da matriz: ")
      leia(m)
      escreva("Qual a quantidade de colunas da matriz: ")
      leia(n)
      
      se m > 10 ou n > 10 entao
         escreva("Numero invalido")
      senao
      
         para i de 0 ate m - 1 faca
             para j  de 0 ate n - 1 faca
                escreva("Digite os elementos da ", i + 1 , "a. linha: ")
                leia(mat[i,j])
             fimpara
         fimpara


         escreval("VETOR GERADO : ")
          para i de 0 ate m - 1 faca
             para j  de 0 ate n - 1 faca
                soma <- soma + mat[i,j]
             fimpara

             vet[i] <- soma
             escreval(vet[i])
             soma <- 0
         fimpara
         
      fimse

Fimalgoritmo

//ele fez a somatoria atribuinbdo no vetor