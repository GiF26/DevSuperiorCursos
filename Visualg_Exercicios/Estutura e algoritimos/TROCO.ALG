Algoritmo "troco"
// Disciplina   : [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 
//  
//  

Var
precoUni, precoTotal, troco, dinheiroCli : real
quantidade : inteiro

Inicio
escreva("Preco unitario do produto :")
leia(precoUni)
escreva("Quantidade comprada : ")
leia(quantidade)
escreva("Dinheiro recebido : ")
leia(dinheiroCli)

precoTotal <- precoUni * quantidade
troco <- dinheiroCli - precoTotal

escreval
escreva("TROCO = ", troco)


Fimalgoritmo

//exercicio correto , por�m na corre��o foi proposto de fazer a expressao de
//valor do troco em uma variavel so em vez de calcular uma para preco e
//outra pra troco . Dessa forma (troco <- dinheiroCli - (quantidade * precoUni))