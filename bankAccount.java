/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author macstudent
 */
public class bankAccount extends Bank{
      int accountNo;
    String ownerName;
    float balanceAmount;
    
    bankAccount(){
        super();
        this.accountNo = 00;
        this.ownerName = "abc";
        this.balanceAmount = 00.00f;
    }
    bankAccount( int ID, String name, int accountNo, String ownerName, float balanceAmount){
        super(ID,name);
        this.accountNo =accountNo;
        this.ownerName = ownerName;
        this.balanceAmount = balanceAmount;
      }
     
    

}
     @Override 
     public String toString(){
         String personalDetails = super.toString();
         String data = " \n accountNo : " + this.accountNo + "\n ownerName : " + this.ownerName + "\n balanceAmount: " + this.balanceAmount;

return personalDetails + data;
     }
}
