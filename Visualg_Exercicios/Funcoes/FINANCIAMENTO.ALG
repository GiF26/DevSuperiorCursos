Algoritmo "financiamento"

funcao calcFinanc(vi : real; ve : real; parc : inteiro) : real
inicio
      retorne (vi - ve) / parc
fimfuncao

Var

valorImovel, valorEntrada : real
parcelas : inteiro

Inicio

      escreva("Valor total do imovel: ")
      leia(valorImovel)
      escreva("Valor pago na entrada:")
      leia(valorEntrada)
      escreva("Sera financiado em quantos meses?")
      leia(parcelas)
      
      escreva("Valor de cada prestacao: ", calcFinanc(valorImovel,valorEntrada,parcelas):10:2)

Fimalgoritmo

//exercicio correto , mas nao crieir variavel paraz armazenar
//retorno da funcao
//alem disso na resolucao ele cria uma variavel na funcao para tirar a diferenca
