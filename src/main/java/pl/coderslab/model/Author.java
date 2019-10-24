package pl.coderslab.model;

import org.springframework.stereotype.Component;

@Component
public class Author {

    private String firstName;
    private String lastName;

    public Author() {

    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void introduceYourself(){
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
