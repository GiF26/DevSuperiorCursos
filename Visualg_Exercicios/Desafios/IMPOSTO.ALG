Algoritmo "imposto"

Var

rendaSalario, rendaPestSer, ganhoCap, impSal, impPrest, impGanhoCap : real
gastosMedicos, gastosEducacionais, gastosDedutiveis, maximoDedutivel : real
impBruto, impDevido, abatimento : real

Inicio

      escreval("Renda anual com sal�rio : ")
      leia(rendaSalario)
      escreval("Renda anual com presta��o de servi�o : ")
      leia(rendaPestSer)
      escreval("Renda anual com ganho de capital : ")
      leia(ganhoCap)
      escreval("Gastos m�dicos : ")
      leia(gastosMedicos)
      escreval("Gastos educacionais : ")
      leia(gastosEducacionais)
      
      se rendaSalario < 30000 entao
         escreval(" ISENTO ")
      senao
           se rendaSalario <= 50000 entao
              impSal <- (rendaSalario * 10) / 100
           senao
              impSal <- (rendaSalario * 20) / 100;
           fimse
      fimse
      
      se rendaPestSer > 0 entao
         impPrest <- impPrest = (rendaPestSer * 15) / 100;
      fimse
      
      se ganhoCap > 0 entao
         impGanhoCap <- (ganhoCap * 20) / 100
      fimse
      
      gastosDedutiveis    <- gastosMedicos + gastosEducacionais;
      impBruto            <- impSal + impPrest + impGanhoCap;
      maximoDedutivel     <- (impBruto * 30) / 100
      
      se gastosDedutiveis > maximoDedutivel entao
            abatimento <- maximoDedutivel;
      senao
            abatimento = gastosDedutiveis;
      fimse
      
       impDevido <- impBruto - abatimento;

       escreval(" RELAT�RIO DE IMPOSTO DE RENDA : ")
       escreval()
       escreval(" CONSOLIDADO DE RENDA ")
       escreval(" Imposto sobre o sal�rio : " , impSal:6:2)
       escreval(" Imposto sobre servi�os : " , impPrest:6:2)
       escreval(" Imposto sobre ganho de capital :  " , impGanhoCap:6:2)
       escreval()
       escreval(" DEDU��ES : ")
       escreval(" M�ximo dedutivel : " , maximoDedutivel:6:2)
       escreval(" Gastos dedutiveis : " , gastosDedutiveis:6:2)
       escreval()
       escreval(" RESUMO : ")
       escreval(" Imposto bruto total : " , impBruto:6:2)
       escreval(" Abatimento: " , abatimento:6:2)
       escreval(" Imposto devido : " , impDevido:5:2)


Fimalgoritmo
