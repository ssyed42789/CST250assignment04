package cst250assignment04;
import java.util.*;

public class cst250assigment04 {
   public static void main(String args[]) {
  
      ArrayList<String> obj = new ArrayList<String>();

   
      obj.add("Michael");
      obj.add("Christopher");
      obj.add("Jessica");
      obj.add("Matthew");
      obj.add("Ashley");
      Collections.sort(obj);

      
      System.out.println("Original ArrayList:");
      for(String str:obj)
         System.out.println(str);
      
   }
}
        


        
