Algoritmo "TEMPERATURA"
// Problema "temperatura"
//Deseja-se converter uma medida de temperatura da escala Celsius para
//Fahrenheit ou vice-versa. Paraisso, você deve construir um programa que leia
//a letra "C" ou "F" indicando em qual escala vai ser informada uma temperatura
//. Em seguida o programa deve mostrar a temperatura na outra escala com
//duas casas decimais.
Var

   escala : caractere
   conversao , temperatura : real


Inicio

   escreval("Voce vai digitar a temperatura em qual escala (C/F)?")
   leia(escala)

   se (escala = "f") ou (escala = "F") entao
      escreval("Digite a temperatura em Fahrenheit")
      leia(temperatura)

      conversao <- (5/9) * (temperatura - 32)
      escreva("a temperatura em celcius é : ",conversao:4:2)

   senao
        escreval("Digite a temperatura em Celsius")
        leia(temperatura)

        conversao <- ((9/5) * temperatura) + 32
        escreva("a temperatura em celcius é : ",conversao:4:2)
   fimse


Fimalgoritmo

//exrecicio correto porém nao consegui deduzir a formua inversa
