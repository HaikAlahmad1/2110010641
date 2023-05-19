/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembershipGym;

/**
 *
 * @author User
 */
public class Order {
    
    private String date;
    private String status;
    
    public Order() {}
    
    public Order(String a){
        setdate(a);
    }
    
    public Order(String a, String b){
        setdate(a);
        setstatus(b);
    }
    
    public void setdate(String a){
        this.date=a;
    }
    
    public String getdate(){
        return this.date;
    }
    
    public void setstatus(String b){
        this.status=b;
    }
    
    public String getstatus(){
        return this.status;
    }
    
    public String dataOrder(){
        return getdate()+getstatus();
    }
    public String dataOrder(String a,String b){
        setdate(a);
        setstatus(b);
        
       return getdate()+getstatus();
    }
    
}
