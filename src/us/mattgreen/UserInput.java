/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;

import java.util.ArrayList;

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
        crit.add(new Dog(true, "Pete"));
        crit.add(new Cat(9, "Anne Belly"));
        crit.add(new Student(19, "Joe John Johnson"));
        //return crit;
    }
}
