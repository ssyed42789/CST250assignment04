/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250assignment04;

import java.io.File;
import java.util.*;
        
public class CST250assignment04 {

 
    public static void main(String[] args) {
       
        
        File file = file = new File("C:/Users/ssyed/CST250assignment04");
		String[] fileList = file.list();
		for(String name:fileList){
			System.out.println(name);
        
        
        
        
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
      
}
 
  








