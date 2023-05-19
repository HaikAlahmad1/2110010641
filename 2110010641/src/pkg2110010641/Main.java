/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010641;

import MembershipGym.*;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Method Overload");
        Customer objku = new Customer();
    System.out.println("Data Customer: " +objku.dataCustomer("HaikalAhmad ", "Cendana"));
    
        Payment objku2 = new Payment();
    System.out.println("Data Payment: " +objku2.dataPayment("Rp30Juta"));
    
        Order objku3 = new Order();
    System.out.println("Data Order: " +objku3.dataOrder("12 mei 2023 ", "aktif"));
    
        OrderDetail objku4 = new OrderDetail();
    System.out.println("Data OrderDetail: " +objku4.dataOrderDetail("Standar ", "Mt"));
    
        item objku5 = new item();
    System.out.println("Data item: " +objku5.dataitem(" 12 ", "15"));
    
        Credit objku6 = new Credit();
    System.out.println("Data Credit: " +objku6.dataCredit(" 01 ", "amount "," 12 maret 2023"));
    
        Cash objku7 = new Cash();
    System.out.println("Data Cash: " +objku7.dataCash("Rp30Juta"));
    
        Check objku8 = new Check();
    System.out.println("Data Check: " +objku8.dataCheck("Haikal Ahmad  ", "BRI"));
    
    System.out.println("");
    
    System.out.println("Constructor Overload");
    
    Customer objku9 = new Customer("HaikalAhmad ", "Cendana");
    System.out.println("Data Customer: " +objku9.dataCustomer());
    
        Payment objku10 = new Payment("Rp30Juta");
    System.out.println("Data Payment: " +objku10.dataPayment());
    
        Order objku11 = new Order("12 mei 2023 ", "aktif");
    System.out.println("Data Order: " +objku11.dataOrder());
    
        OrderDetail objku12 = new OrderDetail("Standar ", "Mt");
    System.out.println("Data OrderDetail: " +objku12.dataOrderDetail());
    
        item objku13 = new item(" 12 ", "15");
    System.out.println("Data item: " +objku13.dataitem());
    
        Credit objku14 = new Credit(" 01 ", "amount "," 12 maret 2023");
    System.out.println("Data Credit: " +objku14.dataCredit());
    
        Cash objku15 = new Cash("Rp30Juta");
    System.out.println("Data Cash: " +objku15.dataCash());
    
        Check objku16 = new Check("Haikal Ahmad  ", "BRI");
    System.out.println("Data Check: " +objku16.dataCheck());
    
    }
    
    
}
