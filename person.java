/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class person {
    String name;
    String address;
    int age;
      Scanner in = new Scanner(System.in);
      
      
      //default contructor
      person( ){
          name = "unknown";
          address = "unknown";
          age = 1;
      }
      
      //parametrized constructor
      person(String name,String address, int age){
          this.name = name;
          this.address = address;
          this.age = age;
      }
      
      person(person anotherperson){
          this.name = anotherperson.name;
          this.address = anotherperson.address;
          this.age = anotherperson.age;


      }
    void setName(){
      
        System.out.println("Enter name");
        this.name = in.nextLine();
    
    }
    String getName(){
     return name; 
    }
void setAddress(){
    System.out.println("Enter Addess : ");
    address = (in.nextLine());
}
 String getAddress(){
     return address;
 }

void setAge(){
    System.out.println("enter age :");
    age = Integer.parseInt(in.nextLine());
}

int getAge(){
    return age;
}

void setData(){
    setName();
    setAddress();
    setAge();
    
}
@Override
public String toString(){
    String data = " Name :" + name + "\n Address :" + address + "\n Age :" + age;
    
    return data;
    
}
}
