package usuario;
import java.util.Scanner;
import java.util.ArrayList;
public class cadastroUsuario {
		public static void main(String[]args){

		Scanner scanner = new Scanner(System.in);
		ArrayList  usuario = new ArrayList();

		usuario2 usuario2 = new usuario2();

		int fun = 0;

		System.out.println("Digite 1 para cadastrar o usuario ou 0 para sair !");
		Scanner inpunt = Scanner.nextInt();

		while(fun !=0){

			System.out.println("Bem vindo ao sistema de cadastro");
			System.out.println("Digite o nome de usuario");
			usuario2.setNome (Scanner.nextLine());
			
			
			System.out.println("Digite o sobrenome do usuario");
			usuario.setSobrenome(scanner.nextLine());

			System.out.println("Digite o RG");
			usuario.setRg(Scanner.nextLine);

			System.out.println("Digite o CPF");
			usuario.setCpf(Scanner.nextLine);
			
			System.out.println("Crie um Login");
			usuario.setLogin(Scanner.nextLine);
			
			System.out.println("Crie uma Senha");
			usuario.setSenha(Scanner.nextLine);


			listaDeUsuario.add(usuario);
			usuario = new usuario();

			System.out.println("Digite 1 para cadastrar o usuario ou 0 para sair !");
			fun = Scanner.nextInt();

		}
	}