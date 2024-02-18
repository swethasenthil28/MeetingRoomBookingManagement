package org.ford.meetingroombookingsystem.admin;

import org.ford.meetingroombookingsystem.bookingUser.BookingUser;

public interface AdminService{

    Admin createNewAdmin(Admin admin);

    Admin login(String email, String password) throws AdminException;

    BookingUser addNewUser(BookingUser bookingUser);
}

