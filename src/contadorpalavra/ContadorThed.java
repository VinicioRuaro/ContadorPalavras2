package contadorpalavra;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import java.util.stream.Collectors;

public class ContadorThed extends Thread{    
    
    private int inicioInt;
    private ArrayList<String> listaPalavrasArrayList = new ArrayList();
    public  ContadorThed(int entrada,ArrayList entradalista){
       inicioInt = entrada; 
       listaPalavrasArrayList= entradalista;
    }
    private ArrayList<Integer> posicaoEncontradaArrayList = new ArrayList();
    private String palavraProcuradaString = new String();
    
    @Override
    public void run(){
        
        
                
                
                List<String> tipoList = listaPalavrasArrayList;     
                Contador.contador(tipoList,inicioInt);
                
                 
                
                        
                
                
    } 

}

    
