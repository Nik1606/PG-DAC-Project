package com.portal.CampCon.repository;

import com.portal.CampCon.model.DiscussionPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscussionPostRepository extends JpaRepository<DiscussionPost, Integer> {

    List<DiscussionPost> findByPostContentLike(String postContent);
}
