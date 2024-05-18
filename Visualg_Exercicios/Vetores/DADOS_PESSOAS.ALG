Algoritmo "dados_pessoas"

Var

n, i, qtdHomens, contMu: inteiro
altura : vetor [0..9] de real
sexo : vetor [0..9] de caractere
maiorAlt , menorAlt, mediaFem, soma : real

Inicio

      escreva("Quantas pessoas serao digitadas?")
      leia(n)
      
      repita
            escreva("Altura da ",i + 1, " pessoa: ")
            leia(altura[i])
            escreva("Genero da ",i + 1, " pessoa: ")
            leia(sexo[i])
            i<- i + 1
      ate i = n

      maiorAlt <- altura[0]
      menorAlt <- altura[0]
      
      para i de 0 ate n - 1 passo 1 faca
           se altura[i] < menorAlt entao
              menorAlt <- altura[i]
           fimse
      fimpara
      
      para i de 0 ate n - 1 passo 1 faca
           se altura [i] > maiorAlt  entao
              maiorAlt <- altura[i]
           fimse
      fimpara
      
      soma <- 0
      contMu <- 0
      
       para i de 0 ate n - 1 passo 1 faca
           se sexo[i] = "f" entao
              soma <- soma + altura[i]
              contMu <- contMu + 1
           fimse
      fimpara

       mediaFem <- soma / contMu
       qtdHomens <- n - contMu
      
      escreval("Menor altura = ", menorAlt)
      escreval("Maior altura = ", maiorAlt)

       se contMu = 0 entao
         escreval("Impossivel calcular a altura media das mulheres")
      senao
         escreval("Media das alturas das mulheres = ", mediaFem:3:2)
      fimse

      escreval("Numero de homens = ", qtdHomens)



Fimalgoritmo