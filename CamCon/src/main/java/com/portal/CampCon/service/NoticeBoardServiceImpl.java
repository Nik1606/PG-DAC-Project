package com.portal.CampCon.service;

import com.portal.CampCon.model.NoticeBoard;
import com.portal.CampCon.repository.NoticeBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeBoardServiceImpl implements NoticeBoardService{

    @Autowired
    private NoticeBoardRepository noticeBoardRepository;


    @Override
    public NoticeBoard saveNotice(NoticeBoard noticeBoard) {
        return noticeBoardRepository.save(noticeBoard);
    }

    @Override
    public List<NoticeBoard> getAllNotices() {
        return noticeBoardRepository.findAll();
    }

}
