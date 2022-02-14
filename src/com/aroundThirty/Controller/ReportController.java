package com.aroundThirty.Controller;

import com.aroundThirty.model.ReportCardDto;
import com.aroundThirty.model.ReportDao;
import com.aroundThirty.model.ReportDto;

import javax.swing.*;


import static com.aroundThirty.Resource.BR.*;
import static com.aroundThirty.Resource.FR.*;


public class ReportController {
    String defaultImgPath = "src/com/aroundThirty/imgFiles/그림1.png";
    ImageIcon defaultImg = new ImageIcon(defaultImgPath);


    public ReportController() {
        showAll();

    }

    public void showAll(){
        reportListAll = ReportDao.reportSelectAll();
        for (ReportDto Dto : reportListAll) {
            reportDto = Dto;
        }
        for (int i = 0; i < reportListAll.size(); i++) {
            ImageIcon img = new ImageIcon(reportListAll.get(i).thumbnail_Img);
            if (reportListAll.get(i).thumbnail_Img.equals("(NULL)")) {
                reportCardDto = new ReportCardDto(defaultImg, i);
                reportCardDtoList.add(reportCardDto);
            } else {
                reportCardDto = new ReportCardDto(img, i);
                reportCardDtoList.add(reportCardDto);
            }
        }
    }

//    public ReportDto createPost(){
//
//
//
//
//        return;
//    }

}
