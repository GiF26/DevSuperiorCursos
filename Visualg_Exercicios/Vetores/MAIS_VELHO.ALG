Algoritmo "mais_velho"

Var

n , i, maiorI : inteiro
nome : vetor [0..9] de caractere
idade : vetor [0..9] de inteiro
nomeMaior : caractere

Inicio

      escreva("Quantas pessoas voce vai digitar ? ")
      leia(n)
      
      repita
            escreval("Dados da ", i + 1, " pessoa :")
            escreva("Nome :")
            leia(nome[i])
            escreva("idade :")
            leia(idade[i])
            i<- i + 1
      ate i = n
      
      para i de 0 ate n - 1 passo 1 faca
           se idade[i] > maiorI entao
              maiorI <- idade[i]
              nomeMaior <- nome[i]
           fimse
      fimpara
      
      escreva("PESSOA MAIS VELHA: ", nomeMaior)
      

Fimalgoritmo

//ex correto porem podia ter pegado o valor da posicao da idade e ter ultilizado
//para acessasr a posicao do outro vetor