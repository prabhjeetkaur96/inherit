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
public class mainBank {
      public static void main(String[] args) {
        // TODO code application logic here
      bankAccount B1 = new bankAccount(112," Scotia Bank",876576,"prabh",3400.78f);
        System.out.println(B1.toString());
        
          overdraftAccount OD1= new overdraftAccount(234, "RBC Bank",6754875, "pooja",7600.00f, 1500.50f);
      System.out.println(OD1.toString());
}
}