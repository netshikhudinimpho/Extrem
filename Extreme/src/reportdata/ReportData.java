/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportdata;
import product.Product;
import java.util.ArrayList;

/**
 *
 * @author Netshikhudini mpho 26042117
 */
public class ReportData {
    public static void generateReport(ArrayList<Product> list){
        System.out.println("\n--- PRODUCT REPORT ---");
        if(list.isEmpty()){
            System.out.println("No data to report");
            return;
        }
        double totalvalue = 0;
        for(Product p : list){
            System.out.println(p);
            totalvalue += p.getPrice()* p.getstock();
        }
        System.out.println("---------------------");
        System.out.println("Total Product:" + list.size());
        System.out.println("Total Stock Value: R" +totalvalue);
    }
    
}
