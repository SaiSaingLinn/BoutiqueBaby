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
public class SupplierManager implements Manager {
    
     SupplierList supplierlist;
    
    public SupplierManager(SupplierList list){
        
      this.supplierlist = list;
      
    }
    
    
    Scanner menuScanner  = new Scanner(System.in);
    @Override
    public void add(){
        
       Supplier supplier = new Supplier();
        out.println("Enter Supplier ID");
        supplier.setSupplierId(menuScanner.nextInt());
       out.println("Enter Supplier Name");
       supplier.setName(menuScanner.next());
       out.println("Enter Supplier Address");
       supplier.setAddress(menuScanner.next());
       supplierlist.add(supplier);
       this.showAllItems(supplier);
       
        
    
    }
    
    @Override
    public void delete(){
        
        out.println("Enter the Supplier ID you want to delete");
        int num = menuScanner.nextInt();
        supplierlist.deletById(num);
        out.println("Successfully Deleted");
        pressEnterContinue();
        
        
    }
    
    @Override
    public void list(){
        
        for(int i = 0;i < supplierlist.getSize(); i++){
            
            
            Supplier supplier = supplierlist.getById(i);
            this.showAllItems(supplier);
            out.println("---------");
        }
        
        pressEnterContinue();
    }
    
    public void search(){
        
        out.println("Enter the Supplier ID you want to search");
        Supplier supplier = supplierlist.getById(menuScanner.nextInt());
        this.showAllItems(supplier);
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
   
     protected void showAllItems(Supplier supplier){
         
        out.println("ID:" + supplier.getSupplierId());
        out.println("Name: " + supplier.getName());
        out.println("Address: " + supplier.getAddress());
        out.println();
   }
    
}
