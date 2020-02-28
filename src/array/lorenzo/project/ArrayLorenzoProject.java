/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.lorenzo.project;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class ArrayLorenzoProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int[][] worldPopulation = {
                               {1000,1500,2000,},
                               {2200,2500,1200,},
                               {3000,3300,2323,},
   
                            };
        
     System.out.println("worldPopulation is:"+worldPopulation+"and length is :"+worldPopulation.length);     
     System.out.println("worldPopulation[0] is:"+worldPopulation[0]+"and length is :"+worldPopulation[0].length);   
     System.out.println("worldPopulation[1] is:"+worldPopulation[1]+"and length is :"+worldPopulation[1].length);  
     System.out.println("worldPopulation[2] is:"+worldPopulation[2]+"and length is :"+worldPopulation[2].length);  
 
     System.out.println("worldPopulation[0][0]:"+worldPopulation[0][0]);
     System.out.println("worldPopulation[0][1]:"+worldPopulation[0][1]); 
     System.out.println("worldPopulation[0][2]:"+worldPopulation[0][2]);
     
    
     
 
     System.out.println("worldPopulation[1][0]:"+worldPopulation[1][0]);
     System.out.println("worldPopulation[1][1]:"+worldPopulation[1][1]);
     System.out.println("worldPopulation[1][2]:"+worldPopulation[1][2]);
   
     
     System.out.println("worldPopulation[2][0]:"+worldPopulation[2][0]); 
     System.out.println("worldPopulation[2][1]:"+worldPopulation[2][1]);
     System.out.println("worldPopulation[2][2]:"+worldPopulation[2][2]);
     
   
   
    
   int rowTotal=0;
    
    for(int i=0; i<worldPopulation.length; i++){
      rowTotal += worldPopulation[2][i];  
    }
   
    
    int total = sum(worldPopulation);
    System.out.println("the total worldPopulation is"   +total);
    System.out.println("ang average diay sa worldPopulation kay"  );
    System.out.println(total/9.0);
    System.out.println("Pag ka uso sa corona Viruz nahimunalang ug"  );
    System.out.println(total+10000);
    System.out.println("Pagka Shutdown sa ABS CBN ");
    System.out.println(total-19000);
    System.out.println("Pagkamatay ni CArdo dalisay kay");
    System.out.println(total-100000);
    }
    
    public static int sum(int[][]values){
    int total=0;
    for(int i = 0; i<values.length; i++){
   
    for(int j=0;j< values.length; j++){
        total += values[i][j];
    
         }
    
    }
    return total;
    
    }
    
    
}    

     
     
     
     
     
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

