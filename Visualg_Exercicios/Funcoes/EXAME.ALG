Algoritmo "exame"

procedimento classGli (dado : real) : caractere
inicio
      se dado <= 100 entao
         escreval( "normal" )
      senao
           se dado <= 140 entao
              escreval( "elevado" )
           senao
              se dado > 140 entao
                 escreval( "diabetes" )
           senao
                escreval( "invalido" )
              fimse
           fimse
      fimse
fimprocedimento

procedimento classTri (dado : real) : caractere
inicio
      se dado <= 200 entao
         escreval( "desejavel" )
      senao
           se dado > 200 entao
              escreval( "elevado" )
           senao
                escreval( "aumetado" )
           fimse
      fimse
fimprocedimento

procedimento classColes (dado : real) : caractere
inicio
      se dado <= 200 entao
         retorne escreva("Clssificação : Desejavel")
      senao
           se dado <= 240 entao
              escreval( "limiar" )
           senao
              se dado > 240 entao
                 escreval( "aumetado" )
           senao
                escreval( "invalido" )
              fimse
           fimse
      fimse
fimprocedimento

Var
   glicose, triglicerideos, colesterol : real
Inicio

      escreva("Medida de glicose:")
      leia(glicose)
      classGli(glicose)
      escreval()
      
      escreval("Medida de triglicerídeos:")
      leia(triglicerideos)
      classTri(triglicerideos)
      escreval()
      
      escreval("Medida de colesterol:")
      leia(colesterol)
      classColes(colesterol)

Fimalgoritmo

//no exercicio é atribuido uma variavel para cada prrocedimento
//eu optei pelo escreva