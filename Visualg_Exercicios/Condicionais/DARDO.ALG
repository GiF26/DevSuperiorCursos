Algoritmo "dardo"

//No arremesso de dardo, o atleta tem tr�s chances para lan�ar o dardo � maior
//dist�ncia que conseguir. Voc� deve criar um programa para,dadas as medidas
//das tr�s tentativas de lan�amento, informar qual foi a maior.

Var

dis1,dis2,dis3 : real


Inicio
      escreval("Escreva as medidas alcan�adas:")
      leia(dis1)
      leia(dis2)
      leia(dis3)
      
      se (dis1 > dis2) e (dis1 > dis3) entao
         escreval("maior distancia � :", dis1)
      senao
           se (dis2 > dis1) e (dis2 > dis3) entao
              escreval("maior distancia � :",dis2)
           senao
              escreval ("maior distancia � : ", dis3)
           fimse
      fimse

Fimalgoritmo

//o exe esta correto porem a segunda condi��o poderia ser so a valida��o de :
//dis2 > dis3 , pois a primeira conndi��o ja validaria que dis1 nao � maior que
//os dois outros valores
