
package contadorpalavra;

import java.util.ArrayList;

public class main {
    public static void main (String[]args) throws InterruptedException{
        
        ArrayList<String> listaPalavras = new ArrayList(StopWords.stopWords
                                                            (SeparadorPalavras.retorno
                                                                  (ArrumarTamanho.arrumarTamanho
                                                                     (LeitorArquivo.leitorArquivo()))));
        
        System.out.println("Leitura = " + listaPalavras +"\n");
        
        /*
        ContadorThed c1 = new ContadorThed(0,listaPalavras);
        ContadorThed c2 = new ContadorThed(1,listaPalavras);
        
        c1.start();
        c2.start();
        */
        

        Contador.contador(listaPalavras, 0);
}
}


    

