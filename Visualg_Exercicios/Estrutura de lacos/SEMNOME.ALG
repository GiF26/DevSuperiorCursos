Algoritmo "dentro_fora"

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que
//serão lidos em seguida. Mostre quantos destes valores X estão dentro do
//intervalo [10,20] e quantos estão fora do intervalo, conforme exemplo

Var

n, x, quantidade : inteiro



Inicio

      escreval("quantos numeros voce vai digitar")
      leia(n)

      para n de n ate x faca
           escreva("Digite um numero : ")
           leia(x)

           se (n = 10) e (n <= 20) entao
              quantidade <- quantidade + contador
           fimse

Fimalgoritmo