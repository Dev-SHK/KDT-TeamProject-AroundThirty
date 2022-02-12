package com.aroundThirty.Controller;

import static com.aroundThirty.Resource.BR.*;

import com.aroundThirty.Resource.FR;
import com.aroundThirty.model.*;


public class AdoptController {
    public AdoptController() {
        adoptDtoListAll = AdoptDao.adoptSelectAll();
        for (AdoptDto Dto : adoptDtoListAll) {
            adoptDto = Dto;
        }
        for (int i = 0; i < 17; i++) {
            AdoptCardDto adoptCardDto = new AdoptCardDto(i, "image" + i, String.format(adoptDto.thumbnail_Img, i));
            FR.adoptCardDtoList.add(adoptCardDto);
        }
    }
}