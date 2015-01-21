/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;

import java.io.DataInputStream;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author xikang
 */
public class MenuBuilder {
    
    // A list of chooice for customers
     protected static String menuQuestion[];
     
    public static void build() {
        

       
          try{
           
                   System.out.println("\t\t Stock Menu ");
                   System.out.println("\t\t----------------");
                     for (String question : menuQuestion) {
                        out.println(question);
                     }
                    
            
        }catch( Exception e){
              
             System.out.print(e);
          }
    }
    
    
    
    public static void decisionMaking(int choice, Manager manager){
        
        switch(choice){
                case 1: 
                    manager.add();
                    break;
                case 2:
                    manager.delete();
                    break;
                case 3:
                    manager.list();
                    break;
                case 4:
                    manager.search();
                    break;
                case 5:
                    break;
        
        }
    }
}
    
  


/*
 switch(choice){
                       case 1:
                           Stock stock = new Stock();
                           System.out.println("Enter Stock ID");
                           stock.setId(Integer.parseInt(input.readLine()));
                           System.out.println("Enter Name");
                           stock.setManufacture(input.readLine());
                           stocklist.add(stock);
                           Stock sock1 = stocklist.getById(0);
                            
                            break;
                       case 2:
                           System.out.println("Enter Stock id you want to delete");
                           stocklist.deletById(Integer.parseInt(input.readLine()));
                           try{
                                System.out.println("Remove Sucessful");
                           }catch(Exception e){
                               System.out.println(e.getMessage()+"Delete doesn't sucessful");
                           }
                   }
*/