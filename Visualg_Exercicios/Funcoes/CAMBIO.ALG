Algoritmo "cambio"

funcao cambio(dolar : real; reais : real) : real
inicio
      retorne reais / dolar
fimfuncao

Var

dolar, reais: real

Inicio

      escreva("Digite a cotacao do dolar:")
      leia(dolar)
      escreva("Digite a quantia em reais:")
      leia(reais)
      escreva("Voce pode comprar ", cambio(dolar,reais):6:2 ," dolares com esta quantia")

Fimalgoritmo