package com.cegeka.virtualmeetingrooms.repository;

import com.cegeka.virtualmeetingrooms.entity.MeetingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, UUID> {
}
