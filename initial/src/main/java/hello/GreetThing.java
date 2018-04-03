/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 
/**
 *
 * @author dr
 */
@Entity  // maps to table GreetThing by default
class GreetThing {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String name;
    private String firstName;
    
    //private static int idCounter = 0;

    protected GreetThing() {}
    
    GreetThing(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
        //this.id = idCounter++;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }
    
    public String toString () {
        return name;
    }
    
}
