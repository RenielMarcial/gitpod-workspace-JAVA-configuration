package com.JavaConfiguration.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.JavaConfiguration.contact.domain.Contact;
 
 
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    
}
