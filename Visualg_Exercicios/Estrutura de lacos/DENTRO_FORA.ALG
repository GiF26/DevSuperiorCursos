Algoritmo "dentrofora"

//Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que
//ser�o lidos em seguida. Mostre quantos destes valores X est�o dentro do
//intervalo [10,20] e quantos est�o fora do intervalo, conforme exemplo

Var

n, x, entreDezVinte, foraIntervalo : inteiro

Inicio

      escreval("quantos numeros voce vai digitar")
      leia(n)

      para n de 1 ate n faca
           escreva("Digite um numero : ")
           leia(x)

           se (x >= 10) e (x <= 20) entao
              entreDezVinte <- entreDezVinte + 1
           senao
              foraIntervalo <- foraIntervalo + 1
           fimse
      fimpara
      
      escreval("DENTRO : ",entreDezVinte)
      escreval("FORA : ",foraIntervalo)
      
      

Fimalgoritmo

//exercicio correto
