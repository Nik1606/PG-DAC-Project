package com.portal.CampCon.service;

import com.portal.CampCon.model.ReportDTO;
import com.portal.CampCon.repository.ReportDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportDTOServiceImpl implements ReportDTOService {

    @Autowired
    private ReportDTORepository reportDTORepository;

    @Override
    public ReportDTO reportPost(ReportDTO reportDTO) {
        return reportDTORepository.save(reportDTO);
    }
}
