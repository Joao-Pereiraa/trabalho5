
import java.util.Scanner;

//Escreva um procedimento que receba por par�metro dois n�meros inteiros X e Y, calcule e 
//mostre na tela a multiplica��o do n�mero X pelo Y.

public class atividade13 {
	public static void main(String[] args) {
		
		 int resultado = multiplica��o(0,0);
		 System.out.println(resultado);
			
	}
	
	
	
	public static int multiplica��o(int x, int y){
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		x = leitor.nextInt();
		
		System.out.println("digite o segundo numero: ");
		y = leitor.nextInt();
		
		
		return x * y;
		
		
	}

}
