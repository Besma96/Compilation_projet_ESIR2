import test.Test_profondeur;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

 
 public class Main_pr{

     public static List main(){
        List<Long> L= new ArrayList<Long>();
        for (int i=1; i<1000; i+=20)
        {  
           Test_profondeur test = new Test_profondeur(i);
           long begin = System.currentTimeMillis();
           try
           {
              Process p = Runtime.getRuntime().exec( "./whpp Test_profondeur.wh" );
              java.io.BufferedReader out = new java.io.BufferedReader( new java.io.InputStreamReader( p.getInputStream() ) );
                System.out.print("okey normalement c'est bon");
            }

           catch ( IOException e )
           {    System.out.print("aieaie");
               // Erreur		
           }
           long end = System.currentTimeMillis();
           L.add(end-begin);
        }
        return L;
     }

     public static void main(String [] args){
         List L=main();
        for (int i=0; i<L.size(); i++){
            //System.out.print(L.get(i));
        }
     }
    
   
 }