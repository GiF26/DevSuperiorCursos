Algoritmo "circulo"
// Disciplina   : [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 

Var
r, area , piV: real
//area tem 3 casa dec

Inicio

piV <- 3.14159

escreva("Digite o valor do raio do circulo:")
leia(r)

area <- piV * exp(r , 2)

escreval
escreva("AREA = ", area:8:3)


Fimalgoritmo

//h� muitas formas de realizar esse exercicio pois possui bibliotecas
//segue abaixo forma que eu preferriria ter feito por�m nao consegui:
// area <- pi * exp(r,2)
