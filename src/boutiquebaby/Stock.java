/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;

/**
 *
 * @author xikang
 */
public class Stock {
    
    protected int ID;
    protected String manufacture;
    protected String size;
    protected String color;
    protected String description;
    protected String materila;
    protected int retailPrice;

    
    public Stock(){ 
                        //int id, String manufacture
//                       String size, String color, 
//                       String material, int retailPrice){
//        
//        this.ID = id;
//        this.manufacture = manufacture;
//        this.color = color;
//        this.size = size;
//        this.materila = material;
//        this.retailPrice = retailPrice;
    }
    
    public void setId(int id){
        
        this.ID = id;
    }
    
    public int getId(){
        
        return this.ID;
    }
    
    public void setManufacture(String manufacture){
        
        this.manufacture = manufacture;
    }
    
    public String getManfacture(){
        
        return this.manufacture;
    }
    
}
