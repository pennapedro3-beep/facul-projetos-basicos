import java.util.List;
import java.util.ArrayList;

public class Ex7
{
	public static void main(String[] args) {
	    List<Integer> n = new ArrayList<>();
	    
	   n.add(1);
	   n.add(2);
	   n.add(3);
	   n.add(4);
	   n.add(5);
	   n.add(6);
	   
	   System.out.println("Pares: ");
	   for(Integer num : n){
	       if(num % 2 == 0){

	           System.out.println(num);
	       }
	   }
	    
		
	}
}
