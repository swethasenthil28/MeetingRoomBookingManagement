package org.ford.meetingroombookingsystem.bookingUser;

import org.ford.meetingroombookingsystem.payment.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
