//Soma os números dentro d eum array
public class SomaArray
{
	public static void main(String[] args) {
	    int[] array = {3,10,7};
	    int soma = 0;
	    
	     System.out.println("Números do array: ");
	    
	    for(int i=0; i<array.length;i++){
	         System.out.println(array[i]);
	    
	    }
	    
	    
	    
	    for(int i=0; i<array.length;i++){
	    soma += array[i];
	    }
	    System.out.println("\nA soma dos números do array é: " + soma);
	    
	    
	    
	    
	    
	    
	
	}
}
