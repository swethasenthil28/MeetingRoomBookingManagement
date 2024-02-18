package org.ford.meetingroombookingsystem.admin;

public interface AdminService{

    Admin createNewAdmin(Admin admin);

    Admin login(String email, String password);
}

