/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */

public class Bank {

    /**
     * @param args the command line arguments
     */
   int ID;
   String name;
       Scanner in = new Scanner(System.in); 
   
     Bank( ){
         ID = 1;
         name = "unknown";
     }
      
      //parametrized constructor
      Bank(int ID, String name ){
          this.ID=ID;
          this.name = name;
        
      }
     void setID(){
    System.out.println("Enter ID : ");
    ID = Integer.parseInt(in.nextLine());
}
    int getID(){
     return ID;
 }
        void setName(){
      
        System.out.println("Enter name");
        this.name = in.nextLine();
    
    }
    String getName(){
     return name; 
    }

    
void setData(){
    
        setID();
        setName();
}

             @Override
public String toString(){
    String data =  "ID : "+ ID+ " \n Name :" + name ;
    
    return data; 
          
       
    }}
    

