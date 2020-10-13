package contadorpalavra;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import java.util.stream.Collectors;

public class Contador {
    
    public static String contador(List tipoList,int inicioInt){
        
        List verificar = (List) tipoList.stream().filter(v->!v.equals(tipoList.get(inicioInt))).collect(Collectors.toList());
        
        int quantidade = tipoList.size()-verificar.size();
        
        System.out.println( "\nPalavra = " + tipoList.get(inicioInt) /*+"\nPosição: "+inicioInt*/+"\nQuantidade :" + quantidade  ); 
        
        if(verificar.size()>0){
            
            contador(verificar, inicioInt);
            
        }
        

        return null;
        
    }
}
