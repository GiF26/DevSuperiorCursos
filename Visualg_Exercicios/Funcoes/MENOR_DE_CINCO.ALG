Algoritmo "menor_de_cinco"

funcao menorDeTres(x : inteiro; y: inteiro; z: inteiro): inteiro
inicio
      se (x < y) e (x < z) entao
         retorne x
      senao
           se (y < z) entao
              retorne y
      senao
           retorne z
           fimse
      fimse
fimfuncao

Var
n1, n2, n3, n4, n5, aux, menor: inteiro

Inicio

   escreval("Digite cinco números inteiros:")
   leia(n1)
   leia(n2)
   leia(n3)
   leia(n4)
   leia(n5)
   aux <- menorDeTres(n1, n2, n3)
   menor <- menorDeTres(aux, n4, n5)
   escreval("Menor = ", menor)

Fimalgoritmo

//NAO CONSEGUI CRIAR LOGICA O SUFICIENTE