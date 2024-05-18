Algoritmo "dardo"

//No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior
//distância que conseguir. Você deve criar um programa para,dadas as medidas
//das três tentativas de lançamento, informar qual foi a maior.

Var

dis1,dis2,dis3 : real


Inicio
      escreval("Escreva as medidas alcançadas:")
      leia(dis1)
      leia(dis2)
      leia(dis3)
      
      se (dis1 > dis2) e (dis1 > dis3) entao
         escreval("maior distancia é :", dis1)
      senao
           se (dis2 > dis1) e (dis2 > dis3) entao
              escreval("maior distancia é :",dis2)
           senao
              escreval ("maior distancia é : ", dis3)
           fimse
      fimse

Fimalgoritmo

//o exe esta correto porem a segunda condição poderia ser so a validação de :
//dis2 > dis3 , pois a primeira conndição ja validaria que dis1 nao é maior que
//os dois outros valores
