package trabalho5;

import java.util.Scanner;

public class atividade5 {
	public static void main(String[] args) {
		int resultado = conta(0,0);
		System.out.println(resultado);
		
	
	}
	
	public static int conta(int x, int y) {
		Scanner leitor = new Scanner(System.in);
    	String operação = null ;
    	char resposta = 0;
    	
    	System.out.println("digite a operação que deseja: (+, -, *, /)") ;
    	operação = leitor.next();
		
		
		
		switch(operação){
		
		case "+":
			System.out.println("digite o primeiro numero");
			x = leitor.nextInt();
			
			System.out.println("digite o segundo numero");
			y = leitor.nextInt();
			
			System.out.println(x + y);
			
			break;
		
		case "-":
			System.out.println("digite o primeiro numero");
			x = leitor.nextInt();
			
			System.out.println("digite o segundo numero");
			y = leitor.nextInt();
			
			System.out.println(x - y);
			break;
			
		case "*":
			System.out.println("digite o primeiro numero");
			x = leitor.nextInt();
			
			System.out.println("digite o segundo numero");
			y = leitor.nextInt();
			
			System.out.println(x * y);
			break;
			
		case "/":
			System.out.println("digite o primeiro numero");
			x = leitor.nextInt();
			
			System.out.println("digite o segundo numero");
			y = leitor.nextInt();
			
			System.out.println(x / y);
			break;
			
		default:
		System.out.println("símbolo incorreto");}
		
	
		

		
		 return 0 ;
		}}

