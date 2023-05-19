/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembershipGym;


/**
 *
 * @author User
 */
public class Customer {
    
    private String name;
    private String address;
    
    public Customer() {}
    
    public Customer(String a){
        setname(a);
    }
    
    public Customer(String a, String b){
        setname(a);
        setaddress(b);
    }
    
    public void setname(String a){
        this.name=a;
    }
    
    public String getname(){
        return this.name;
    }
    
    public void setaddress(String b){
        this.address=b;
    }
    
    public String getaddress(){
        return this.address;
    }
    
    public String dataCustomer(){
        return getname()+getaddress();
    }
    public String dataCustomer(String a,String b){
        setname(a);
        setaddress(b);
        
       return getname()+getaddress();
    }
}