package com.example.projectsem2.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<TblContact, Long> {
    public List<TblContact> findAllByOrderByIdAsc();
}
