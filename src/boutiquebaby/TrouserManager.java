/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author xikang
 */
public class TrouserManager implements StockManagerInterface{
    
    public static Trouser add(){
       Scanner menuScanner = new Scanner(System.in); 
       Trouser trouser = new Trouser();
       out.println("Enter Stock ID");
       trouser.setID(menuScanner.nextInt());
       int id  = menuScanner.nextInt();
       out.println("Enter Stock Manufacture");
       trouser.setManufacture(menuScanner.next());
       return trouser;
    }

    
}
