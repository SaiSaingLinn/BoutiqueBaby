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
public class Trouser extends Stock{

    protected int length;
    protected int waist;

    public Trouser(int length, int waist, int ID, String manufacture, String size, String color, String description, String material, int retailPrice) {
        super(ID, manufacture, size, color, description, material, retailPrice);
        this.length = length;
        this.waist = waist;
    }

    public Trouser() {
        
    }
    


    public int getLength() {
        return length;
    }

    public int getWaist() {
        return waist;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }
    
    protected void showAllItems(){
        out.println("ID:" + this.getId() );
            out.println("Manufacture:" + this.getManfacture());
            out.println("Size:" + this.getSize());
            out.println("Color:" + this.getColor());
            out.println("Description:" + this.getDescription());
            out.println("Meterial:" + this.getMaterial());
            out.println("Retail Price:" + this.getRetailPrice());
            out.println("Waist: " + this.getWaist());
            out.println("Lenght: " + this.getLength());
            out.println();
   }

  
}
