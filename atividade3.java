import java.util.Scanner;

//Crie uma função que receba 4 notas, calcule a média e retorne true ou false para aprovado ou
//reprovado. (Média 7.0).

public class atividade3 {
	public static void main(String[] args) {
		
		Boolean resultado = notas(0,0,0,0);
		System.out.println(resultado);
		
		if(resultado == true){
			System.out.println("você foi aprovado ");
			
		}else if(resultado == false){
			System.out.println("você foi reprovado ");
	}}
		
	public static boolean notas(int x, int y, int b, int c) {
		Scanner leitor = new Scanner(System.in);
		
	
		
		System.out.println("digite o primeiro número: ");
		x = leitor.nextInt();
		System.out.println("digite o segundo número:");
		y = leitor.nextInt();
		System.out.println("digite o terceiro número:");
	    b = leitor.nextInt();
		System.out.println("digite o quarto número:");
		c = leitor.nextInt();
		
	System.out.println((x + y +  b + c) / 4);
	
	if((x + y +  b + c) / 4 >= 7){
		return true;}
	
	return false;}}
		
		
	
		
		 
	

