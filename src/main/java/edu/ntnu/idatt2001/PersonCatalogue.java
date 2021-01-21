package edu.ntnu.idatt2001;

import java.util.ArrayList;

public class PersonCatalogue {
    private ArrayList<Person> register;


    public PersonCatalogue (){
        this.register = new ArrayList();
    }
    public void changeDegree(String name, String newDegree){
        for (Person p: register){
            if(p.getName() == name){
                p.setDegree(newDegree);
            }
        }
    }
}
