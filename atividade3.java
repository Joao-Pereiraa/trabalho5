import java.util.Scanner;

//Crie uma fun��o que receba 4 notas, calcule a m�dia e retorne true ou false para aprovado ou
//reprovado. (M�dia 7.0).

public class atividade3 {
	public static void main(String[] args) {
		
		Boolean resultado = notas(0,0,0,0);
		System.out.println(resultado);
		
		if(resultado == true){
			System.out.println("voc� foi aprovado ");
			
		}else if(resultado == false){
			System.out.println("voc� foi reprovado ");
	}}
		
	public static boolean notas(int x, int y, int b, int c) {
		Scanner leitor = new Scanner(System.in);
		
	
		
		System.out.println("digite o primeiro n�mero: ");
		x = leitor.nextInt();
		System.out.println("digite o segundo n�mero:");
		y = leitor.nextInt();
		System.out.println("digite o terceiro n�mero:");
	    b = leitor.nextInt();
		System.out.println("digite o quarto n�mero:");
		c = leitor.nextInt();
		
	System.out.println((x + y +  b + c) / 4);
	
	if((x + y +  b + c) / 4 >= 7){
		return true;}
	
	return false;}}
		
		
	
		
		 
	

