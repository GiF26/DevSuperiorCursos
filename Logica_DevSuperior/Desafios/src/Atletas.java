import java.util.Scanner;

public class Atletas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean valido = false;

	    int n ,
	    	i = 1,
	        totHomem = 0,
	        totMulheres = 0;

	    double pesoMed = 0	,
	           porcentH = 0,
	           altMediaMulheres = 0,
	           pesoTot = 0,
	           atletMaisAlto = 0,
	           altura = 0,
	           peso = 0;
	    
	    String nomeMaisAlto = null,
	    		sexo = null;
	
        System.out.println("Qual a quantidade de atletas?");
        n = sc.nextInt();

        while(i <= n ){
            
        	sc.nextLine();
        	
            System.out.println("Digite os dados do atleta numero " + (i) + ":");
            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Sexo:");
            sexo = sc.next();
            
            valido = false;
            
            while(valido == false) {
            	
    			switch (sexo.toLowerCase()) {
    		    case "m":
    		        valido = true;
    		        break;
    		    case "f":
    		        valido = true;
    		        break;
    		    default:
    		        valido = false;
    		        System.out.println("Valor inválido! Favor digitar F ou M:");
    		        sexo = sc.next();
    		        break;
    			}
          	}

            System.out.println("Altura:");
            altura = sc.nextDouble();

   		 	while(altura <= 0) {
                System.out.println("Valor invalido! Favor digitar um valor positivo:");
                altura = sc.nextDouble();
            }

            System.out.println("Peso:");
            peso = sc.nextDouble();
            
            while(peso <= 0) {
                System.out.println("Valor invalido! Favor digitar um valor positivo:");
                peso = sc.nextDouble();
            }

			sc.close();
            
            pesoTot += peso;
            
            if(altura > atletMaisAlto){
                atletMaisAlto = altura;
                nomeMaisAlto = nome;
            }
            
            if(sexo.equals("M") || sexo.equals("m")){
                totHomem = totHomem + 1;
            }
            
            if(sexo.equals("F") || sexo.equals("f")){
            		totMulheres += 1; 
            		altMediaMulheres += altura;
            }
            
            i++;
        }
	  
		pesoMed = pesoTot / n;
		porcentH = 100 * totHomem / n;
		altMediaMulheres = altMediaMulheres /totMulheres;
	
		System.out.println("*** RELATORIO ***");
		System.out.println("Peso médio dos atletas: " +	Math.round(pesoMed * 100.0)/100.0);
		System.out.println("Atleta mais alto: " + nomeMaisAlto);
		System.out.println("Porcentagem de homens:" + porcentH + " %");
		System.out.println("Altura média das mulheres:" + altMediaMulheres);
	}

}

