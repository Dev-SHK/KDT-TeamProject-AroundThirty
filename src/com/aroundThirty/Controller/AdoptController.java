package com.aroundThirty.Controller;

import com.aroundThirty.Resource.BR;
import com.aroundThirty.Resource.FR;
import com.aroundThirty.model.*;


public class AdoptController {
    public AdoptController() {
        BR.adoptDtoListAll = AdoptDao.adoptSelectAll();
        for (AdoptDto adoptDto : BR.adoptDtoListAll) {
            BR.adoptDto = adoptDto;
        }
        System.out.println(BR.adoptDto.thumbnail_Img);
        for (int i = 0; i < 17; i++) {
            AdoptCardDto adoptCardDto = new AdoptCardDto(i, "image" + i, String.format(BR.adoptDto.thumbnail_Img, i));
            FR.adoptCardDtoList.add(adoptCardDto);
        }
    }
}