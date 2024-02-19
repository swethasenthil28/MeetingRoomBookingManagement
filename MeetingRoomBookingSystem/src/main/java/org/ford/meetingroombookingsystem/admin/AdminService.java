package org.ford.meetingroombookingsystem.admin;

import org.ford.meetingroombookingsystem.admin.exception.AdminException;
import org.ford.meetingroombookingsystem.bookingUser.BookingUser;
import org.ford.meetingroombookingsystem.meetingRoom.MeetingRoom;

public interface AdminService{

    Admin createNewAdmin(Admin admin);

    Admin login(String email, String password) throws AdminException;

    BookingUser addNewUser(BookingUser bookingUser);

    MeetingRoom createNewMeetingRoom(MeetingRoom meetingRoom);
}

