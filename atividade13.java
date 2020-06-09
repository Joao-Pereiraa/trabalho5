
import java.util.Scanner;

//Escreva um procedimento que receba por parâmetro dois números inteiros X e Y, calcule e 
//mostre na tela a multiplicação do número X pelo Y.

public class atividade13 {
	public static void main(String[] args) {
		
		 int resultado = multiplicação(0,0);
		 System.out.println(resultado);
			
	}
	
	
	
	public static int multiplicação(int x, int y){
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		x = leitor.nextInt();
		
		System.out.println("digite o segundo numero: ");
		y = leitor.nextInt();
		
		
		return x * y;
		
		
	}

}
