Algoritmo "bahskaraCond"
// Disciplina   : [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 
//formulas
// baskhara : x = -b+(ou menos) raiz b^2 - 4*a*c dividido por 2 * a
//x : b+raiz de delta dividido por duas vezes o a
//x : b-raiz de delta dividido por duas vezes o a
//delta : b ^2 - 4*a*

//condicoes :

//Se delta < 0, a equa��o do segundo grau n�o possui ra�zes reais;

//Se delta = 0, a equa��o do segundo grau possui uma raiz real;

//Se delta > 0, a equa��o do segundo grau possui duas ra�zes reais.


Var

a, b, c, X1, X2, delta : real

Inicio

      escreva("Digite A : ")
      leia(a)
      escreva("Digite B : ")
      leia(b)
      escreva("Digite C : ")
      leia(c)
      
      delta <- exp(b,2) - 4 * a * c

      escreval("Delta = ", delta:5:4)
      
      se delta < 0 entao
         escreval("a equa��o do segundo grau n�o possui ra�zes reais;")
      senao
           x1 <- b + raizq(delta) / 2 * a
           x2 <- b - raizq(delta) / 2 * a
           escreval("X1 = ", x1:5:4)
           escreval("X2 = ", x2:5:4)
      fimse

      
Fimalgoritmo

// logica estava correta por�m tentei realizar implementa��es na condi��o e deu
//errado precisei da corre��o para ver como poderia ser feito
