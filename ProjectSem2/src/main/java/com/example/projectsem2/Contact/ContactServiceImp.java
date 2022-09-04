package com.example.projectsem2.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImp implements ContactService{
    @Autowired
    ContactRepository contactRepository;

    @Override
    public List<TblContact> getAllContact() {
        return contactRepository.findAllByOrderByIdAsc();
    }

    @Override
    public void saveContact(TblContact contact) {
        contactRepository.save(contact);
    }

    @Override
    public TblContact saveContactInfo(TblContact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

    @Override
    public TblContact getContactById(Long id) {
        Optional<TblContact> optionalContact = contactRepository.findById(id);
        TblContact contact = null;
        if (optionalContact.isPresent()) {
            contact = optionalContact.get();
        }else {
            throw new RuntimeException("Contact not found for id : "+id);
        }
        return contact;
    }

    @Override
    public TblContact getOne(Long id) {
        return contactRepository.findById(id).get();
    }
}
