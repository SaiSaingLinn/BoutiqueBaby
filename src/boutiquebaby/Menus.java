/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;

import java.io.DataInputStream;


/**
 *
 * @author xikang
 */
public class Menus {
    
   public void menuStart(){
       
       try {
           DataInputStream input=new DataInputStream(System.in);
           System.out.println("\t\tMain Menu");
           System.out.println("\t\t---------");
           System.out.println("\t\tChoose 1 to 10 for performing tasks");
           System.out.println("\t\t-----------------------------------");
           System.out.println("1.Purchase Stock");
           System.out.println("2.Add Stock");
           System.out.println("3.Add Seller");
           System.out.println("4.Purchase List");
           System.out.println("5.Product List");
           System.out.println("6.Add Customer");
           System.out.println("7.Customer List");
           System.out.println("8.Add Order");
           System.out.println("9.Order List");
           System.out.println("10.Search by Purchase");
           System.out.println("11.Search by Order");
           System.out.println("12.Remove Order Item");
           System.out.println("13.Remove Stock Item");
           System.out.println("14.Exit Program");
           System.out.println("Please Enter (1 to 14)");
           int choice =Integer.parseInt(input.readLine());	//using method to receive data and convert string to integer
           
           switch(choice){
               case 1:
                 StockMenu.menuQuestion = new String[]{
                   "1. add Stock",
                   "2. Delete Stock",
                   "3. Search Stock",
                   "4. Show All Stock"
               };// add list of questions to static array menuQuestion from StockMenu
                 StockMenu.build();
               
                 break;
           }
           
       } catch (Exception e) {
           
           System.out.println(e);
       }
   }
}
