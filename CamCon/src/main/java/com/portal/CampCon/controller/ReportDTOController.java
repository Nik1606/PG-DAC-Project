package com.portal.CampCon.controller;

import com.portal.CampCon.model.DiscussionPost;
import com.portal.CampCon.model.ReportDTO;
import com.portal.CampCon.repository.DiscussionPostRepository;
import com.portal.CampCon.service.ReportDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/report")
public class ReportDTOController {

    @Autowired
    private ReportDTOService reportDTOService;

    @Autowired
    private DiscussionPostRepository discussionPostRepository;


    public String reportPost(@RequestBody ReportDTO reportDTO){
        Optional<DiscussionPost> discussionPost = discussionPostRepository.findById(reportDTO.getId());
        if(!discussionPost.isPresent()){
            return "No Such comment exists";
        }
        reportDTOService.reportPost(reportDTO);
        return "Post is under scrutiny of admin";
    }
}
