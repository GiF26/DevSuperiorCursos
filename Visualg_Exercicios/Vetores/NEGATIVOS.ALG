Algoritmo "negativos"

<<<<<<< Updated upstream
//Problema "negativos"
//Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois N n�meros inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os n�meros negativos lidos.

Var

n , i :inteiro

vet : vetor [0..9] de inteiro

Inicio

      escreval("Quantos numeros voce vai digitar")
      leia(n)
      
      se n > 10 entao
         escreval ("Nao � possivel armazenar mais de 10 numeros")
      senao
         repita
            escreval("Digite um numero : ")
            leia(vet[i])
            i <- i + 1
         ate i = n

         escreval("NUMEROS NEGATIVOS ")

         para i de 0 ate n passo 1 faca
            se vet[i] < 0 entao
               escreval(vet[i])
            fimse
         fimpara
     fimse


Fimalgoritmo