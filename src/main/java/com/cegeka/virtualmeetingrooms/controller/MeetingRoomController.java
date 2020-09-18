package com.cegeka.virtualmeetingrooms.controller;

import com.cegeka.virtualmeetingrooms.entity.MeetingRoom;
import com.cegeka.virtualmeetingrooms.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
public class MeetingRoomController {

    @Autowired
    private MeetingRoomService meetingRoomService;

    @GetMapping("/meetingrooms")
    public ResponseEntity<List<MeetingRoom>> getAllMeetingRooms() {
//        return ok(newArrayList("Wietse", "Mike"));

         return ok(meetingRoomService.getAllMeetingRooms());
    }
}
