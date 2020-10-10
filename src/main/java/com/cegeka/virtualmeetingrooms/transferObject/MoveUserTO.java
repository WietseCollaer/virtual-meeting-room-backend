package com.cegeka.virtualmeetingrooms.transferObject;

import com.cegeka.virtualmeetingrooms.entity.User;

import java.util.UUID;

public class MoveUserTO {
    private User user;
    private UUID newMeetingRoomId;

    private MoveUserTO() {
    }

    public User getUser() {
        return user;
    }

    public UUID getNewMeetingRoomId() {
        return newMeetingRoomId;
    }
}
