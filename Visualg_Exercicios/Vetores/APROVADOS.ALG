Algoritmo "aprovados"

Var

n , i : inteiro
media : real
nome : vetor [0..9] de caractere
nota1 :vetor [0..9] de real
nota2 :vetor [0..9] de real

Inicio

      escreva("Quantos alunos serao digitados ? ")
      leia(n)

      repita
            escreval("Digite nome, primeira e segunda nota do ", i + 1, " aluno: ")
            leia(nome[i])
            leia(nota1[i])
            leia(nota2[i])
            i<- i + 1
      ate i = n

      escreval("ALUNOS APROVADOS")

      para i de 0 ate n - 1 passo 1 faca
           media <- (nota1[i] + nota2[i]) / 2
           se media >= 6 entao
              escreval(nome[i])
           fimse
      fimpara


Fimalgoritmo