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
public class OrderManager implements  Manager {
    
     OrderList orderlist;
    
    public OrderManager(OrderList list){
        
      this.orderlist = list;
      
    }
    
    
    Scanner menuScanner  = new Scanner(System.in);
   
    public void add(){
       Order order = new Order();
       out.println("Enter Order ID");
       order.setId(menuScanner.nextInt());
       out.println("Enter Stock ID");
       order.setId(menuScanner.nextInt());
       out.println("Enter Customer name");
       order.setCustomerName(menuScanner.next());
       out.println("Enter Order Date");
       order.setOrderDate(menuScanner.next());
       orderlist.add(order);
       this.showAllItems(order);
       out.println("add Completed");
       pressEnterContinue();
       
    }
    

    public void delete(){
        
        out.println("Enter the Order ID you want to delete");
        int num = menuScanner.nextInt();
        orderlist.deletById(num);
        out.println("Successfully Deleted");
        pressEnterContinue();
        
        
    }
    

    public void list(){
        
        for(int i = 0;i < orderlist.getSize(); i++){
            
            out.println("---------");
            Order order = orderlist.getById(i);
            this.showAllItems(order);
        }
        
        pressEnterContinue();
    }
    
    public void search(){
        
        out.println("Enter the Order ID you want to search");
        Order order = orderlist.getById(menuScanner.nextInt());
        this.showAllItems(order);
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
    
   protected void showAllItems(Order order){
       
       out.println("ID:" + order.getId() );
       out.println("Stock ID: " + order.getStockId() );
       out.println("Customer Name: " + order.getCustomerName());
       out.println("Order Date: " + order.getOrderDate());
       out.println();
       out.println();
   }
}
