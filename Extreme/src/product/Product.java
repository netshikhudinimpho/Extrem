/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author mphon
 */
public class Product {
    private String code;
    private String name;
    private String category;
    private String warranty;
    private double price;
    private int stock;
    
    
    public Product(String code, String name, String category, String warranty, double price, int stock){
    
        this.code = code;
        this.name = name;
        this.category = category;
        this.warranty = warranty;
        this.price = price;
        this.stock = stock;
    }
     public String getCode() {return code; }
     public String getName(){return name; }
     public String getCategory(){return category;}
     public String getWarranty(){return warranty; }
     public double getPrice(){return price;}
     public int getstock(){return stock;}
     
     
     public void setwarranty(String warranty){this.warranty = warranty;}
     public void setPrice(double price){this.price = price; }
     public void setstock(int stock){this.stock = stock;}
     
     
     public String toString(){
         
         return code + " | " + name + "| " + category + " | R" + price;
     }
        
    
    
}

