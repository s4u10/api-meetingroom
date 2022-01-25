package com.s4u10.meetingroom.repository;

import com.s4u10.meetingroom.model.Room;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{


}