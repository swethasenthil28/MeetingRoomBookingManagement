package org.ford.meetingroombookingsystem.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("AdminAccount")
    public Admin createNewAdmin(@RequestBody Admin admin){
        return adminService.createNewAdmin(admin);
    }
    @GetMapping("login/{email}/{password}")
    public Admin adminLogin(@PathVariable("email") String email, @PathVariable("password") String password){
        return adminService.login(email, password);
    }
}
