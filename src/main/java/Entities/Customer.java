package Entities;
import jakarta.persistence.*;
import javax.annotation.processing.Generated;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer CustomerID;
    @Column(nullable = false, unique = true, length = 25)
    private String firstName;
    @Column(nullable = false, unique = true, length = 25)
    private String lastName;
    @Column(nullable = false, length = 25)
    private String address;
    @Column(nullable = false, unique = true, length = 50)
    private String email;
    @Column(nullable = false, length = 25)
    private String userPassword;

    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer customerID) {
        CustomerID = customerID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}