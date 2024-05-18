Algoritmo "cada_linha"

Var
n , i, j, maior : inteiro
mat : vetor [0..5, 0..5] de inteiro

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
             se maior < mat[i,j] entao
                maior <- mat[i,j]
             fimse
          fimpara
          escreval(maior)
          maior <- 0
      fimpara


Fimalgoritmo

//LOGICA CORRETA POREM A DIFERENCA É QUE EM VEZ DE ZERAR A VARIAVEL "MAIOR"
//, ELE ZERA APENAS O J NO COMECO/RECOMECO DO LACO