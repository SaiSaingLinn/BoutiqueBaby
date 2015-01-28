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
public class Order {
    
    protected int Id;
    protected int stockId;
    protected String customerName;
    protected String orderDate;

    public Order(int Id, int stockId, String customerName, String orderDate) {
        this.Id = Id;
        this.stockId = stockId;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }
    
    public Order(){
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getId() {
        return Id;
    }

    public int getStockId() {
        return stockId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }
    

 
    
    
}
