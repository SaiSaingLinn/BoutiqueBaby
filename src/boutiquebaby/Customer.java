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
public class Customer {
    
    protected int Id;
    protected String name;
    protected String address;
    protected String postcode;
    protected int phone;
    protected String email;

    public Customer(int Id, String name, String address, String postcode, int phone, String email) {
        this.Id = Id;
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.email = email;
    }
  
    public Customer(){
        
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
