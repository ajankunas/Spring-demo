package lt.techin.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "People")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;


    //public void setFirstName(String firstName) {
       // this.firstName = firstName;

    //public void setLastName(String lastName) {
        //this.lastName = lastName;
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    }



