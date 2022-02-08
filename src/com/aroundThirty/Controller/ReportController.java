package com.aroundThirty.Controller;

import com.aroundThirty.model.ReportDao;
import com.aroundThirty.model.ReportDto;
import com.aroundThirty.Resource.BR;


public class ReportController {

    public ReportController() {
        BR.reportListAll = ReportDao.reportSelectAll();
        for(ReportDto reportDto : BR.reportListAll) {
            BR.reportDto = reportDto;
        }
    }

//    public static void main(String[] args) {
//        new ReportController();
//    }


}
