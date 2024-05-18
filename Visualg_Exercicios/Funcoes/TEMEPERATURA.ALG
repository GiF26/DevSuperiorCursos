Algoritmo "temeperatura"

funcao converteTemperatura(temp : real) : real
inicio
      retorne (5/9) * (temp - 32)
fimfuncao

Var

temperatura : real

Inicio

      escreva("Digite a temperatura em Fahrenheit: ")
      leia(temperatura)
      escreva("Temperatura em Celsius = ", converteTemperatura(temperatura):3:2)

Fimalgoritmo

//exercicio correto , mas nao crieir variavel paraz armazenar
//retorno da funcao