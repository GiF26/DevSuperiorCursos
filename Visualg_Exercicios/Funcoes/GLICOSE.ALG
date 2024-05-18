Algoritmo "glicose"

funcao classificacaoGlicose(glicose : real) : caractere
inicio
      se glicose <= 100 entao
         retorne "normal"
      fimse
      se glicose <= 140 entao
            retorne "elevada"
      fimse
      se glicose > 140 entao
           retorne "diabetes"
      fimse

fimfuncao

Var

glicose : real

Inicio

      escreva("Digite o valor da glicose:")
      leia(glicose)
      escreva(classificacaoGlicose(glicose))

Fimalgoritmo