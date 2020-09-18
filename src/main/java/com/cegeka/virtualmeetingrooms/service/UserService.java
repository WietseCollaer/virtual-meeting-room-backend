package com.cegeka.virtualmeetingrooms.service;

import com.cegeka.virtualmeetingrooms.entity.MeetingRoom;
import com.cegeka.virtualmeetingrooms.entity.User;
import com.cegeka.virtualmeetingrooms.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.cegeka.virtualmeetingrooms.entity.User.UserBuilder.aUser;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final MeetingRoomService meetingRoomService;

    public UserService(UserRepository userRepository, MeetingRoomService meetingRoomService) {
        this.userRepository = userRepository;
        this.meetingRoomService = meetingRoomService;
    }

    public User createUser(String name) {
        User userToCreate = aUser()
                .withId(UUID.randomUUID())
                .withName(name)
                .withMeetingRoom(meetingRoomService.findByMeetingRoomName())
                .build();
        return userRepository.save(userToCreate);
    }

    public User moveUserToAnotherRoom(User user, UUID newRoomId) {
        MeetingRoom newMeetingRoom = meetingRoomService.findByMeetingRoomId(newRoomId);
        User userToMove = userRepository.findById(user.getId())
                .orElseThrow(() -> new IllegalArgumentException("User does not exist"));
        userToMove.setMeetingRoom(newMeetingRoom);
        return userRepository.save(userToMove);
    }
}
