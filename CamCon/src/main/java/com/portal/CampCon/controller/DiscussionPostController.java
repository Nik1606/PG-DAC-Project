package com.portal.CampCon.controller;

import com.portal.CampCon.model.DiscussionPost;
import com.portal.CampCon.service.DiscussionPostService;
import com.portal.CampCon.service.DiscussionTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class DiscussionPostController {

    @Autowired
    private DiscussionPostService discussionPostService;

    @Autowired
    private DiscussionTopicService discussionTopicService;


    @PostMapping("/addPost")
    public DiscussionPost addPost(@RequestBody DiscussionPost discussionPost){
        return discussionPostService.addPost(discussionPost);
    }

    @GetMapping("/getAll")
    public List<DiscussionPost> getAll(){
        return discussionPostService.getAllPosts();
    }

    @PostMapping("/findPost")
    public Optional<DiscussionPost> findPost(@RequestBody int postId){
        return discussionPostService.findPost(postId);
    }

    // Student who posted post/comment; only that person and admin should have authority to delete the post
    @PostMapping("/deletePost")
    public String deletePost(@RequestBody int postId){
        discussionPostService.deletePost(postId);
        return "Post deleted successfully";
    }


    @PostMapping("/getSimilarPosts")
    public List<DiscussionPost> getSimilarPosts(@RequestBody String keyword){
        return discussionPostService.getSimilarPosts(keyword);
    }
}
