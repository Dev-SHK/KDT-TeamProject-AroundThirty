package com.aroundThirty.Controller;

import com.aroundThirty.Resource.FR;
import com.aroundThirty.model.ReportCardDto;
import com.aroundThirty.model.ReportDao;
import com.aroundThirty.model.ReportDto;
import com.aroundThirty.Resource.BR;


public class ReportController {
    public ReportController() {
        BR.reportListAll = ReportDao.reportSelectAll();
        for(ReportDto reportDto : BR.reportListAll) {
            BR.reportDto = reportDto;
        }

        for(int i=0; i<120; i++) {
            ReportCardDto reportCardDto = new ReportCardDto(i, "image" + i, String.format(BR.reportDto.thumbnail_Img, i));
            FR.reportCardDtoList.add(reportCardDto);
        }
    }



}
