package com.aroundThirty.Resource;

import com.aroundThirty.model.*;

import java.util.ArrayList;
import java.util.List;

import static com.aroundThirty.Resource.FR.*;

public class BR {
    public static ReportDto reportDto;
    public static List<ReportDto> reportListAll;

    public static MissingDto missingDto;
    public static List<MissingDto> missingListAll;

    public static TemporaryDto temporaryDto;
    public static List<TemporaryDto> temporaryListAll;

    public static AdoptDto adoptDto;
    public static List<AdoptDto> adoptDtoListAll;

    public static UserDto userDto;

    public static XmlDto xmlDto;
    public static List<XmlDto> xmlDtoListAll;

    public static ReportCardDto reportCardDto;
//    public static MissingCardDto missingCardDto;
    public static AdoptCardDto adoptCardDto;
//    public static TemporaryCardDto temporaryCardDto;

    public static XmlCardDto xmlCardDto;

    public static ArrayList<ReportCardDto> reportCardDtoList = new ArrayList<>();
    public static ArrayList<AdoptCardDto> adoptCardDtoList = new ArrayList<>();
//    public static ArrayList<ReportCardDto> reportCardNoList = new ArrayList<>();
    public static ArrayList<XmlCardDto> xmlCardDtoList = new ArrayList<>();


    public static int selectBtnNum;
    public static int pageNum;
    public static int postedPageNum;
    public static int listIdx;
    public static int tapPaneIdx;

}
