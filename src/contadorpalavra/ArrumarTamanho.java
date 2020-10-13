package contadorpalavra;

public class ArrumarTamanho {

    
    public static String arrumarTamanho(String leitura){
        String velha = new String();
        velha=leitura;
        String nova = new String();
        nova="";

        for(int j=0;velha.length()>j;j++){
    
        if(velha.charAt(j)=='A'||velha.charAt(j)=='a'){ 
                nova= nova+"a";
                
            } 
            else if(velha.charAt(j)=='B'||velha.charAt(j)=='b') {
                nova= nova+"b";
            }
            else if(velha.charAt(j)=='C'||velha.charAt(j)=='c'){ 
                nova= nova+"c";
            } 
            else if(velha.charAt(j)=='D'||velha.charAt(j)=='d') {
                nova= nova+"d";
            }
            else if(velha.charAt(j)=='E'||velha.charAt(j)=='e'){ 
                nova= nova+"e";
            } 
            else if(velha.charAt(j)=='F'||velha.charAt(j)=='f') {
                nova= nova+"f";
            }
            else if(velha.charAt(j)=='G'||velha.charAt(j)=='g') {
                nova= nova+"g";
            }
            else if(velha.charAt(j)=='H'||velha.charAt(j)=='h'){ 
                nova= nova+"h";
            } 
            else if(velha.charAt(j)=='I'||velha.charAt(j)=='i') {
                nova= nova+"i";
            }
            else if(velha.charAt(j)=='J'||velha.charAt(j)=='j'){ 
                nova= nova+"j";
            } 
            else if(velha.charAt(j)=='K'||velha.charAt(j)=='k') {
                nova= nova+"k";
            }
            else if(velha.charAt(j)=='L'||velha.charAt(j)=='l') {
                nova= nova+"l";
            }
            else if(velha.charAt(j)=='M'||velha.charAt(j)=='m'){ 
                nova= nova+"m";
            } 
            else if(velha.charAt(j)=='N'||velha.charAt(j)=='n') {
                nova= nova+"n";
            }
            else if(velha.charAt(j)=='O'||velha.charAt(j)=='o'){ 
                nova= nova+"o";
            } 
            else if(velha.charAt(j)=='P'||velha.charAt(j)=='p') {
                nova= nova+"p";
            }
            else if(velha.charAt(j)=='Q'||velha.charAt(j)=='q') {
                nova= nova+"q";
            }
            else if(velha.charAt(j)=='R'||velha.charAt(j)=='r'){ 
                nova= nova+"r";
            } 
            else if(velha.charAt(j)=='S'||velha.charAt(j)=='s') {
                nova= nova+"s";
            }
            else if(velha.charAt(j)=='T'||velha.charAt(j)=='t'){ 
                nova= nova+"t";
            } 
            else if(velha.charAt(j)=='U'||velha.charAt(j)=='u') {
                nova= nova+"u";
            }
            else if(velha.charAt(j)=='V'||velha.charAt(j)=='v') {
                nova= nova+"v";
            }
            else if(velha.charAt(j)=='W'||velha.charAt(j)=='w'){ 
                nova= nova+"w";
            } 
            else if(velha.charAt(j)=='X'||velha.charAt(j)=='x') {
                nova= nova+"x";
            }
            else if(velha.charAt(j)=='Y'||velha.charAt(j)=='y'){ 
                nova= nova+"y";
            } 
            else if(velha.charAt(j)=='Z'||velha.charAt(j)=='z') {
                nova= nova+"z";
            }
            else if(velha.charAt(j)=='Á'||velha.charAt(j)=='á') {
                nova= nova+"á";
            }
            else if(velha.charAt(j)=='Â'||velha.charAt(j)=='â'){ 
                nova= nova+"â";
            } 
            else if(velha.charAt(j)=='À'||velha.charAt(j)=='à') {
                nova= nova+"à";
            }
            else if(velha.charAt(j)=='Å'||velha.charAt(j)=='å'){ 
                nova= nova+"å";
            } 
            else if(velha.charAt(j)=='Ã'||velha.charAt(j)=='ã') {
                nova= nova+"ã";
            }
            else if(velha.charAt(j)=='Ä'||velha.charAt(j)=='ä'){ 
                nova= nova+"ä";
            } 
            else if(velha.charAt(j)=='Æ'||velha.charAt(j)=='æ') {
                nova= nova+"æ";
            }
            else if(velha.charAt(j)=='É'||velha.charAt(j)=='é') {
                nova= nova+"é";
            }
            else if(velha.charAt(j)=='Ê'||velha.charAt(j)=='ê'){ 
                nova= nova+"ê";
            } 
            else if(velha.charAt(j)=='È'||velha.charAt(j)=='è') {
                nova= nova+"è";
            }
            else if(velha.charAt(j)=='Ë'||velha.charAt(j)=='ë'){ 
                nova= nova+"ë";
            } 
            else if(velha.charAt(j)=='Ð'||velha.charAt(j)=='ð') {
                nova= nova+"ð";
            }
            else if(velha.charAt(j)=='Í'||velha.charAt(j)=='í') {
                nova= nova+"í";
            }
            else if(velha.charAt(j)=='Î'||velha.charAt(j)=='î'){ 
                nova= nova+"î";
            } 
            else if(velha.charAt(j)=='Ì'||velha.charAt(j)=='ì') {
                nova= nova+"ì";
            }
            else if(velha.charAt(j)=='Ï'||velha.charAt(j)=='ï'){ 
                nova= nova+"ï";
            } 
            else if(velha.charAt(j)=='Ó'||velha.charAt(j)=='ó') {
                nova= nova+"ó";
            }     
            else if(velha.charAt(j)=='Ô'||velha.charAt(j)=='ô'){ 
                nova= nova+"ô";
            } 
            else if(velha.charAt(j)=='Ò'||velha.charAt(j)=='ò') {
                nova= nova+"ò";
            }
            else if(velha.charAt(j)=='Ø'||velha.charAt(j)=='ø') {
                nova= nova+"ø";
            }
            else if(velha.charAt(j)=='Õ'||velha.charAt(j)=='õ'){ 
                nova= nova+"õ";
            } 
            else if(velha.charAt(j)=='Ö'||velha.charAt(j)=='ö') {
                nova= nova+"ö";
            }
            else if(velha.charAt(j)=='Ú'||velha.charAt(j)=='ú'){ 
                nova= nova+"ú";
            } 
            else if(velha.charAt(j)=='Û'||velha.charAt(j)=='û') {
                nova= nova+"û";
            }
            else if(velha.charAt(j)=='Ù'||velha.charAt(j)=='ù') {
                nova= nova+"ù";
            }
            else if(velha.charAt(j)=='Ü'||velha.charAt(j)=='ü'){ 
                nova= nova+"ü";
            } 
            else if(velha.charAt(j)==' '||velha.charAt(j)=='\n') {
                nova= nova+" ";
            }
            else if(velha.charAt(j)=='-'){ 
                nova= nova+"-";
            }
            else if(velha.charAt(j)=='0'){ 
                nova= nova+"0";
            }     
            else if(velha.charAt(j)=='1'){ 
                nova= nova+"1";
            }
            else if(velha.charAt(j)=='2'){ 
                nova= nova+"2";
            }  
            else if(velha.charAt(j)=='3'){ 
                nova= nova+"3";
            }
            else if(velha.charAt(j)=='4'){ 
                nova= nova+"4";
            }
            else if(velha.charAt(j)=='5'){ 
                nova= nova+"5";
            }
            else if(velha.charAt(j)=='6'){ 
                nova= nova+"6";
            }   
            else if(velha.charAt(j)=='7'){ 
                nova= nova+"7";
            }
            else if(velha.charAt(j)=='8'){ 
                nova= nova+"8";
            }   else if(velha.charAt(j)=='9'){ 
                nova= nova+"9";
            }    
        }   
        
        return nova;  
    }
      
       
}