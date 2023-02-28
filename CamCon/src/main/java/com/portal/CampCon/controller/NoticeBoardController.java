package com.portal.CampCon.controller;

import com.portal.CampCon.model.NoticeBoard;
import com.portal.CampCon.service.NoticeBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/noticeBoard")
public class NoticeBoardController {

    @Autowired
    private NoticeBoardService noticeBoardService;


    @PostMapping("/addNotice")
    public String addNotice(@RequestBody NoticeBoard noticeBoard) throws IOException {
        noticeBoardService.saveNotice(noticeBoard);
        return "new Notice is added";
    }
    
    @GetMapping("/getAll")
    public List<NoticeBoard> getAllNotices(){
        return noticeBoardService.getAllNotices();
    }
}
