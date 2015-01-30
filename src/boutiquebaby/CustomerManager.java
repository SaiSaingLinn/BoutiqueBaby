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
public class CustomerManager implements Manager{
    
    CustomerList customerlist;
    
    public CustomerManager(CustomerList list){
        
      this.customerlist = list;
      
    }
    
    
    Scanner menuScanner  = new Scanner(System.in);
   
    public void add(){
        
       Customer customer = new Customer();
       out.println("Enter CustomerID");
       customer.setId(menuScanner.nextInt());
       out.println("Enter Customer Name");
       customer.setName(menuScanner.next());
       out.println("Enter Customer Address");
       customer.setAddress(menuScanner.next());
       out.println("Enter Customer postcode");
       customer.setPostcode(menuScanner.next());
       out.println("Enter Customer Phone");
       customer.setPhone(menuScanner.nextInt());
       out.println("Enter Customer Email");
       customer.setEmail(menuScanner.next());
       customerlist.add(customer);
       this.showAllItems(customer);
       out.println("add Completed");
       pressEnterContinue();
       
    }
    

    public void delete(){
        
        out.println("Enter the CustomerID you want to delete");
        int num = menuScanner.nextInt();
        customerlist.deletById(num);
        out.println("Successfully Deleted");
        pressEnterContinue();
        
        
    }
    

    public void list(){
        
        for(int i = 0;i < customerlist.getSize(); i++){
            
            out.println("---------");
            Customer customer = customerlist.getById(i);
            this.showAllItems(customer);
        }
        
        pressEnterContinue();
    }
    
    public void search(){
        
        out.println("Enter the CustomerID you want to search");
        Customer customer = customerlist.getById(menuScanner.nextInt());
        this.showAllItems(customer);
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
    
   protected void showAllItems(Customer customer){
       
       out.println("ID:" + customer.getId() );
       out.println("Name: " + customer.getName() );
       out.println("Address: " + customer.getAddress());
       out.println("Postcode: " + customer.getPostcode());
       out.println("Phone: " + customer.getPhone() );
       out.println("Phone: " + customer.getEmail());
       
       out.println();
       out.println();
   }
    
}
