package com.JavaConfiguration.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.JavaConfiguration.contact.domain.Contact;
 
 
@Repository
public class ContactRepository extends JpaRepository<Contact, Long> {
    
}
