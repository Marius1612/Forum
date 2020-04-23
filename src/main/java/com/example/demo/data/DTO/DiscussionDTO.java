package com.example.demo.data.DTO;

import com.example.demo.data.DAO.Discussion;
import com.example.demo.data.DAO.User;
import lombok.Getter;

@Getter
public class DiscussionDTO {
    private Integer discussion_id;
    private User user;
    private String topic;

    public DiscussionDTO(Discussion d){
        this.discussion_id = d.getDiscussion_id();
        this.user = d.getUser();
        this.topic = d.getTopic();
    }
}
