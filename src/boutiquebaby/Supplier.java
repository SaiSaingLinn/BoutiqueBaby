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
public class Supplier {
    
    protected int supplierId;
    protected String name;
    protected String Address;

    public Supplier(int supplierId, String name, String Address) {
        this.supplierId = supplierId;
        this.name = name;
        this.Address = Address;
    }
    public Supplier(){
        
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    

    public int getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }
}
