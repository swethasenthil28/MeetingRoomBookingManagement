package org.ford.meetingroombookingsystem.bookingUser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.ford.meetingroombookingsystem.booking.Booking;
import org.ford.meetingroombookingsystem.meetingRoom.MeetingRoom;

import java.util.ArrayList;
import java.util.List;

@Entity
public class BookingUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    private String password;

    @OneToMany
    private List<Booking> bookings=new ArrayList<>();


    public BookingUser() {
    }

    public BookingUser(Integer id, String name, String email, String password) {
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
}
