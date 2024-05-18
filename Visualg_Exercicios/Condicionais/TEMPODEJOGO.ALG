Algoritmo "tempodejogo"

//Problema "tempo_de_jogo" (adaptado de URI 1046)

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
//do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
//tendo uma duração mínima de 1 hora e máxima de 24 horas.

Var

horaIni,horaFim,horatot : inteiro

Inicio
      escreval("Digite a hora inicial e a hora que o jogo terminou :")
      leia(horaIni)
      leia(horaFim)

      se horaIni > horaFim entao
         horaTot <- (24 - horaIni) + horaFim
      senao
         horaTot <- horaIni + (24 - horaFim)
      fimse

      escreval(horaTot)



Fimalgoritmo
