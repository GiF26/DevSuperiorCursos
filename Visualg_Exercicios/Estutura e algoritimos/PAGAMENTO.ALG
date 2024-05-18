Algoritmo "pagamento"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var

nome : caractere
salarioPHora, quantidadeHora, totalSalario : real

Inicio

escreva("NOME: ")
leia(nome)
escreva("Valor por Hora: ")
leia(salarioPHora)
escreva("Horas Trabalhadas: ")
leia(quantidadeHora)

totalSalario <- salarioPHora * quantidadeHora

escreval
escreva("O pagamento para ", nome, " deve ser: ", totalSalario:8:2)

Fimalgoritmo

//quantidadeHora poderia ser inteiro, porém exercicio esta correto

