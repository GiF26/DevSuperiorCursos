Algoritmo "idades"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
nome1 , nome2  : caractere
idade1, idade2 : inteiro
media: real


Inicio

escreva("Dados da primeira pessoa:")
escreval
escreva("Nome : ")
leia(nome1)
escreva("Idade : ")
leia(idade1)
escreva("Dados da segunda pessoa:")
escreval
escreva("Nome : ")
leia(nome2)
escreva("Idade : ")
leia(idade2)

media <- (idade1 + idade2)/2

escreval
escreva("A idade média de ", nome1 , " e ", nome2, " é de : ", media:2:1)

Fimalgoritmo