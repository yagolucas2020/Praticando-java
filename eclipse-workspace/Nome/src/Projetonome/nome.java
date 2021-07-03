package Projetonome;
import java.util.Scanner;
public class nome {
	private static Scanner inpunt;

	public static void main(String[]args){
		
		int nome;
		
		int sobrenome;
		
		inpunt = new Scanner(System.in); 
			System.out.print("Digite seu nome:" );
			nome = inpunt.nextInt();
			
			System.out.print("Digite seu sobrenome:");
			sobrenome = inpunt.nextInt();
		
		
		System.out.println("Nome do proprietario é:" +  nome + sobrenome);
		
		
		
		
		
	}
}
