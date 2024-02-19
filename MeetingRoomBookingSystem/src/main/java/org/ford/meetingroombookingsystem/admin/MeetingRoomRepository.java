package org.ford.meetingroombookingsystem.admin;

import org.ford.meetingroombookingsystem.meetingRoom.MeetingRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRoomRepository extends JpaRepository<MeetingRoom,Integer > {
}
