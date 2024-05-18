Algoritmo "comerciante"

Var

n,i, lucroMenor ,lucroEntre, lucroAcima : inteiro
nome : vetor [0..9] de caractere
precoComp: vetor [0..9]  de real
precoVenda: vetor [0..9] de real
valorTotComp, valorTotVenda , diferenca, lucroTotal : real


Inicio
      escreva("Serao digitados dados de quantos produtos?")
      leia(n)
      
      repita
         escreva("Produto ", i + 1, ": ")
         leia(nome[i])
         leia(precoComp[i])
         leia(precoVenda[i])
         i <- i + 1
      ate i = n
      
      para i de 0 ate n - 1 passo 1 faca
         diferenca <- precoVenda[i] - precoComp[i]

         se diferenca < 10 * precoComp[i] / 100 entao
           lucroMenor <- lucroMenor + 1
         senao
              se diferenca < 20 * precoComp[i]/100 entao
                 lucroEntre <- lucroEntre + 1
         senao
              se diferenca > 20 * precoComp[i]/100 entao
                 lucroAcima <- lucroAcima + 1
                 fimse
              fimse
         fimse

      fimpara
      
      para i de 0 ate n - 1 passo 1 faca
           valorTotComp <- valorTotComp + precoComp[i]
           valorTotVenda <- valorTotVenda + precoVenda[i]
      fimpara
      
      lucroTotal <- valorTotVenda - valorTotComp
      
      escreval("RELATORIO")
      escreval("Lucro abaixo de 10% : ",lucroMenor)
      escreval("Lucro entre de 10% e 20% :",lucroEntre)
      escreval("Lucro acima de 20% :",lucroAcima)
      escreval("Valor total de compra: ",valorTotComp)
      escreval("Valor total de venda : ", valorTotVenda)
      escreval("Lucro total",lucroTotal)
      
Fimalgoritmo

//exercicio feito corretamente porem preciso pegar costume de delcarar
//valor para as variavel.
