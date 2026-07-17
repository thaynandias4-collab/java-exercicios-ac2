package ac2;

import java.util.Scanner;

public class ListaAc2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Scanner String 	= new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		        
//Lista de exercicios AC2- Integrantes: Felipe Luis Moraes Laperutta 264068 - Thaynan Willian Dias 240256. 
		
//1. Crie um programa que recebe uma frase e informa se é ou não ou palíndromo. Ponto extra se desconsiderar espaços e não criar nenhuma cópia nem alterar a string.
		System.out.println("Exercicio 1:Crie um programa que recebe uma frase e informa se é ou não ou palíndromo. Ponto extra se desconsiderar espaços e não criar nenhuma cópia nem alterar a string. \n");
		System.out.println("Digite uma frase: ");
		String frase = scanner.nextLine();

			int inicio = 0;
		    int fim = frase.length() - 1;

		    boolean palindromo = true;

		    while (inicio < fim) {

		    while (inicio < fim && frase.charAt(inicio) == ' ') {
		    		inicio++;
		    }

		    while (inicio < fim && frase.charAt(fim) == ' ') {
		           fim--;
		    }

		    if (Character.toLowerCase(frase.charAt(inicio)) != Character.toLowerCase(frase.charAt(fim))) {
		        palindromo = false;
		         break;
		    }

		   inicio++;
		   fim--;
		    }

		   if (palindromo) {
		       System.out.println("É palíndromo.");
		       } 
		   else {
		   System.out.println("Não é palíndromo.");
		   }
		      	   
		   System.out.println("\n");
//2. Crie um programa onde o usuário informa a nota de 10 alunos e armazena em um array. As notas devem estar no intervalo de 0 a 10, portanto, caso informe uma nota inválida, deve
//ser informado do erro e uma nova nota deve ser solicitada. Ao final, exiba as 10 notas.
		        
		    System.out.println("Exercicio 2: Crie um programa onde o usuário informa a nota de 10 alunos e armazena em um array. As notas devem estar no intervalo de 0 a 10, portanto, caso informe uma nota inválida, deve\n"
		   		+ "ser informado do erro e uma nova nota deve ser solicitada. Ao final, exiba as 10 notas. \n");  
		    int[] notas = new int[10];
		 
		    for (int i = 0; i < notas.length; i++) {
		        
		    System.out.println("Digite a nota do aluno " + ( i + 1 ) + ": ");
		    	int nota = scanner.nextInt();

		        while (nota < 0 || nota > 10) {
		        	System.out.println("Nota inválida! Insira uma nota entre 0 a 10");
		        	System.out.println("Digite novamente: ");
		        	nota = scanner.nextInt();
		        	}
		        	notas[i] = nota;
		        }
		     System.out.println("\nNotas dos alunos: ");
		        for (int i = 0; i < notas.length; i++) {
		        	System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
		        }
		        
		        
		        
		        System.out.println("\n");
//3. Crie um programa que receba 10 números e os exibe em ordem crescente. 
		        
		     System.out.println("3. Crie um programa que receba 10 números e os exibe em ordem crescente. \n");   
		     int[] numeros = new int[10];

		     for (int i = 0; i < numeros.length; i++) {
		          System.out.print("Digite o " + (i + 1) + "º número: ");
		          numeros[i] = scanner.nextInt();
		        }

		        for (int i = 0; i < numeros.length - 1; i++) {
		            for (int j = i + 1; j < numeros.length; j++) {
		                if (numeros[i] > numeros[j]) {
		                    int auxiliar = numeros[i];
		                    numeros[i] = numeros[j];
		                    numeros[j] = auxiliar;
		                }

		            }

		        }

		     System.out.println("\nNúmeros em ordem crescente:");

		     for (int i = 0; i < numeros.length; i++) {
		          System.out.println(numeros[i]);
		        }		
		        
		        
		     System.out.println("\n");
//4. Supondo que a população de um país A seja 9.000 habitantes com uma taxa anual de crescimento vegetativo de 3% e que a população de um país B seja de 20.000 habitantes
//com uma taxa anual de crescimento vegetativo de 1,5%. Fazer um algoritmo que calcule o número de anos necessários para que a população do país A ultrapasse a população do
//país B, mantidas essas taxas de crescimento.
		     
		    System.out.println("4.Supondo que a população de um país A seja 9.000 habitantes com uma taxa anual de crescimento vegetativo de 3% e que a população de um país B seja de 20.000 habitantes\n"
		     		+ "com uma taxa anual de crescimento vegetativo de 1,5%. Fazer um algoritmo que calcule o número de anos necessários para que a população do país A ultrapasse a população do\n"
		     		+ "país B, mantidas essas taxas de crescimento. \n");
			double populacaoA = 9000;
			double populacaoB = 20000;

			int anos = 0;

			while (populacaoA <= populacaoB) {
				   populacaoA = populacaoA + (populacaoA * 0.03);
				   populacaoB = populacaoB + (populacaoB * 0.015);
				   anos++;
			}

			System.out.println("Serão necessários " + anos + " anos.");
			System.out.println("População A: " + populacaoA);
			System.out.println("População B: " + populacaoB);
			
			
			System.out.println("\n");		
//5. Um pesquisador está estudando a conjectura de Collatz. Faça um programa que lê um número inteiro e mostre se essa conjectura se aplica a ele. Exiba todos os passos.	
			   
			   System.out.println("5.Um pesquisador está estudando a conjectura de Collatz. Faça um programa que lê um número inteiro e mostre se essa conjectura se aplica a ele. Exiba todos os passos. \n");
			   System.out.println("Digite um número inteiro: ");
			   int numero = scanner.nextInt();
			   int resultado;
			   
			   while (numero != 1) {
				   System.out.println(numero);
				   
				   //número par divida por 2 
				   if(numero % 2 == 0) {
					  numero = numero / 2;
					 
				   }
				   else {//impar multiplique por 3 e some 1 
					   numero = (numero * 3) + 1;
				   }
			   
			   }
			   System.out.println(1);
			   System.out.println("\nA conjectura aplicada no número informado. ");
		
			System.out.println("\n");
//6. Crie um programa que, dado um array A com 10 elementos e um número q, encontra 2 elementos cuja soma é igual a q, ou informe que esse par não existe. 			
			
			System.out.println("6.Crie um programa que, dado um array A com 10 elementos e um número q, encontra 2 elementos cuja soma é igual a q, ou informe que esse par não existe. \n");
			int [] A = new int [10];// 0, 1, 2, 3 .. 9 
 			
			//Serve para escrever os 10 elementos. 
			System.out.println("Dado um array com 10 elementos ");
			for(int i = 0; i<A.length; i++) {
				System.out.println("Elemento " + (i + 1)+ ":");
				A[i] = scanner.nextInt();
			}
			
			//Atribui valor do 'q'.
			System.out.println("Determine o valor de q: ");
			int q = scanner.nextInt();
			
			
			//Resolução da conta
			boolean encontrou = false; 
			for(int i=0; i<A.length -1; i++) {
				for(int j = i +1; j<A.length; j++) {
					
					if (A[i] + A[j] == q) {
						System.out.println("Par encontrado: " + A[i]+ "+" + A[j] + "="+q);
						encontrou=true; 
					}
					
				}
			}
			//Se nesses 10 elementos ele não encontrar um 'par' que dê o valor que determinamos para o 'q', ele roda essa linha!
			if (!encontrou) {
				System.out.println("Não existe par com soma igual a "+q);
			}
			
			
			System.out.println("\n");
//7. Crie um programa que, dado um array com 10 elementos, encontra um elemento que não se repete, ou informe que não há elementos únicos.	
			
			System.out.println("7.Crie um programa que, dado um array com 10 elementos, encontra um elemento que não se repete, ou informe que não há elementos únicos. \n");
			int [] R = new int [10];
			
			System.out.println("Dado um array com 10 elementos ");
			for (int i=0; i<R.length; i++) {
				System.out.println("Elemento " + (i+1)+ ":");
				R[i] = scanner.nextInt();
			}
			
			boolean unico = false;
			
			for(int i = 0; i<R.length;i++) {
				int cont = 0;
				
				for(int j = 0; j<R.length; j++) {
					if (R[i] == R[j]){
						cont++; 
					}
					
				}	
				if(cont==1) {
					System.out.println("Elemento que não se repete: "+ R[i]);
					unico=true; 
				}
			}
			if (unico==false) {
				System.out.println("Não há elementos únicos. ");
			}
			
			System.out.println("\n");		
//8. Escreva um programa que recebe um número inteiro e escreve esse número por extenso.O programa deve suportar pelo menos os números de 0 a 10. 
//Caso o número esteja fora dessa abrangência, informar que esse número não é suportado pelo programa.
			
			System.out.println("8.Escreva um programa que recebe um número inteiro e escreve esse número por extenso. O programa deve suportar pelo menos os números de 0 a 10. \n"
					+ "Caso o número esteja fora dessa abrangência, informar que esse número não é suportado pelo programa. \n");
			System.out.println("Escreva um número entre 0 e 10: ");
			int N1 = scanner.nextInt();
			
			switch(N1){
			case 0: System.out.println("Esse número é Zero!");break;
			case 1: System.out.println("Esse número é Um!");break;
			case 2: System.out.println("Esse número é Dois!");break;
			case 3: System.out.println("Esse número é Três!");break;
			case 4: System.out.println("Esse número é Quatro!");break;
			case 5: System.out.println("Esse número é Cinco!");break;
			case 6: System.out.println("Esse número é Seis!");break;
			case 7: System.out.println("Esse número é Sete!");break;
			case 8: System.out.println("Esse número é Oito!");break;
			case 9: System.out.println("Esse número é Nove!");break;
			case 10: System.out.println("Esse número é Dez!");break;
			default: System.out.println("Esse número não é suportado pelo programa! ");
			}
			
			System.out.println("\n");
//12. Crie um programa que, dado um array A com 10 elementos e um número q, encontra o elemento mais próximo a q, ou seja, com a menor diferença.	
			
			System.out.println("12.Crie um programa que, dado um array A com 10 elementos e um número q, encontra o elemento mais próximo a q, ou seja, com a menor diferença. \n");
			int [] A1 = new int [10];
			
			//Escreve Array com 10 elementos:
			System.out.println("Dado um array A com 10 elementos ");
			for(int i=0; i<A1.length;i++) {
				System.out.println("Elemento " + (i + 1)+ ":");
				A1[i] = scanner.nextInt();
			}
			//Determine um número q
			System.out.println("Determine o valor de q: ");
			int Q1 = scanner.nextInt();
			
			//Resolução:
			int proximo = A1[0];
			int menordif = A1[0] - Q1;
			
			if(menordif < 0) {
				menordif = menordif*-1; 
			}
			
			for(int i = 1; i<A1.length; i++) {
				
				int diferenca = A1[i]-Q1;
				
				if(diferenca<0) {
					diferenca = diferenca*-1;
				}
				
				if(diferenca < menordif) {
					menordif = diferenca;
					proximo = A1[i];
				}	
			}
			
			System.out.println("O elemento mais próximo de "+Q1+" é: "+ proximo);
			System.out.println("Diferença: "+menordif);
			
			System.out.println("\n");	
//15. Crie um programa que, dado dois arrays A e B, calcula o produto escalar S = A×B. 1Array A x 1Array B + 2Array A X 2Array B + 3Array A X 3Array B. Soma e da o resultado. 
			
			System.out.println("15.Crie um programa que, dado dois arrays A e B, calcula o produto escalar S = A×B.\n");
			int[] a = new int [3];
			int[] b = new int [3];
			
			System.out.println("Escreva os 3 valores do Array A: ");
			
			
			for(int i =0; i<a.length; i++) {
				a[i] = scanner.nextInt();
			}
			
			System.out.println("Escreva os 3 valores do Array B: ");
			
			for(int i=0; i<b.length; i++) {
				b[i] = scanner.nextInt(); 
			}
			
			int result = 0;
			
			for(int i=0; i<a.length; i++) {
				result = result + a[i] * b[i]; 
			}
			System.out.println("\nO resultado é: " + result );		
	}
}
	
	
	

