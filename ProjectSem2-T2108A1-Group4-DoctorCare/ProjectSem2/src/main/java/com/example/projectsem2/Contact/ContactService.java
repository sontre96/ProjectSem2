package com.example.projectsem2.Contact;

import java.util.List;

public interface ContactService {
    List<TblContact> getAllContact();

    void saveContact(TblContact contact);

    TblContact saveContactInfo(TblContact contact);

    void deleteContact(Long id);

    TblContact getContactById(Long id);

    public TblContact getOne(Long id);
}
