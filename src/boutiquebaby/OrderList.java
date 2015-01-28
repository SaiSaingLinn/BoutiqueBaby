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
public class OrderList {
    
     protected ArrayList<Order> orderList;
    
    public OrderList(){
      
        orderList = new ArrayList<Order>();
    }
    
    public void add(Order order){
        
        orderList.add(order);
    }
    
    public void deletById(int id){
        
        orderList.remove(id);
    }
    
    public int getSize(){
        
       return  orderList.size();
       
    }
    
    public Order getById(int id){
        
        return orderList.get(id);
    }
    
    
    
}
