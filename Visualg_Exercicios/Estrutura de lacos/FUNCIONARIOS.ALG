Algoritmo "funcionarios"


//Problema "funcionarios"
//Fazer um programa para ler a quantidade N de funcion�rios, depois ler o nome e sal�rio de N
//funcion�rios. Ao final, mostrar o nome do funcion�rio com maior sal�rio (supor n�o haver empates),
//e mostrar tamb�m o sal�rio m�dio somente dos funcion�rios que ganham de 5000.0 a 10000.0.

Var
n , i, casos : inteiro
nome, nomeMaiorSal : caractere
salario, maiorSal , mediaSal, totalSal : real


Inicio

      escreva("Quantos funcionarios serao digitados?")
      leia(n)
      
      repita
      
            escreval("Digite os dados do ", i + 1 , "o funcionario:")
            escreva("Nome:")
            leia(nome)
            escreva("Salario:")
            leia(salario)

            se salario > maiorSal entao
               maiorSal <- salario
               nomeMaiorSal <- nome
            fimse
            
            se (salario >= 5000) e (salario <= 10000) entao 
               totalSal <- totalSal + salario
               casos <- casos + 1
            fimse

            i <- i + 1
            
      ate i = n
      
       mediaSal <- totalSal / casos
      
      escreval("Funcionario com maior salario: ", nomeMaiorSal)
      escreval("Salario medio de quem ganha de 5000.00 a 10000.00 = ", mediaSal:8:2)


Fimalgoritmo