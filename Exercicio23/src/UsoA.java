import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UsoA {
  	public static void main(String[] args) {
  			String frase;
  			int i;
  			System.out.println("Insira uma frase:");
  			frase = new Scanner(System.in).nextLine();
  			String[]vet = frase.split(" ");
        	Set<String> s = new TreeSet<String>();
        	
        	for(i=0;i<(vet.length);i++){
        		s.add(new String(vet[i]));
        	}
 
        	// exibe o conte�do de cada cole��o com o toString nativo:
        	System.out.println("Conjunto: " + s);
  	}
}
