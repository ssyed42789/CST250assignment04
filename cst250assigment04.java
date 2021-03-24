/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250assignment04;
import java.util.*;

public class cst250assigment04 {
   public static void main(String args[]) {
      /* Creating ArrayList of type "String" which means
       * we can only add "String" elements
       */
      ArrayList<String> obj = new ArrayList<String>();

      /*This is how we add elements to an ArrayList*/
      obj.add("Michael");
      obj.add("Christopher");
      obj.add("Jessica");
      obj.add("Matthew");
      obj.add("Ashley");
      Collections.sort(obj);

      // Displaying elements
      System.out.println("Original ArrayList:");
      for(String str:obj)
         System.out.println(str);
      
   }
}
        


        
