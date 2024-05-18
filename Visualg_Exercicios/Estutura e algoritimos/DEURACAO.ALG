Algoritmo "duracao"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var

horas, tempoDigitado, minutos ,segundos, resto : inteiro

Inicio

escreva("Digite a duracao em segundos : ")
leia(tempoDigitado)

horas <- tempoDigitado \ 3600

resto <- tempoDigitado % 3600

minutos <-  resto \ 60
segundos <- resto % 60

escreval(horas,":",minutos,":",segundos)

Fimalgoritmo

//nao consegui fazer sozinha