package com.portal.CampCon.service;

import com.portal.CampCon.model.NoticeBoard;

import java.util.List;

public interface NoticeBoardService {

    public NoticeBoard saveNotice(NoticeBoard noticeBoard);

    public List<NoticeBoard> getAllNotices();
}
