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
public class overdraftAccount extends bankAccount {
      
    float overdraftLimit;
    
    public overdraftAccount (){
    super();
  
    this.overdraftLimit = 00.00f;
    
    }
    
            public overdraftAccount(int ID, String name,int accountNo,String ownerName ,float balanceAmount, float overdraftLimit){
                super( ID,  name, accountNo, ownerName, balanceAmount);
                this.overdraftLimit =overdraftLimit;
                
            }
            float f;
            f = withdraw();
            if((f- this.overdraftAccount)>0)
            {
                System.out.println("approved");
            }
            else
            { System.out.println(" not approved");
            }
            }
               @Override
               
                public String toString(){
                    return (super.toString()+ "\n overdraftLimit =  " +this.overdraftLimit);
                }  
}
