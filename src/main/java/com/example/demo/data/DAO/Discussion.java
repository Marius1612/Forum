package com.example.demo.data.DAO;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "discussion")
@NoArgsConstructor
public class Discussion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer discussion_id;

    @ManyToOne
    @JoinColumn
    private User user;

    private String topic;

    @Builder
    public Discussion(User user, String topic) {
        this.user = user;
        this.topic = topic;
    }
}
