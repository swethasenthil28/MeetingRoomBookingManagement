package org.ford.meetingroombookingsystem.booking;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.ford.meetingroombookingsystem.meetingRoom.MeetingRoom;

import java.time.LocalDate;
@Entity
public class Booking {
    @Id
    private Integer id;
    private LocalDate startTime;
    private LocalDate endTime;
    private Boolean status;

    @ManyToOne
    private MeetingRoom meetingRoom;

    public Booking() {
    }

    public Booking(Integer id, LocalDate startTime, LocalDate endTime, Boolean status) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }
    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
