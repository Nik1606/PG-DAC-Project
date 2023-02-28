package com.portal.CampCon.controller;

import com.portal.CampCon.model.DiscussionTopic;
import com.portal.CampCon.repository.DiscussionPostRepository;
import com.portal.CampCon.repository.DiscussionTopicRepository;
import com.portal.CampCon.service.DiscussionTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class DiscussionTopicController {

    @Autowired
    private DiscussionTopicService discussionTopicService;

    @PostMapping("/CreateNewTopic")
    public String createNewTopic(@RequestBody DiscussionTopic discussionTopic){
        discussionTopicService.createNewTopic(discussionTopic);
        return "Topic added";
    }


    @GetMapping("/getAll")
    public List<DiscussionTopic> getAllTopics(){
        return discussionTopicService.getAllTopics();
    }


    @PostMapping("/findTopicById")
    public Optional<DiscussionTopic> findTopic(int topicId){
        return discussionTopicService.findTopicById(topicId);
    }


    // If User want to modify the Topic
    @PostMapping("/modifyTopic")
    public DiscussionTopic modifyTopic(@RequestBody int topicId){
        Optional<DiscussionTopic> discussionTopic = discussionTopicService.findTopicById(topicId);
        boolean status= discussionTopic.isPresent();
        if(status){
            //discussionTopicService.modifyTopic(discussionTopic);
            // Needs To Fixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx this
        }
        return null;
    }

    // Only admin should have authority to delete the topic
    @PostMapping("/deleteTopic")
    public String deleteTopic(@RequestBody int topicId){
        discussionTopicService.deleteTopicById(topicId);
        return "Topic deleted Successfully";
    }

}
