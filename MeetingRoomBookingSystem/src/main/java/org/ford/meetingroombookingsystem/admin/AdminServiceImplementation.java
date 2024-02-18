package org.ford.meetingroombookingsystem.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImplementation implements AdminService{


    @Autowired
    private  AdminRepository adminRepository;

    @Override
    public Admin createNewAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin login(String email, String password) {
        return adminRepository.findByEmailAndPassword(email, password);
    }
}
