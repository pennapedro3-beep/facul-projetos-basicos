import java.util.Scanner;

public class ScanearNome
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); // cria objeto Scanner
	   
		System.out.println("Digite seu nome: ");
		String nome;
		nome = sc.next();
	    char primeira = nome.charAt(0);
	    if(Character.isLowerCase(primeira)){
	        System.out.println("Nome começa com letra maiúscula, Cabeçãooo!!!!");
	    }
	    
		System.out.println("Digite sua idade: ");
		int idade;
		idade = sc.nextInt();
		
		
		System.out.println("Seu nome é "+ nome +(" e sua idade é " +idade+(" anos")));
	}
}
