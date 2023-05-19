/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembershipGym;

/**
 *
 * @author User
 */
public class item {
    
    private String shippingWeightDescription;
    private String getPrinceForQuantityGetWeight;
   
    
    public item() {}
    
    public item(String a){
        setshippingWeightDescription(a);
    }
    
    public item(String a, String b){
        setshippingWeightDescription(a);
        setgetPrinceForQuantityGetWeight(b);
    }
    
    public void setshippingWeightDescription(String a){
        this.shippingWeightDescription=a;
    }
    
    public String getshippingWeightDescription(){
        return this.shippingWeightDescription;
    }
    
    public void setgetPrinceForQuantityGetWeight(String b){
        this.getPrinceForQuantityGetWeight=b;
    }
    
    public String getPrinceForQuantityGetWeight(){
        return this.getPrinceForQuantityGetWeight;
    }
    
    public String dataitem(){
        return getshippingWeightDescription()+getPrinceForQuantityGetWeight();
    }
    public String dataitem(String a,String b){
        setshippingWeightDescription(a);
        setgetPrinceForQuantityGetWeight(b);
        
       return getshippingWeightDescription()+getPrinceForQuantityGetWeight();
    }
    
}
