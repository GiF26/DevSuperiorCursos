Algoritmo "imc"

procedimento IMC(p : real; a : real)
var
   imcCalc : real
inicio
      imcCalc <- p / exp(altura,2)

      se imcCalc < 20 entao
         escreva("Resultado do IMC: abaixo do peso")
      senao
           se imcCalc <= 25 entao
              escreva("Resultado do IMC: peso normal")
      senao
           se imcCalc = 30 entao
              escreva("Resultado do IMC: sobre peso")
           senao
                esceva("Resultado do IMC: obeso")
                fimse
           fimse
      fimse

fimprocedimento

Var
   peso, altura : real
Inicio

      escreva("Digite o peso : ")
      leia(peso)
      escreva("Digite a altura : ")
      leia(altura)
      IMC(peso,altura)

Fimalgoritmo