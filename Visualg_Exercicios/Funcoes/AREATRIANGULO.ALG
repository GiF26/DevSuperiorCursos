Algoritmo "area_triangulo"

funcao area(a : real ; b : real ; c : real) : real
var
   calcArea, p : real
inicio
      p <- (a + b + c) / 2
      calcArea <- RaizQ(p * (p-a) * (p-b) * (p-c))
      retorne calcArea
fimfuncao

Var

x , a , b , c , areaX, areaY : real

Inicio

      escreval("Entre com as medidas do triangulo X")
      leia(a)
      leia(b)
      leia(c)

      areaX <- area(a , b , c)

      escreval("Entre com as medidas do triangulo Y")
      leia(a)
      leia(b)
      leia(c)
      
      areaY <- area(a , b , c)
      
      escreval(areaX:4:2)
      escreval(areaY:4:2)

Fimalgoritmo

//dava para fazer a conta principal de area no retorne da funcao ao inves de
//criar uma variavel para isso