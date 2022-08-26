package com.example.projectsem2.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<TblAdmin, Long> {
    List<TblAdmin> findAllByOrderByIdAsc();

    Optional<TblAdmin> findByUsername(String username);

    Boolean existsByUsername(String username);
}
