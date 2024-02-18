package org.ford.meetingroombookingsystem.admin;

import org.ford.meetingroombookingsystem.bookingUser.BookingUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<BookingUser, Integer> {

}
