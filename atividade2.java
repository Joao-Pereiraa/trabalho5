import java.util.Scanner;
//Desenvolva uma função receba dois números inteiros: X e Y, e retorne a soma de todos os
//números inteiros de X até Y. 

public class atividade2 {
	 public static void main(String[] args) {
		
		int resultado = soma(0,0);
    	System.out.println(resultado);
		
		
		
	}
	
	public static int soma(int x, int y){
		Scanner leitor = new Scanner(System.in);
		
	
		
		System.out.println("digite o primeiro número: ");
		x = leitor.nextInt();
		
		System.out.println("digite o segundo número: ");
		y = leitor.nextInt();
		
		do{
			
			System.out.println(x);
			x++;
		
			
			
			} while(x < y);
			
		
		
		return x;
		
	}

}
