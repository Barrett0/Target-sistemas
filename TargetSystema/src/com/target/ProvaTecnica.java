package com.target;

import java.util.Scanner;

public class ProvaTecnica {

	   public static void main(String[] args) {

		        // Questão 1
		        
		         Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
		         anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
		         informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
		         pertence ou não à sequência.
		        
		    	Int n1 = 0, n2= 1, n3= 0,i;
		    	 Scanner scan = new Scanner (System.in);
		    	 System.out.println("Digite um número que seja da Sequência de Fibonacci:"); 
		    	 i= scan.nextInt ();
		    	
		    	 while (i > n3) {
		    		  n3 =n1 + n2;
		    		  n1 = n2;
		    		  n2 = n3;
		    	
		    		  if (i == 0) {
		    		  System.out.println("O numero ○ está na gequência de fibonacci. \no próximo número é: 1");
		    	 }else if (1 == n3) {
		    		 System.out.println("O número "+i+" está na sequência de fibonacci. \nO próximo número é: "+ (n1+ i)); 
		    	 }
		    		 else System.out.println("Este número não faz parte da sequência de fibonacci");
		    	}
		        
		    	 
		    	   
		    	  
		    	 // Questao 2
		    	 public class VerificaLetraA {
		    		    public static void main(String[] args) {
		    		        Scanner scanner = new Scanner(System.in);
		    		       
		    		     
		    		        System.out.println("Digite uma string: ");
		    		        String entrada = scanner.nextLine();
		    		       
		    		      
		    		        int contador = 0;
		    		       
		    		         
		    		        for (int i = 0; i < entrada.length(); i++) {
		    		            char c = entrada.charAt(i);
		    		         
		    		            if (c == 'a' || c == 'A') {
		    		                contador++;
		    		            }
		    		        }
		    		       
		    		        if (contador > 0) {
		    		            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
		    		        } else {
		    		            System.out.println("A letra 'a' não aparece na string.");
		    		        }
		    		       
		    		        scanner.close();
		    		    }
		    	
		    	//	    QUESTAO 3
		    		//  Vamos acompanhar cada iteração:

		    		    	//1ª iteração:
		    		    	  K = 2 (K incrementado de 1)
		    		    	  SOMA = 2 (SOMA + K)
		    		    	 
		    		    //2ª iteração:
		    		    	  - `K = 3`
		    		    	  - `SOMA = 5` (SOMA + K)
		    		    	 
		    		    	//3ª iteração:
		    		    	  K = 4;
		    		    	  SOMA = 9;	    		    	  {
		    		    	 (SOMA + K)
		    		    	  }
		    		    	4ª iteração:
		    		    	  K = 5;
		    		    	  SOMA = 14;
		    		    	  (SOMA + K)

		    		    //	5ª iteração:
		    		    	  K = 6;
		    		    	  SOMA = 20;
		    		    	  (SOMA + K)

		    		    	//6ª iteração:
		    		    	  K = 7;
		    		    	  SOMA = 27;
		    		    	  (SOMA + K)

		    		    	//7ª iteração:
		    		    	  K = 8;
		    		    	  SOMA = 35;
		    		    	  (SOMA + K)

		    		    	//8 iteração:
		    		    	  K = 9;
		    		    	  SOMA = 44;
		    		    	  (SOMA + K)

		    		    //	9ª iteração:
		    		    	  K = 10;
		    		    	  SOMA = 54;
		    		    	  (SOMA + K)

		    		    //	10ª iteração:
		    		    	  K = 11;
		    		    	 SOMA = 65;
		    		    	 (SOMA + K)

		    		    //	11ª iteração:
		    		    	  K = 12;
		    		    	   O loop termina porque `K` não é mais menor que INDICE.

		    		    	// Resultado final:
		    		    
		    		    	  Ao final do loop, o valor de SOMA será 65.

		    		    	Portanto, o programa imprime o valor `65`.

		        

		         Questão 4
		        Descubra a lógica e complete o próximo elemento:
		        
		        a) 1, 3, 5, 7, (9).--------------------Adicionar 2 ao número anterior.
		        b) 2, 4, 8, 16, 32, 64, (128).---------Multiplicar por 2 o número anterior.
		        c) 0, 1, 4, 9, 16, 25, 36, (49).-------Adicionar o próximo número ímpar ao numero anterior.
		        d) 4, 16, 36, 64, (100).---------------Elevar o próximo número par ao quadrado, iniciando do 2.
		        e) 1, 1, 2, 3, 5, 8, (13).-------------Somar os dois números anteriores.
		        f) 2, 10, 12, 16, 17, 18, 19, (200).---O próximo número, escrito, deve começar com a letra "D".
		        


		    }
		     
		
		
	}
};


