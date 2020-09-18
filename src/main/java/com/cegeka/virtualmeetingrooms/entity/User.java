package com.cegeka.virtualmeetingrooms.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "meeting_room_id")
    private MeetingRoom meetingRoom;

    private User() {
    }

    public User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.meetingRoom = builder.meetingRoom;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public static final class UserBuilder {
        private UUID id;
        private String name;
        private MeetingRoom meetingRoom;

        private UserBuilder() {
        }

        public static UserBuilder aUser() {
            return new UserBuilder();
        }

        public UserBuilder withId(UUID id) {
            this.id = id;
            return this;
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withMeetingRoom(MeetingRoom meetingRoom) {
            this.meetingRoom = meetingRoom;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
