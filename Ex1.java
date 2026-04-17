import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	System.out.println("Escreva um número 1:");
    int numero1 = scanner.nextInt();
    	System.out.println("Escreva um número 2:");
    int numero2 = scanner.nextInt();
    if(numero1>numero2){
        System.out.println(numero1 + " é maior");
        System.out.println(numero2 + " é menor");
    }else if(numero2>numero1){
        System.out.println(numero2 + " é maior");
        System.out.println(numero1 + " é menor");
        
    }else{
        System.out.println("Os números são iguais ou inválidos");
        
    }
   
	
	
	
	
	}
}
