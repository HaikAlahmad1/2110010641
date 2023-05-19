/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembershipGym;

/**
 *
 * @author User
 */
public class OrderDetail {
    
    private String quantity;
    private String taxStatus;
    
    public OrderDetail() {}
    
    public OrderDetail(String a){
        setquantity(a);
    }
    
    public OrderDetail(String a, String b){
        setquantity(a);
        settaxStatus(b);
    }
    
    public void setquantity(String a){
        this.quantity=a;
    }
    
    public String getquantity(){
        return this.quantity;
    }
    
    public void settaxStatus(String b){
        this.taxStatus=b;
    }
    
    public String gettaxStatus(){
        return this.taxStatus;
    }
    
    public String dataOrderDetail(){
        return getquantity()+gettaxStatus();
    }
    public String dataOrderDetail(String a,String b){
        setquantity(a);
        settaxStatus(b);
        
       return getquantity()+gettaxStatus();
    }
    
}
