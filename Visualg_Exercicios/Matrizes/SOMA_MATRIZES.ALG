Algoritmo "soma_matrizes"

Var

m, n , i, j : inteiro
a : vetor [0..5, 0..5] de inteiro
b : vetor [0..5, 0..5] de inteiro
c : vetor [0..5, 0..5] de inteiro

Inicio

      escreva("Qual a quantidade de linhas da matriz: ")
      leia(m)
      escreva("Qual a quantidade de colunas da matriz: ")
      leia(n)

      escreval("Escreva os valores das matriz A")
      para i de 0 ate m - 1 faca
          para j de 0 ate n - 1 faca
              escreva("Elemento [", i , "," , j, "]: ")
              leia(a[i,j])
          fimpara
      fimpara
      
      escreval("Escreva os valores das matriz B")
      para i de 0 ate m - 1 faca
          para j de 0 ate n - 1 faca
              escreva("Elemento [", i , "," , j, "]: ")
              leia(b[i,j])
          fimpara
      fimpara

       para i de 0 ate m - 1 faca
          para j  de 0 ate n - 1 faca
             c[i,j] <- a[i,j] + b[i,j]
             escreva(c[i,j], " ")
          fimpara
          escreval()
      fimpara

Fimalgoritmo

//logica esta correta com a diferenca que eu usei um laco so para somar
//e exibir a matriz , ja ele preferiu separar as matrizes