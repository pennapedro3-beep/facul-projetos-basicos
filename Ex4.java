import java.util.List;
import java.util.ArrayList;
public class Ex4
{
	public static void main(String[] args) {
	    List<String> nomes = new ArrayList<>();
	    nomes.add("Pedro");
	    nomes.add("Thiago");
	    nomes.add("Ana");
	    nomes.add("João");
	    
	    for( String n : nomes){
	        System.out.println(n.toUpperCase());
	    }
	}
}
