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
    protected String material;
    protected int retailPrice;

    
    public Stock(int id, String manufacture){
//                       String size, String color, 
//                       String material, int retailPrice){
//        
          this.ID = id;
          this.manufacture = manufacture;
//        this.color = color;
//        this.size = size;
//        this.materila = material;
//        this.retailPrice = retailPrice;
    }
    
    

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }
    
    
    
   
    
    
    
    public int getId(){
        
        return this.ID;
    }
    
    public String getManfacture(){
        
        return this.manufacture;
    }
    
    public String getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMaterial() {
        return this.material;
    }

    public int getRetailPrice() {
        return this.retailPrice;
    }
    
}
