package com.portal.CampCon.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DiscussionTopic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topicId;

    @Column(unique = true, nullable = false, length = 50)
    private String topic;
    @Column(length = 500, nullable = false)
    private String description;

    @OneToMany
    private Set<DiscussionPost> discussionPost;

    public DiscussionTopic(String topic, String description) {
        this.topicId=topicId;
        this.topic = topic;
        this.description = description;
    }

}
