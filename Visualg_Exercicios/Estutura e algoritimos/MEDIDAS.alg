Algoritmo "medidas"
// Disciplina   : [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 

//A)a �rea do quadrado que tem lado A
//b) a �rea do tri�ngulo ret�ngulo que base A e altura B
//c) a �rea do trap�zio que tem bases A e B, e altura C

Var

a, b, c, quadrado, triangulo, trapezio : real

Inicio

escreva("Digite a medida A : ")
leia(a)
escreva("Digite a medida B : ")
leia(b)
escreva("Digite a medida C : ")
leia(c)

quadrado <- exp(a,2)
triangulo <- (a * b)/2
trapezio <- (a + b)*c/2

escreval
escreva("AREA DO QUADRADO = ", quadrado:2:4)
escreval
escreva("AREA DO TRIANGULO = ", triangulo:2:4)
escreval
escreva("AREA DO TRAPEZIO = ", trapezio:2:4)

Fimalgoritmo
//nao preciisva do parenteses no triangulo porem nao tem porblema e o
//exercicio esta correto