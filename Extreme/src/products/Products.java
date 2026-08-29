/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package products;

import product.Product;
import reportdata.ReportData;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Netshikhudini mpho 26042117
 */
public class Products {
    private ArrayList<Product> productList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    public void DisplayMenu(){
        int choice = 0;
        do{
        System.out.println("\n--- EXTRE IT MENU --");
        System.out.println("1. Add Product");
        System.out.println("q. View All Products");
        System.out.println("3. Search Product");
        System.out.println("4.Update Product");
        System.out.println("Delete Product");
        System.out.println("6. Show Report");
        System.out.println("0. Exit");
        choice = sc.nextInt();
        sc.nextLine();
        
        switch(choice){
            
            case 1: addProduct();
            break;
            case 2: viewProducts();
            break;
            case 3: searchProduct();
            break;
            case 4: updateProduct();
            break;
            case 5: deleteProduct();
            break;
            case 6: ReportData.generateReport(productList);
            break;
            
                    
        }
        }while(choice != 0);
                
      
        }
private void addProduct(){
    System.out.print("ID:");
    String code = sc.nextLine();
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Category: ");
    String cat = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();
    System.out.print("Stock: ");
    int stock = sc.nextInt();
    System.out.print("Warranty months: ");
    int war = sc.nextInt();
    productList.add(new Product(code,name,cat, String.valueOf(war),price,stock));
    System.out.println("Product added! ");
    
}

private void viewProducts(){
    if (productList.isEmpty())
        System.out.println("No products");
    else for(Product p: productList)
        System.out.println(p);
}
private void searchProduct(){
    System.out.print("Enter CODE to search:n");
    String code = sc.nextLine();
    for(Product p: productList)
        if(p.getCode().equalsIgnoreCase(code)){
            System.out.println(p); return;}
    System.out.println("Not found");
        }
private void updateProduct(){
    System.out.println("Enter CODE to update: ");
    String code = sc.nextLine();
    for(Product p: productList)
        if(p.getCode().equalsIgnoreCase(code)){
            System.out.print("New Price: ");
            p.setPrice(sc.nextDouble());
            sc.nextLine();
            System.out.print("New Stock: ");
            p.setstock(sc.nextInt());
            sc.nextLine();
            
            System.out.println("Updated");
            return;
        }
    System.out.println("Not found");
}
private void deleteProduct(){
    
    System.out.print("Enter CODE to delete: ");
    String code = sc.nextLine();
    productList.removeIf(p->p.getCode().equalsIgnoreCase(code));
    System.out.println("Deleted if existed");
}
}
