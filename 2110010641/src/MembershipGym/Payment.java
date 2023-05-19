/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembershipGym;

/**
 *
 * @author User
 */
public class Payment {
    
    private String amount;
    
    public Payment() {}
    
    public Payment(String a){
        setamount(a);
    }

    
    public void setamount(String a){
        this.amount=a;
    }
    
    public String getamount(){
        return this.amount;
    }
    
    public String dataPayment(){
        return getamount();
    }
    
    public String dataPayment(String a){
        setamount(a);
        
        
       return getamount();
    }
    
}
