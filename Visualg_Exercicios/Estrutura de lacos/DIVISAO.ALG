Algoritmo "divisao"

//Escreva um algoritmo que leia um número inteiro N, e depois repita N vezes:
//ler dois números e imprimir o resultado da divisão do primeiro pelo segundo.
//Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
Var

 n , i : inteiro
 n1, n2, divisao : real


Inicio

      escreval("Quantos casos voce vai digitar ?")
      leia(n)
      
      repita

            escreva("Entre com o numerador : ")
            leia(n1)
            escreva("Entre com o denominador : ")
            leia(n2)
            
            se n2 = 0 entao
               escreval("DIVISAO IMPOSSIVEL")
            senao
                 divisao <- n1 / n2
                 escreval("DIVISAO = ",divisao)
            fimse

            i <- i + 1
            
      ate i = n

Fimalgoritmo

//EXERCICIO CORRETO A DIFERENCA FOI A TROCA DO PARA POR REPITA