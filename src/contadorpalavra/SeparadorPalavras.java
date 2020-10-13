package contadorpalavra;

import java.util.ArrayList;

public class SeparadorPalavras {
    
    public static ArrayList<String> retorno(String entrada){
        
        ArrayList<String> saida = new ArrayList<>();
        String percorer = new String();
        percorer = "";
        
        for(int n=0;entrada.length()>n;n++){
            
         
         if(entrada.charAt(n)!=' '){
                 
             
             percorer = percorer+ entrada.charAt(n);
         }
         else if(entrada.charAt(n)==' '&&percorer.length()!=0){
             saida.add(percorer);
             percorer = "";
             
         
            }
         
        }
        
        String percorer1 = new String();
        percorer1= saida.get(1);
        
       
        
        
        return saida;   
    }    
    
}