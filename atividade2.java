import java.util.Scanner;
//Desenvolva uma fun��o receba dois n�meros inteiros: X e Y, e retorne a soma de todos os
//n�meros inteiros de X at� Y. 

public class atividade2 {
	 public static void main(String[] args) {
		
		int resultado = soma(0,0);
    	System.out.println(resultado);
		
		
		
	}
	
	public static int soma(int x, int y){
		Scanner leitor = new Scanner(System.in);
		
	
		
		System.out.println("digite o primeiro n�mero: ");
		x = leitor.nextInt();
		
		System.out.println("digite o segundo n�mero: ");
		y = leitor.nextInt();
		
		do{
			
			System.out.println(x);
			x++;
		
			
			
			} while(x < y);
			
		
		
		return x;
		
	}

}
