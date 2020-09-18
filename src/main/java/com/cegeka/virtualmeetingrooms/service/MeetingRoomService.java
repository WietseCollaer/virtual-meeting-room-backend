package com.cegeka.virtualmeetingrooms.service;

import com.cegeka.virtualmeetingrooms.entity.MeetingRoom;
import com.cegeka.virtualmeetingrooms.repository.MeetingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MeetingRoomService {

    public static final String DEFAULT_MEETING_ROOM_NAME = "Hallway";
    private final MeetingRoomRepository repository;

    public MeetingRoomService(MeetingRoomRepository repository) {
        this.repository = repository;
    }

    public List<MeetingRoom> getAllMeetingRooms() {
        return repository.findAll();
    }

    public MeetingRoom findByMeetingRoomId(UUID meetingRoomId) {
        return repository.findById(meetingRoomId).orElseThrow();
    }

    public MeetingRoom findByMeetingRoomName() {
        return repository.findByName(DEFAULT_MEETING_ROOM_NAME);
    }
}
