/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percentages;

/**
 *
 * @author mphon
 */
public class Percentages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1 = 2.0;
        double num2 = 5.0;
        
        computePercent(num1, num2);
        
        computePercent(num2, num1);
        
        
        // TODO code application logic here
    }
    public static void computePercent(double first, double second){
        double percent = (first / second) * 100;
        System.out.println( first + " is " + percent + " percent of" + second);
    }
    
}
