Algoritmo "LANCHONETE

//Problema "lanchonete" (adaptado de URI 1038)

//Uma lanchonete possui vários produtos. Cada produto possui um código
//e um preço. Você deve fazer um programa para ler o código e a
//quantidade comprada de um produto (suponha um código válido), e daí
//informar qual o valor a ser pago, com duas casas decimais, conforme
//tabela de produtos ao lado.
Var

codigo, quantidade : inteiro
valor : real

Inicio
   escreval("Codigo do produto comprado:")
   leia(codigo)
   escreval("Quantidade comprada:")
   leia(quantidade)
   
   escolha codigo
           caso 1
                valor <- 5.00 * quantidade
           caso 2
                valor <- 3.50 * quantidade
           caso 3
                valor <- 4.80 * quantidade
           caso 4
                valor <- 8.90 * quantidade
           caso 5
                valor <- 7.32 * quantidade
   fimescolha
   
   escreval("voce selecionou : ",codigo," e o valor a ser pago é de ", valor:4:2)
   
Fimalgoritmo

//implementei o numero do codigo selecionado e o exercicio foi executado de forma igual
//da resolução
