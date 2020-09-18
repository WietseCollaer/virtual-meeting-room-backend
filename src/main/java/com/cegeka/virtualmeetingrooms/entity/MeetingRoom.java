package com.cegeka.virtualmeetingrooms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "meeting_rooms")
public class MeetingRoom {
    @Id
    private UUID id;

    @Column(name = "meeting_room_name")
    private String name;

    @Column(name = "meeting_room_url")
    private String url;

    private MeetingRoom() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
