Algoritmo "bar"
// Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres.
// Cada cerveja custa 5 reais,
// cada refrigerante 3 reais
// cada espetinho custa 7.
// couvert artístico no valor de 4 reais, porém, se o valor gasto com consumo
// for superior a 30 reais, o couvert artístico não é cobrado.

// Fazer um programa para ler os seguintes dados de um cliente do bar: sexo
// (F ou M), quantidade de cervejas, refrigerantes e espetinhos consumidos.
// O programa deve então mostrar um relatório com a conta a ser paga pelo cliente.

Var

sexo : caractere
refrigerante,cerveja,espetinho : inteiro
artistico,precoIn,precoRefri,precoCer,precoEspe,consumo,valorTot : real

Inicio
      escreval("Sexo:")
      leia(sexo)
      escreval("Quantidade de cervejas:")
      leia(cerveja)
      escreval("Quantidade de refrigerantes:")
      leia(refrigerante)
      escreval("Quantidade de espetinhos:")
      leia(espetinho)
      
      precoCer       <- cerveja * 5
      precoRefri     <- refrigerante * 3
      precoEspe      <- espetinho * 7
      consumo        <- precoCer + precoRefri + precoEspe
      
      escreval(" RELATÓRIO : ")
      escreval(" Consumo ", consumo:6:2)
      
      se consumo < 30 entao
         artistico <- 4
         escreval(" Artistico : ", artistico:6:2)
      senao
         escreval(" Isento de Couvert! ")
      fimse
      
      se (sexo = "m") ou (sexo = "M") entao
         precoIn <- 10
      senao
           se (sexo = "f") ou (sexo = "F") entao
              precoIn <- 8
           fimse
      fimse
      
      escreval(" Ingresso  : ", precoIn:6:2)
      
      valorTot   <- consumo + artistico + precoIn
      
      escreval()
      escreval(" Valor a pagar : ", valorTot:6:2)

Fimalgoritmo
