package org.ford.meetingroombookingsystem.admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Admin findByEmailAndPassword(String email, String password);

}