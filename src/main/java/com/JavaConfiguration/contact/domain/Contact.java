package com.JavaConfiguration.contact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long contactId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int salary;
    private String address;
    public Contact() {
    
    }
    public Contact(Long contactId, String firstName, String lastName, String email, int age, int salary, String address) {
    this.contactId = contactId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.age = age;
    this.salary = salary;
    this.address = address;
    }
    public Long getContactId() {
    return contactId;
    }
    public void setContactId(Long contactId) {
    this.contactId = contactId;
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
    public String getEmail() {
    return email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    public int getAge() {
    return age;
    }
    public void setAge(int age) {
    this.age = age;
    }
    public int getSalary() {
    return salary;
    }
    public void setSalary(int salary) {
    this.salary = salary;
    }
    public String getAddress() {
    return address;
    }
    public void setAddress(String address) {
    this.address = address;
    }
}
