package com.portal.CampCon.service;

import com.portal.CampCon.model.DiscussionTopic;

import java.util.List;
import java.util.Optional;

public interface DiscussionTopicService {

    public DiscussionTopic createNewTopic(DiscussionTopic discussionTopic);

    public List<DiscussionTopic> getAllTopics();

    public Optional<DiscussionTopic> findTopicById(int topicId);

    public DiscussionTopic modifyTopic(DiscussionTopic discussionTopic);

    public void deleteTopicById(int id);
}
