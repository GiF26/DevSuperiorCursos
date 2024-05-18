Algoritmo "retangulo"

funcao calcDiagonal (base : real ; altura : real) : real
var
   soma : real
inicio
      soma <- exp(base , 2) + exp (altura , 2)
      retorne raizQ(soma)
fimfuncao

funcao calcArea (base : real ; altura : real) : real
inicio
      retorne base * altura
fimfuncao

funcao calcPerimetro (base : real ; altura : real) : real
inicio
      retorne 2 * (base + altura)
fimfuncao

Var

base, altura : real

Inicio

         escreva("Digite o valor da base do retangulo:")
         leia(base)
         escreva("Digite o valor da altura do retangulo:")
         leia(altura)
         escreval("Diagonal =",calcDiagonal(base,altura):6:2)
         escreval("Area =",calcArea(base,altura):6:2)
         escreva("Perimetro =",calcPerimetro(base,altura):6:2)

Fimalgoritmo

//exercicio executado corretamente