package com.cegeka.virtualmeetingrooms.controller;

import com.cegeka.virtualmeetingrooms.entity.User;
import com.cegeka.virtualmeetingrooms.service.UserService;
import com.cegeka.virtualmeetingrooms.transferObject.MoveUserTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MeetingRoomWebSocketController {

    @Autowired
    private UserService userService;

    @MessageMapping("/moveUser")
    @SendTo("/meetingroom/overview")
    public List<User> moveUserToMeetingRoom(MoveUserTO moveUserTO) {
        userService.moveUserToAnotherRoom(moveUserTO.getUser(), moveUserTO.getNewMeetingRoomId());
        return userService.findAllUsers();
    }
}
