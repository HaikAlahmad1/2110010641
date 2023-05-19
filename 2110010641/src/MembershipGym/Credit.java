/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembershipGym;

/**
 *
 * @author User
 */
public class Credit {
    
    private String number;
    private String type;
    private String expDate;
    
    public Credit() {}
    
    public Credit(String a){
        setnumber(a);
    }
    
    public Credit(String a, String b){
        setnumber(a);
        settype(b);   
    }
    
    public Credit(String a, String b, String c){
        setnumber(a);
        settype(b);
        setexpDate(c);
    }
    
    public void setnumber(String a){
        this.number=a;
    }
    
    public String getnumber(){
        return this.number;
    }
    
    public void settype(String b){
        this.type=b;
    }
    
    public String gettype(){
        return this.type;
    }
    public void setexpDate(String b){
        this.expDate=b;
    }
    
    public String getexpDate(){
        return this.expDate;
    }
    
    public String dataCredit(){
        return getnumber()+gettype()+getexpDate();
    }
    public String dataCredit(String a,String b,String c){
        setnumber(a);
        settype(b);
        setexpDate(c);
        
       return getnumber()+gettype()+getexpDate();
    }
    
    
}
