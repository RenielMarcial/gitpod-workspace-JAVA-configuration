package com.JavaConfiguration.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JavaConfiguration.contact.domain.Contact;
import com.JavaConfiguration.contact.repository.ContactRepository;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repo;
    public List<Contact> listAll() {
        return repo.findAll();
    }
    
    public void save(Contact std) {
        repo.save(std);
    }
    
    public Contact get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
}
