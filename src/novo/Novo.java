package novo;

import java.util.ArrayList;
import java.util.List;

public class Novo {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        nomes.add("Fernanda");    
        nomes.add("Nanda");
        nomes.add("Fe");
        nomes.add("Douglas");
        nomes.add("Murilo");
        nomes.add("Luize");
        
        nomes.remove("Fernanda");
        for (int i = 0; i < nomes.size(); i++)
        {
            System.out.println(nomes.get(i));
            
        }
        
        System.out.println("OUTRO JEITO:\n");
        
        for (String string : nomes) {
            System.out.println(nomes);
        }
    }
    
}