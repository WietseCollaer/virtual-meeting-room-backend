package com.cegeka.virtualmeetingrooms.service;

import com.cegeka.virtualmeetingrooms.entity.MeetingRoom;
import com.cegeka.virtualmeetingrooms.repository.MeetingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingRoomService {

    @Autowired
    private MeetingRoomRepository repository;

    public List<MeetingRoom> getAllMeetingRooms() {
        return repository.findAll();
    }
}
