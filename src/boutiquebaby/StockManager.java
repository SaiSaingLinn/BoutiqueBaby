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
       Stock myStock = new Stock();
       out.println("Enter Stock ID");
       myStock.setID(menuScanner.nextInt());
       int id  = menuScanner.nextInt();
       out.println("Enter Stock Manufacture");
       myStock.setManufacture(menuScanner.next());
       stocklist.add(myStock);
       
        
    
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
            out.println("ID:" + stock.getId() );
            out.println("Manufacture:" + stock.getManfacture());
            out.println("Size:" + stock.getSize());
            out.println("Color:" + stock.getColor());
            out.println("Description:" + stock.getDescription());
            out.println("Meterial:" + stock.getMaterial());
            out.println("Retail Price:" + stock.getRetailPrice());
            out.println();
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



