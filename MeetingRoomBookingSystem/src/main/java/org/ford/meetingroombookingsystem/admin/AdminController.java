package org.ford.meetingroombookingsystem.admin;


import org.ford.meetingroombookingsystem.bookingUser.BookingUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;
//    @Autowired
//    BookingUser bookingUser;
//

    @PostMapping("AdminAccount")
    public Admin createNewAdmin(@RequestBody Admin admin){
        return adminService.createNewAdmin(admin);
    }
    @GetMapping("login/{email}/{password}")
    public Admin adminLogin(@PathVariable("email") String email, @PathVariable("password") String password) throws AdminException{
        return adminService.login(email, password);
    }
    @PostMapping("newUser")
    public BookingUser createNewUser(@RequestBody BookingUser bookingUser){
        return adminService.addNewUser(bookingUser);

    }





}
