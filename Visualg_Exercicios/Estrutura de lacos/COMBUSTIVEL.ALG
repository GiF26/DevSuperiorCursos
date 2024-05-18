Algoritmo "combustivel"

//Problema "combustivel" (adaptado de URI 1134)
//Um posto de combustíveis deseja determinar qual de seus produtos tem a
//preferência de seus clientes.

//Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da
//seguinte forma:1.Álcool 2.Gasolina 3.Diesel 4.Fim).

// Caso o usuário informe um código inválido (fora da faixa
//de 1 a 4) deve ser solicitado um novo código (até que seja válido).
//O programa será encerrado quando o código informado for o número 4, devendo
//então mostrar a mensagem "MUITO OBRIGADO", bem como as quantidades de cada
//combustível.

Var

tipoCombu, alcool, gasolina, diesel : inteiro


Inicio

tipoCombu <- 0

      enquanto tipoCombu <> 4 faca
         escreval("Informe um codigo (1, 2, 3) ou 4 para parar:")
         leia(tipoCombu)
         
         se (tipoCombu <= 0) ou (tipoCombu > 4) entao
            escreval("Codigo Invalido! Tente novamente :")
            leia(tipoCombu)
         fimse
         
         se tipoCombu = 1 entao
            alcool <- alcool + 1
         senao
              se tipoCombu = 2 entao
                 gasolina <- gasolina + 1
         senao
              se tipoCombu = 3 entao
                 diesel <- diesel + 1
         senao
            escreval("Muito Obrigado")
               fimse
            fimse
         fimse

      fimenquanto
      
      escreval("1.Álcool = ", alcool)
      escreval("2.Gasolina = ",gasolina)
      escreval("3.Diesel = ", diesel)

Fimalgoritmo

//poderia ter usado um escolha para fazer a soma
