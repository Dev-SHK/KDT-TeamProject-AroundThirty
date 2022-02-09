package com.aroundThirty.Controller;

import com.aroundThirty.model.ReportCardDto;
import com.aroundThirty.model.ReportDao;
import com.aroundThirty.model.ReportDto;

import javax.swing.*;

import java.awt.*;

import static com.aroundThirty.Resource.BR.*;
import static com.aroundThirty.Resource.FR.*;


public class ReportController {
    String defaultImgPath = "src/com/aroundThirty/imgFiles/그림1.png";
    ImageIcon defaultImg = new ImageIcon(defaultImgPath);


    public ReportController() {
        reportListAll = ReportDao.reportSelectAll();
        for(ReportDto Dto : reportListAll) {
            reportDto = Dto;
        }
        for(int i=0; i<reportListAll.size(); i++) {
            if (reportListAll.get(i).thumbnail_Img == null){
                ReportCardDto reportCardDto = new ReportCardDto(defaultImg);
                reportCardDtoList.add(reportCardDto);
            }else{
                ReportCardDto reportCardDto = new ReportCardDto(defaultImg);
                reportCardDtoList.add(reportCardDto);
            }
        }
    }
}
