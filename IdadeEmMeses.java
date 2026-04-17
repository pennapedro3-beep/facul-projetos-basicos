//Scaneia sua idade e trasnforma em meses e printa no log
import java.util.Scanner;

public class IdadeEmMeses
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int idade;
		System.out.println("Escreva sua idade: ");
		idade = sc.nextInt();
		System.out.println("Sua idade em meses é de " + (idade * 12) + " meses.");
	
	}
}
