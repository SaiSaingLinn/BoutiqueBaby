/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;

import java.io.DataInputStream;
import static java.lang.System.out;
import java.util.Scanner;


/**
 *
 * @author xikang
 */
public class Menus {
    
   public void menuStart(){
       int choice = 0;
       
       StockList stocklist = new StockList();
       Stock stock1 = new Stock(1, "Min");
       stocklist.add(stock1);
       Stock stock2 = new Stock(2, "Min");
       stocklist.add(stock2);
       Stock stock3 = new Stock(3, "Min");
       stocklist.add(stock3);
       out.println(stocklist.getById(1).getManfacture());
       
        while ( choice !=14){
       try {
           
           Scanner MenuScanner = new Scanner(System.in);
           out.println("\t\tMain Menu");
           out.println("\t\t---------");
           out.println("\t\tChoose 1 to 10 for performing tasks");
           out.println("\t\t-----------------------------------");
           out.println("1.Stock");
           out.println("2.Add Stock");
           out.println("3.Add Seller");
           out.println("4.Purchase List");
           out.println("5.Product List");
           out.println("6.Add Customer");
           out.println("7.Customer List");
           out.println("8.Add Order");
           out.println("9.Order List");
           out.println("10.Search by Purchase");
           out.println("11.Search by Order");
           out.println("12.Remove Order Item");
           out.println("13.Remove Stock Item");
           out.println("14.Exit Program");
           out.println("Please Enter (1 to 14)");
           choice = MenuScanner.nextInt();	//using method to receive data and convert string to integer
    
           switch(choice){
               case 1:
                   
                 MenuBuilder.menuQuestion = new String[]{
                   "1. add Stock",
                   "2. Delete Stock",
                   "3. List All Stock",
                   "4. Search Stock"
               };// add list of questions to static array menuQuestion from StockMenu
                 MenuBuilder.build();
                 int choice1 = MenuScanner.nextInt();
                 while( inputValidation(choice1, MenuBuilder.menuQuestion.length) == false){
                     choice1 = MenuScanner.nextInt();
                 }
                 StockManager stockManager= new StockManager(stocklist);
                  MenuBuilder.decisionMaking(choice1, stockManager);
                 break;
               case 2:
                   break;
           }
           
       } catch (Exception e) {
           
           out.println(e);
       }
        }
   }
   
   protected boolean inputValidation(int responeNum, int questionNum ){
        boolean inputValidation = false;
   
        if(responeNum <= questionNum ){
                  inputValidation = true;
               }else{
                 out.println("invalid command !Try again.");
                 inputValidation = false;
               }
        
        return inputValidation;
    }
}
