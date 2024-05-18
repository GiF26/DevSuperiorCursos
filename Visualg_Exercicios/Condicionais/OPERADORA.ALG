Algoritmo "operadora"
// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
// a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
// custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que
//uma pessoa consumiu, daí mostrar o valor a ser pago.


//6000 seg igual a 100 min

Var

minutos, minutosTot : inteiro
valorPago : real

Inicio

      escreval("Digite a quantidade de minutos :")
      leia(minutos)
      
      se minutos <= 100 entao
         valorPago <- 50
         escreval("Valor a ser pago",valorPago:4:2)
      senao
         valorPago <- 50 + ( 2 * (minutos - 100) )
         escreval("Valor a ser pago",valorPago)
      fimse

Fimalgoritmo

//nao conseguir analisar a logica
//problema notado : falta de entendimento de expressao
