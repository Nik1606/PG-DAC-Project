package com.portal.CampCon.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DiscussionPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;

    private String postContent;

    @ManyToOne
    @JoinColumn(name = "topicId")
    private DiscussionTopic discussionTopic;

    @ManyToOne
    @JoinColumn(name = "id")
    private Student student;

}
