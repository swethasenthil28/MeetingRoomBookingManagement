package org.ford.meetingroombookingsystem.admin;

import org.ford.meetingroombookingsystem.bookingUser.BookingUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImplementation implements AdminService{


    @Autowired
    private  AdminRepository adminRepository;
    @Autowired
    private  UserRepository userRepository;

    @Override
    public Admin createNewAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin login(String email, String password) throws AdminException{
        Admin foundAdmin = adminRepository.findByEmailAndPassword(email, password);
        if(foundAdmin == null){
            throw new AdminException("No user Found");
        }
        return foundAdmin;
    }

    @Override
    public BookingUser addNewUser(BookingUser bookingUser) {
        return userRepository.save(bookingUser);
    }
}
