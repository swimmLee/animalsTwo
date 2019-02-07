/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lhebe
 */
public class UserInput {
    public ArrayList<Talkable> crit;
    
    public UserInput(ArrayList z){
        crit = z;
    }
    
    public void fillZOO(){
        Scanner keybrd = new Scanner(System.in);
        String type = "", name = "";
        int mouses = 0, age = 0;
        Boolean friendly;
        while(!type.equalsIgnoreCase("quit")){
            
            System.out.println("What kind of critter do you want to put in the zoo?");
            System.out.println(" Choose Cat, Dog, Student");
            type = keybrd.nextLine();
            if(type.equalsIgnoreCase("cat")){
                System.out.println("What is the cat's name?");
                name = keybrd.nextLine();
                try{
                    System.out.println("How many Mouses has "+name+" caught?");
                    mouses = Integer.parseInt(keybrd.nextLine());
                    crit.add(new Cat(mouses, name));
                }
                catch(Exception e){
                    System.out.println("You did not enter an integer. "+e.getMessage());
                }
                
            }
            else if(type.equalsIgnoreCase("dog")){
                System.out.println("What is the dog's name?");
                name = keybrd.nextLine();
                System.out.println("Is "+name+" a friendly dog? enter true or false.");
                type = keybrd.nextLine();
                try{
                    if(type.equalsIgnoreCase("true")){
                        friendly = true;
                        crit.add(new Dog(friendly, name));
                    }
                    else if(type.equalsIgnoreCase("false")){
                        friendly = false;
                        crit.add(new Dog(friendly, name));
                    }
                    else{
                        friendly = false;
                    }
                }
                catch(Exception e){
                    System.out.println("You did not enter true or false. "+e.getMessage());
                }
            }
            else if(type.equalsIgnoreCase("student")){
                System.out.println("What is the student's name?");
                name = keybrd.nextLine();
                try{
                    System.out.println("How many years old is "+name+"?");
                    age = Integer.parseInt(keybrd.nextLine());
                    crit.add(new Student(age, name));
                }
                catch(Exception e){
                    System.out.println("You did not enter an integer for age. "+e.getMessage());
                }
                
            }
        }
    }
    
    /*
    public void fillZOO(){
        crit.add(new Dog(true, "Pete"));
        crit.add(new Cat(9, "Anne Belly"));
        crit.add(new Student(19, "Joe John Johnson"));
        //return crit;
    }
    
    }
            catch(Exception e){
                System.out.println("the generic exception " + e.getMessage());
            }
    */
}
