import java.util.Scanner;

public class Ex2
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	System.out.println("De uma nota para aula do professor de 0 a 100: ");
    int classificacao = scanner.nextInt();
    if(classificacao>=90 && classificacao<101){
        System.out.println("A classificação da aula é A");
	}else if(classificacao>=80 && classificacao<90){
	    System.out.println("A classificação da aula é B");
	}else if(classificacao>=70 && classificacao<80){
	    System.out.println("A classificação da aula é C");
	}else if(classificacao>=60 && classificacao<70){
	    System.out.println("A classificação da aula é D");
	}else if(classificacao<60 && classificacao>=0){
	    System.out.println("A classificação da aula é F");
	}else{
	    System.out.println("número invalido");
	}
}
}