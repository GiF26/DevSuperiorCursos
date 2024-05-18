Algoritmo "salario_liquido"

procedimento calculoImposto(salario : real)
var
   calcImposto : real
inicio
      se salario <= 4000 entao
         calcImposto < - salario - (20/100)
      senao
           se salario > 4000 entao
              calcImposto <- salario - (25/100)
           fimse
      fimse
      calculoPrevidencia(calcImposto)
fimprocedimento

procedimento calculoPrevidencia (salarioComImposto : real)
var
   calcPrev : real
inicio
      se salarioComImposto <= 1500 entao
         calcPrev <- salarioComImposto - (10/100)
      senao
           se salarioComImposto > 1500 entao
              calcPrev <- salarioComImposto - (15/100)
           fimse
      fimse
      escreva("Salario liquido : ", calcPrev:8:2)
fimprocedimento

Var
   salario : real
Inicio
      escreval("Digite o valor do salario bruto")
      leia(salario)
      calculoImposto(salario)
Fimalgoritmo

//exercicio retornou o resultado esperado , porem nao foi desenvolvido
//da forma correta como deveria ser feito