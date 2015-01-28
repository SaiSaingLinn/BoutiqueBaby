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
public class Trouser extends Stock{

    protected int length;
    protected int waist;

    public Trouser(int length, int waist, int ID, String manufacture, String size, String color, String description, String material, int retailPrice) {
        super(ID, manufacture, size, color, description, material, retailPrice);
        this.length = length;
        this.waist = waist;
    }

    public Trouser(int length, int waist) {
        this.length = length;
        this.waist = waist;
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
    
    

  
}
