/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percentages;
import  java.util.Scanner;


/**
 *
 * @author mphon
 */
public class Percentages2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first double: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second double: ");
        double num2 = input.nextDouble();
        
        Percentages.computePercent(num1, num2);
        Percentages.computePercent(num2, num1);
        
        input.close();
        
    }
    
}
