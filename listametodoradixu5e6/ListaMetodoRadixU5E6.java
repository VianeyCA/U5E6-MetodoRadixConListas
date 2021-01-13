package listametodoradixu5e6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaMetodoRadixU5E6 {

     public static void main(String[] args) {
         // TODO code application logic here
         System.out.println("Ejercicio 6 ordenamiento Radix");
         List<Integer> Lista = new LinkedList<Integer>();
         Lista.add(9);
         Lista.add(30);
         Lista.add(40);
         Lista.add(1);
         Lista.add(89);
         Lista.add(100);
         Lista.add(122);
         //Lista.add();
         System.out.println("");
         System.out.println("Lista desordenada: "+"\n"+Lista);
         Radix(Lista);
     }
     
     public static void Radix(List<Integer> Lista ){
         int x,i,j;
         for(x = Integer.SIZE -1; x >= 0; x--){
             List<Integer> auxiliar= new ArrayList<Integer>();
             for (int k = 0; k < Lista.size(); k++) {
                 auxiliar.add(1);
             }
             j=0;
             for ( i = 0; i < Lista.size(); i++) {
                 boolean mover = Lista.get(i) << x >= 0;
                 if(x==0 ? ! mover:mover){
                     auxiliar.set(j,Lista.get(i));                     
                     j++;
                 }else{
                     Lista.set(i-j,Lista.get(i));                     
                 }
             }
             for (i = j; i < auxiliar.size(); i++) {
                 auxiliar.set(i, Lista.get(i-j)); 
             } 
             Lista=auxiliar;
         }
         System.out.println("Lista ordenada");
         for( j=0;j<Lista.size();j++){
          System.out.print(Lista.get(j)+" ");
         }
     }
    
}   
