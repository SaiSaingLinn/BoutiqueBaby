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
        
       out.println("Enter Stock ID");
       int id  = menuScanner.nextInt();
       out.println("Enter Stock Manufacture");
       String manufacture = menuScanner.next();
       Stock myStock = new Stock(id, manufacture);
       stocklist.add(myStock);
       
        
    
    }
    
    @Override
    public void delete(){
        
        
        
    }
    
    @Override
    public void list(){
        
        for(int i = 0;i < stocklist.getSize(); i++){
            
            Stock stock = stocklist.getById(i);
            out.println(stock.ID);
            out.println(stock.manufacture);
        }
        
        pressEnterContinue();
    }
    
    public void search(){
        
        out.println("Enter the Stock ID you want to search");
        Stock stock = stocklist.getById(menuScanner.nextInt());
        out.println(stock.getId());
        out.println(stock.getManfacture());
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



