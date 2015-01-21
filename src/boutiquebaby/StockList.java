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
public class StockList {
    
    protected ArrayList<Stock> stockList;
    
    public StockList(){
      
        stockList = new ArrayList<Stock>();
    }
    
    public void add(Stock stock){
        
        stockList.add(stock);
    }
    
    public void deletById(int id){
        
        stockList.remove(id);
    }
    
    public int getSize(){
        
       return  stockList.size();
       
    }
    
    public Stock getById(int id){
        
        return stockList.get(id);
    }
    
    
    
}
