Algoritmo "terreno"

Var

largura, comprimento, m2, terreno, preco : real

Inicio

escreva("Digite a Largura : ")
leia(largura)
escreva("Digite o Comprimento : ")
leia(comprimento)
escreva("Digite o tamanho em metros quadrados : ")
leia(m2)
escreval

terreno <- largura * comprimento
preco <- m2 * terreno

//escreva("A Largura � :", largura:4:1)
//escreval
//escreva("O Comprimento �:", comprimento:4:1)
//escreval
//escreva("O tamanho em metros quadrados � :", m2:6:2)
//escreval
escreva("O Tamanho do Terreno � de : ", terreno:8:2)
escreval
escreva("O Preco do terreno � de : ", preco:8:2)

Fimalgoritmo

//correcao: o exeercicio esta correto e a logica tambem , apenas pequei na n
//oemacao da variavel "m2" e nao era necessario criar saida dos resultados dos
//valores digitados por conta das casas decimais , o usuario mesmo que deve
//escreve-las