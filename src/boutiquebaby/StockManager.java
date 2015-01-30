/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author xikang
 */
public class StockManager implements Manager {
    
    StockList stocklist;
    
    public StockManager(StockList list){
        
      this.stocklist = list;
      
    }
    
    
    Scanner menuScanner  = new Scanner(System.in);
    @Override
    public void add(){
        
       out.print("Which Stock you want to added");
       int choice = menuScanner.nextInt();
       StockManagerInterface stockmanager;
       switch(choice){
           
           case 1:
               
               stocklist.add(TrouserManager.add());
               break;
           case 2:
               
               stocklist.add(footwearManager.add());
               break;
               
       }
       
        
    
    }
    
    @Override
    public void delete(){
        
        out.println("Enter the Stock ID you want to delete");
        int num = menuScanner.nextInt();
        stocklist.deletById(num);
        out.println("Successfully Deleted");
        pressEnterContinue();
        
        
    }
    
    @Override
    public void list(){
        
        for(int i = 0;i < stocklist.getSize(); i++){
            
            out.println("---------");
            Stock stock = stocklist.getById(i);
            stock.showAllItems();
            
        }
        
        pressEnterContinue();
    }
    
    public void search(){
        
        out.println("Enter the Stock ID you want to search");
        Stock stock = stocklist.getById(menuScanner.nextInt());
        stock.showAllItems();
        pressEnterContinue();
       
        
    }
    
    // helper method for termination of process
   protected void pressEnterContinue(){
       Scanner myScanner = new Scanner(System.in);
        out.println("Press enter to continue");
        if(myScanner.hasNextLine()){
            return;
        }
   }
   
     
     
     
}



