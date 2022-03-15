package com.JavaConfiguration.contact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String contactname;
    private String course;
    private int fee;
    public Contact() {
    
    }
    public Contact(Long id, String contactname, String course, int fee) {
    this.id = id;
    this.contactname = contactname;
    this.course = course;
    this.fee = fee;
    }
    public Long getId() {
    return id;
    }
    public void setId(Long id) {
    this.id = id;
    }
    public String getContactname() {
    return contactname;
    }
    public void setContactname(String contactname) {
    this.contactname = contactname;
    }
    public String getCourse() {
    return course;
    }
    public void setCourse(String course) {
    this.course = course;
    }
    public int getFee() {
    return fee;
    }
    public void setFee(int fee) {
    this.fee = fee;
    }
}
