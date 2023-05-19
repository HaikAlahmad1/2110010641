/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembershipGym;

/**
 *
 * @author User
 */
public class Check {
    private String name;
    private String bank;
    
    public Check() {}
    
    public Check(String a){
        setname(a);
    }
    
    public Check(String a, String b){
        setname(a);
        setbank(b);
    }
    
    public void setname(String a){
        this.name=a;
    }
    
    public String getname(){
        return this.name;
    }
    
    public void setbank(String b){
        this.bank=b;
    }
    
    public String getbank(){
        return this.bank;
    }
    
    public String dataCheck(){
        return getname()+getbank();
    }
    public String dataCheck(String a,String b){
        setname(a);
        setbank(b);
        
       return getname()+getbank();
    }
    
}
