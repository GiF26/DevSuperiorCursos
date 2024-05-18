Algoritmo "matriz_geral"

Var

n , i, j : inteiro
soma, quadrado : real
mat : vetor [0..9, 0..9] de real

Inicio

      escreva("Qual a ordem da matriz: ")
      leia(n)

      para i de 0 ate n - 1 faca
          para j de 0 ate n - 1 faca
              escreva("Elemento [", i , "," , j, "]: ")
              leia(mat[i,j])
          fimpara
      fimpara

       para i de 0 ate n - 1 faca
          para j  de 0 ate n - 1 faca
             se mat[i,j] > 0 entao
                soma <- soma + mat[i,j]
             fimse
          fimpara
      fimpara

      escreval("SOMA DOS POSITIVOS", soma:3:1)
      escreval()

      escreva("escolha uma linha : ")
      leia(i)
      escreva("LINHA ESCOLHIDA :")
      para j  de 0 ate n - 1 faca
         escreva(mat[i,j]:3:1, " ")
      fimpara

      escreval()

      escreval()
      escreva("escolha uma coluna : ")
      leia(j)
      escreva("COLUNA ESCOLHIDA ")
      para i  de 0 ate n - 1 faca
         escreva(mat[i,j], " ")
      fimpara

      escreval()

      escreval()
      escreva("DIAGONAL PRINCIPAL = ")
      para i de 0 ate n - 1 faca
         escreva(mat[i,i]:3:1, " ")
      fimpara
      
      escreval()

      escreval()
      escreval("MATRIZ ALTERADA : ")
      para i de 0 ate n - 1 faca
          para j  de 0 ate n - 1 faca
             se mat[i,j] < 0 entao
                escreva(mat[i,j] ^2)
             senao
                escreva(mat[i,j])
             fimse
          fimpara
          escreval()
      fimpara

Fimalgoritmo