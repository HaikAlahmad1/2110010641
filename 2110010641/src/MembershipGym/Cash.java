/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembershipGym;

/**
 *
 * @author User
 */
public class Cash {
    
    private String cashTendered;
    
    public Cash() {}
    
    public Cash(String a){
        setcashTendered(a);
    }

    
    public void setcashTendered(String a){
        this.cashTendered=a;
    }
    
    public String getcashTendered(){
        return this.cashTendered;
    }
    
    public String dataCash(){
        return getcashTendered();
    }
    
    public String dataCash(String a){
        setcashTendered(a);
        
        
       return getcashTendered();
    }
    
    
}
