Algoritmo "retangulo"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
base,altura,area,perimetro,diagonal:real

Inicio

escreva("Base do Retângulo : ")
leia(base)
escreva("Altura do Retângulo :")
leia(altura)

area <- base * altura
perimetro <- (2 * base) + (2 * altura)
diagonal <- raizq(base ^ 2 + altura ^ 2)

escreva("ÁREA = ", area:4:4)
escreval
escreva("PERIMETRO = ", perimetro:4:4)
escreval
escreva("DIAGONAL = ", diagonal:4:4)

Fimalgoritmo

//exercicio correto porém como melhoria eu poderia ter usado exp(base,2) para
//calcular o exponencial ao invés de usar a simbologia (ambos estao certos
//mas o professor usou a propriedade).

//poderia tambem ter aumentado o tamanho das casas 8:4 ao inves de 4:4
//(4 casas antes da virgula e 4 depois)