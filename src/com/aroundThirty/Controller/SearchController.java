package com.aroundThirty.Controller;

import com.aroundThirty.model.XmlCardDto;
import com.aroundThirty.model.XmlDao;
import com.aroundThirty.model.XmlDto;

import javax.swing.*;

import static com.aroundThirty.Resource.BR.*;
import static com.aroundThirty.Resource.FR.*;
import static com.aroundThirty.Resource.SearchData.totalArr;


public class SearchController {

    public SearchController() {
        xmlDtoListAll = XmlDao.xmlSelectAll();
        for (XmlDto Dto : xmlDtoListAll) {
            xmlDto = Dto;
        }

        for (int i = 0; i < totalArr.size(); i++) {
            ImageIcon img = new ImageIcon(totalArr.get(i).thumbnail_Img);
            if (totalArr.get(i).thumbnail_Img == null) {
                xmlCardDto = new XmlCardDto(defaultImg, i);
                xmlCardDtoList.add(xmlCardDto);
            } else {
                xmlCardDto = new XmlCardDto(img, i);
                xmlCardDtoList.add(xmlCardDto);
            }
        }
    }
}
