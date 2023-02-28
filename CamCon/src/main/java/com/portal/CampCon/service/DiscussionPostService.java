package com.portal.CampCon.service;

import com.portal.CampCon.model.DiscussionPost;

import java.util.List;
import java.util.Optional;

public interface DiscussionPostService {

    public DiscussionPost addPost(DiscussionPost discussionPost);

    public List<DiscussionPost> getAllPosts();

    public Optional<DiscussionPost> findPost(int postId);

    public void deletePost(int postId);

    public List<DiscussionPost> getSimilarPosts(String keyword);
}
