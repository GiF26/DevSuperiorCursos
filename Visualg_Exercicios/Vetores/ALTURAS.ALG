Algoritmo "alturas"

Var

n,i : inteiro

nomeV : vetor [0..9] de caractere
idadeV : vetor [0..9] de inteiro
alturaV : vetor [0..9] de real

alturaMed, menorPorcent, somaMenor, somaAlt : real

Inicio

      escreva("Quantas pessoas serao digitadas ")
      leia(n)

      repita
         escreval("Dados da ", i + 1 , " pessoa :")
         escreva("Nome : ")
         leia(nomeV[i])
         escreva("Idade : ")
         leia(idadeV[i])
         escreva("Altura : ")
         leia(alturaV[i])
         i <- i + 1
      ate i = n

      para i de 0 ate n passo 1 faca
           somaAlt <- somaAlt + alturaV[i]
      fimpara
      
      alturaMed <- somaAlt / n
      
      escreva("Altura Media : ", alturaMed:3:2)
      
      escreval()
      
      para i de 0 ate n - 1 passo 1 faca
           se idadeV[i] < 16 entao
              somaMenor <- somaMenor + 1
           fimse
      fimpara
      
      menorPorcent <- (somaMenor * 100) / n
      
      escreval("Pessoas com menos de 16 anos : ", menorPorcent:3:1," % ")
      
      para i de 0 ate n passo 1 faca
           se idadeV[i] < 16 entao
              escreval(nomeV[i])
           fimse
      fimpara
      

Fimalgoritmo