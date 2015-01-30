/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;

import static java.lang.System.out;

/**
 *
 * @author xikang
 */
public class footwear extends Stock {
    
   protected int shoesize;
   protected int weight;

    public footwear(int shoesize, int weight, int ID, String manufacture, String size, String color, String description, String material, int retailPrice) {
        super(ID, manufacture, size, color, description, material, retailPrice);
        this.shoesize = shoesize;
        this.weight = weight;
    }

    public footwear() {
        
    }

    public int getShoesize() {
        return shoesize;
    }

    public int getWeight() {
        return weight;
    }

    public int getID() {
        return ID;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setShoesize(int shoesize) {
        this.shoesize = shoesize;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    protected void showAllItems(){
        
        out.println("ID:" + this.getId() );
            out.println("Manufacture:" + this.getManfacture());
            out.println("Size:" + this.getSize());
            out.println("Color:" + this.getColor());
            out.println("Description:" + this.getDescription());
            out.println("Meterial:" + this.getMaterial());
            out.println("Retail Price:" + this.getRetailPrice());
            out.println("Shoose Size: " + this.getShoesize());
            out.println("Weight: " + this.getWeight());
            out.println();
   }
    
   
   
    
}
