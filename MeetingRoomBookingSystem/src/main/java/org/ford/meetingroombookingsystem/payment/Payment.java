package org.ford.meetingroombookingsystem.payment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import org.ford.meetingroombookingsystem.bookingUser.BookingUser;
@Entity
public class Payment {

    @Id
    private Integer paymentId;
    private Double amount;
    private String paymentType;

    @OneToOne
    private BookingUser bookingUser;

    public Integer getId() {
        return paymentId;
    }

    public void setId(Integer id) {
        this.paymentId = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BookingUser getBookingUser() {
        return bookingUser;
    }

    public void setBookingUser(BookingUser bookingUser) {
        this.bookingUser = bookingUser;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Payment(Integer paymentId, Double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public Payment() {
    }

    public Payment(Integer paymentId, Double amount, BookingUser bookingUser) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.bookingUser = bookingUser;
    }
}
