Algoritmo "diagonal_negativos"

Var
n , i, j, negativos : inteiro
mat : vetor[0..5, 0..5] de inteiro

Inicio

      escreva("Qual a ordem da matriz: ")
      leia(n)
      
      para i de 0 ate n - 1 faca
          para j de 0 ate n - 1 faca
              escreva("Elemento [", i , "," , j, "]: ")
              leia(mat[i,j])
          fimpara
      fimpara
      
      escreval("DIAGONAL PRINCIPAL: ")
      para i de 0 ate n - 1 faca
          para j de 0 ate n - 1 faca
              se i = j entao
                 escreva(mat[i,j] , " ")
              fimse

              se mat[i,j] < 0 entao
                 negativos <- negativos + 1
              fimse
          fimpara
      fimpara

      escreval()
      escreva("QUANTIDADE DE NEGATIVOS = ", negativos)

Fimalgoritmo

//EXERCICIO CORRETO MAS INVES DE USAR A CONDICAO DE QUE I  E J DEVERIAM SER
//IGUAIS , EU PODERIA TER SO COLOCADO MAT[I,I]