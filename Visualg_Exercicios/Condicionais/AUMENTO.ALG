Algoritmo "aumento"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

//Problema "aumento" (adaptado de URI 1048)

//Uma empresa vai conceder um aumento percentual de salário aos seus
//funcionários dependendo de quanto cada pessoa ganha , conforme tabela
// ao lado. Fazer um programa para ler o salário de uma pessoa, daí mostrar
// qual o novo salário desta pessoa depois do aumento, quanto foi o aumento e
// qual foi a porcentagem de aumento.

Var
salario,novoSalario,aumentoEmDinheiro : real
aumentoPorcentagem : caractere

Inicio
      escreval("Digite o salario da pessoa")
      leia(salario)
      
      se salario <= 1000 entao
         aumentoEmDinheiro <- (salario * 20)/100
         novoSalario <- salario + aumentoEmDinheiro
         aumentoPorcentagem <- "20%"
      fimse
      
      se (salario > 1000) e (salario <= 3000) entao
          aumentoEmDinheiro <- (salario * 15) /100
          novoSalario <- salario + aumentoEmDinheiro
          aumentoPorcentagem <- "15%"
      fimse
      
      se (salario > 3000) e (salario <= 8000) entao
          aumentoEmDinheiro <- (salario * 10) /100
          novoSalario <- salario + aumentoEmDinheiro
          aumentoPorcentagem <- "10%"
      fimse
      
      se salario > 8000 entao
         aumentoEmDinheiro <- (salario * 05) /100
         novoSalario <- salario + aumentoEmDinheiro
         aumentoPorcentagem <- "05%"
      fimse

      escreval("Novo Salario : " , novoSalario:6:2)
      escreval("Aumento : ", aumentoEmDinheiro:6:2)
      escreval("Porcentagem : ", aumentoPorcentagem)
         


Fimalgoritmo

//fiz um pouco diferente a resolucao seggue quais e porque :

//1 - porcentagem dele é um numrero msm e eu optei por caractere
//para exibir sem fazer varias concatenacoes de porcentagem (porem a dele)
//seria mais pratica pois atrela o numero para calcular livrando de trocar
//valores na hora de calcular o valor adicional do salario

//2 - a cadeia de se e senao eu nao consigo usa la entao fiz as condicoes
//separedas o que só é ruim pois tera de escrver quase a mesma condicao varias
//vezes mas ainda prefiro por questao de identacao e organizacao do codigo

