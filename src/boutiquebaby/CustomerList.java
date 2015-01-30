/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;

import java.util.ArrayList;

/**
 *
 * @author xikang
 */
public class CustomerList {
    
     protected ArrayList<Customer> customerList;
    
    public CustomerList(){
      
        customerList = new ArrayList<>();
    }
    
    public void add(Customer customer){
        
        customerList.add(customer);
    }
    
    public void deletById(int id){
        
        customerList.remove(id);
    }
    
    public int getSize(){
        
       return  customerList.size();
       
    }
    
    public Customer getById(int id){
        
        return customerList.get(id);
    }
    
}
