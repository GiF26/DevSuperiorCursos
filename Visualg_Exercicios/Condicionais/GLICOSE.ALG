Algoritmo "glicose"
//Problema "glicose"

//Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa
//e depois mostrar na tela a classifica��o desta glicose de acordo com a
//tabela de refer�ncia ao lado.

//DADOS:

//NORMAL AT� 100 MG/DL         - NORMAL
//MAIOR QUE 100 AT� 140 MG/DL  - ELEVADO
//MAIOR QUE 140 MG/DL          - DIABETES

Var
qtdGlicose : real

Inicio

      escreva("Digite a quantidade de glicose: ")
      leia(qtdGlicose)

      se qtdGlicose <= 100 entao
         escreva("Normal")
      fimse
      
      se (qtdGlicose > 100) e (qtdGlicose <= 140) entao
         escreva("Elevado")
      fimse
      
      se qtdGlicose > 140 entao
         escreva("Diabetes")
      fimse


Fimalgoritmo

//esta correto mas poderia ter feito a estutura senao se senao se...