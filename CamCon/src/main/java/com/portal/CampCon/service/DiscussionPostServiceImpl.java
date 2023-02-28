package com.portal.CampCon.service;

import com.portal.CampCon.model.DiscussionPost;
import com.portal.CampCon.repository.DiscussionPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiscussionPostServiceImpl implements DiscussionPostService{

    @Autowired
    private DiscussionPostRepository discussionPostRepository;

    @Override
    public DiscussionPost addPost(DiscussionPost discussionPost) {
        return discussionPostRepository.save(discussionPost);
    }

    @Override
    public List<DiscussionPost> getAllPosts() {
        return discussionPostRepository.findAll();
    }

    @Override
    public Optional<DiscussionPost> findPost(int postId) {
        return discussionPostRepository.findById(postId);
    }

    @Override
    public void deletePost(int postId) {
        discussionPostRepository.deleteById(postId);
    }

    // Not Workinggg
    @Override
    public List<DiscussionPost> getSimilarPosts(String keyword) {
        String keyword2 ="%"+keyword+"%";
        return discussionPostRepository.findByPostContentLike(keyword2);
    }

}
