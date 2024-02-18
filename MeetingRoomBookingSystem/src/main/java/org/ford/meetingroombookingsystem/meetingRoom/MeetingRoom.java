package org.ford.meetingroombookingsystem.meetingRoom;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.ford.meetingroombookingsystem.booking.Booking;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MeetingRoom {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer capacity;
    private Integer floorNumber;
    private String type;//enumerated datatype
    private Boolean isAvailabile;
    private String eventDescription;

    //@JsonIgnore
    @OneToMany
    private List<Booking> bookings=new ArrayList<>();

    public MeetingRoom() {
    }


    public MeetingRoom(Integer id, String name, Integer capacity, Integer floorNumber, String type, Boolean isAvailabile, String eventDescription, List<Booking> bookings) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.floorNumber = floorNumber;
        this.type = type;
        this.isAvailabile = isAvailabile;
        this.eventDescription = eventDescription;
        this.bookings = bookings;
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAvailabile() {
        return isAvailabile;
    }

    public void setAvailabile(Boolean availabile) {
        isAvailabile = availabile;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
