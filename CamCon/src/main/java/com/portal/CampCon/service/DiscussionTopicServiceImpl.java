package com.portal.CampCon.service;

import com.portal.CampCon.model.DiscussionTopic;
import com.portal.CampCon.repository.DiscussionTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class DiscussionTopicServiceImpl implements DiscussionTopicService{

    Scanner sc= new Scanner(System.in);
    @Autowired
    private DiscussionTopicRepository  discussionTopicRepository;

    @Override
    public DiscussionTopic createNewTopic(DiscussionTopic discussionTopic) {
        return discussionTopicRepository.save(discussionTopic);
    }

    @Override
    public List<DiscussionTopic> getAllTopics() {
        return discussionTopicRepository.findAll();
    }

    //Need to look at Return type
    @Override
    public Optional<DiscussionTopic> findTopicById(int topicId) {
        return discussionTopicRepository.findById(topicId);
    }

    @Override
    public DiscussionTopic modifyTopic(DiscussionTopic discussionTopic) {
        System.out.println("Enter modified topic name");
        String temp = sc.next();
        discussionTopic.setTopic(temp);
        return null;
    }

    // Only admin can delete Topic
    @Override
    public void deleteTopicById(int id)
    {
        discussionTopicRepository.deleteById(id);
    }

}
