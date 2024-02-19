package org.ford.meetingroombookingsystem.admin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.ford.meetingroombookingsystem.booking.Booking;
import org.ford.meetingroombookingsystem.bookingUser.BookingUser;
import org.ford.meetingroombookingsystem.meetingRoom.MeetingRoom;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Admin {
    @Id
    private Integer id;
    private String name;
    private String email;
    private String password;

    @OneToMany
    private List<BookingUser> users = new ArrayList<>();
    @OneToMany
    private List<MeetingRoom> meetingRooms=new ArrayList<>();
    @OneToMany
    private List<Booking> bookings=new ArrayList<>();


    public Admin() {
    }

    public Admin(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<BookingUser> getUsers() {
        return users;
    }

    public void setUsers(List<BookingUser> users) {
        this.users = users;
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
