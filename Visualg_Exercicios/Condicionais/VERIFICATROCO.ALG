Algoritmo "VerificaTroco"
//   Problema "troco_verificado"

//Fazer um programa para calcular o troco no processo de pagamento de um produto
//de uma mercearia. O programa deve ler o preço unitário do produto, a quantidade
//de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente.
//Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.
//Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem
//informando o valor restante conforme exemplo.

Var

precoUni,valorDevolvido,precoTotal,valorRecebido : real

quantidadeDeUni :inteiro

Inicio
   escreva("Preco unitario do produto :")
   leia(precoUni)
   escreva("Quantidade comprada : ")
   leia(quantidadeDeUni)
   escreva("Dinheiro recebido : ")
   leia(valorRecebido)

   precoTotal <- precoUni * quantidadeDeUni
   valorDevolvido <- valorRecebido - precoTotal
   
   escreval("Valor total :", precoTotal)

   se valorRecebido < precoTotal entao
      escreval("Valor Insuficiente , faltam ", valorDevolvido:4:2 , " reais!")
   senao
      escreval("TROCO = ", valorDevolvido:4:2:)
   fimse






Fimalgoritmo