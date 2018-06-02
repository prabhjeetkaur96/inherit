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
public class permanentEmployee extends Employee {
    String designation;
    float salary;
    
    public permanentEmployee(){
    super();
    this.designation = "unknown";
    this.salary = 0.0f;
    
    }
    
            public permanentEmployee(String name, String address,int age,String eID , String joiningDate, int deptNo, String designation ,float hourlyRate){
                super(name ,address,age,eID,joiningDate, deptNo);
                this.designation =designation;
                this.salary = hourlyRate;
            }
               @Override
               
                public String toString(){
                    return (super.toString()+ "\n designation = " +this.designation+ "\n salary = "+ this.salary);
                }
}
