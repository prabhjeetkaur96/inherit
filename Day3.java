/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author macstudent
 */
public class Day3 {
    
        public static void main(String[] args) {
        // TODO code application logic here
      Employee emp1 = new Employee("rutvi", "toronto", 23,"e01", "12 may 2017",10);
      //emp1.name = "rutvi";
      //emp1.address = "toronto";
      //emp1.age = 23;
      //System.out.println("name : " + emp1.name + "\naddress : " + emp1.address + "\nage : " + emp1.age);
      System.out.println(emp1.toString());
      temporaryEmployee tE1 = new temporaryEmployee("sukh", "brampton",22, "T123", "01 May 2017", 20,"ios Developer",80.50f);
      System.out.println(tE1.toString());
      
       permanentEmployee pE1 = new permanentEmployee("prabh", "toronto",22, "p123", "01 june 2017", 30,"ios Developer",10000.75f);
      System.out.println(pE1.toString());
    }
}
