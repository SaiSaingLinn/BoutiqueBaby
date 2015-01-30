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
public class footwearManager {
    
    public static FootWear add(){
        
       Scanner menuScanner = new Scanner(System.in); 
       FootWear footwear = new FootWear();
       out.println("Enter Stock ID");
       footwear.setID(menuScanner.nextInt());
       out.println("Enter Stock Manufacture");
       footwear.setManufacture(menuScanner.next());
       out.println("Enter Size");
       footwear.setSize(menuScanner.next());
       out.println("Enter Color");
       footwear.setColor(menuScanner.next());
       out.println("Enter Description");
       footwear.setDescription(menuScanner.next());
       out.println("Enter Materail");
       footwear.setMaterial(menuScanner.next());
       out.println("Enter Retail Price");
       footwear.setRetailPrice(menuScanner.nextInt());
       out.println("Enter shoose Size");
       footwear.setShoesize(menuScanner.nextInt());
       out.println("Enter weight");
       footwear.setWeight(menuScanner.nextInt());
       return footwear;
    }
    
}
