package com.aroundThirty.model;

public class TemporaryDto { // DataTable(엑셀)의 필드값 생성자
    public String tmp_Date = null;  // 임시 보호 시작 일자
    public String tmp_Place = null; // 임시 보호 장소
    public String kind_Tmp = null;  // 품종
    public String phone_Num = null; // 전화 번호
    public String detail = null;    // 게시글 본문
    public String post_Create_Datetime = null;  // 게시글 생성 일자.
    public String thumbnail_Img = null; // 이미지
    public String post_Modify_Datetime = null;  // 게시글 수정 일자.
    public String user_ID = null;   // 게시글 작성자 아이디
    public int no = 0; // Primary Key

    // show, 게시물 생성 후 보여지는 값들
    public TemporaryDto(String tmp_Date, String tmp_Place, String kind_Tmp, String phone_Num, String detail, String post_Create_Datetime, String thumbnail_Img, String post_Modify_Datetime, String user_ID, int no) {
        this.tmp_Date = tmp_Date;
        this.tmp_Place = tmp_Place;
        this.kind_Tmp = kind_Tmp;
        this.phone_Num = phone_Num;
        this.detail = detail;
        this.post_Create_Datetime = post_Create_Datetime;
        this.thumbnail_Img = thumbnail_Img;
        this.post_Modify_Datetime = post_Modify_Datetime;
        this.user_ID = user_ID;
        this.no = no;
    }

    // input, 게시물 생성 시 입력해야할 값들
    public TemporaryDto(String tmp_Date, String tmp_Place, String kind_Tmp, String phone_Num, String detail, String post_Create_Datetime, String thumbnail_Img, String user_ID) {
        this.tmp_Date = tmp_Date;
        this.tmp_Place = tmp_Place;
        this.kind_Tmp = kind_Tmp;
        this.phone_Num = phone_Num;
        this.detail = detail;
        this.post_Create_Datetime = post_Create_Datetime;
        this.thumbnail_Img = thumbnail_Img;
        this.user_ID = user_ID;
    }

    // Modify, 게시물 수정 시 변경할 수 있는 값들
    public TemporaryDto(String tmp_Date, String tmp_Place, String kind_Tmp, String phone_Num, String detail, String thumbnail_Img, String post_Modify_Datetime, int no) {
        this.tmp_Date = tmp_Date;
        this.tmp_Place = tmp_Place;
        this.kind_Tmp = kind_Tmp;
        this.phone_Num = phone_Num;
        this.detail = detail;
        this.thumbnail_Img = thumbnail_Img;
        this.post_Modify_Datetime = post_Modify_Datetime;
        this.no = no;
    }

    public TemporaryDto(int no) {
        this.no = no;
    }

    public String getTmp_Date() {
        return tmp_Date;
    }

    public void setTmp_Date(String tmp_Date) {
        this.tmp_Date = tmp_Date;
    }

    public String getTmp_Place() {
        return tmp_Place;
    }

    public void setTmp_Place(String tmp_Place) {
        this.tmp_Place = tmp_Place;
    }

    public String getKind_Tmp() {
        return kind_Tmp;
    }

    public void setKind_Tmp(String kind_Tmp) {
        this.kind_Tmp = kind_Tmp;
    }

    public String getPhone_Num() {
        return phone_Num;
    }

    public void setPhone_Num(String phone_Num) {
        this.phone_Num = phone_Num;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPost_Create_Datetime() {
        return post_Create_Datetime;
    }

    public void setPost_Create_Datetime(String post_Create_Datetime) {
        this.post_Create_Datetime = post_Create_Datetime;
    }

    public String getThumbnail_Img() {
        return thumbnail_Img;
    }

    public void setThumbnail_Img(String thumbnail_Img) {
        this.thumbnail_Img = thumbnail_Img;
    }

    public String getPost_Modify_Datetime() {
        return post_Modify_Datetime;
    }

    public void setPost_Modify_Datetime(String post_Modify_Datetime) {
        this.post_Modify_Datetime = post_Modify_Datetime;
    }

    public String getUserID() {
        return user_ID;
    }

    public void setUserID(String userID) {
        userID = userID;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String toString() {
        return no + " " + user_ID + " " + tmp_Date + " " + tmp_Place + " " + kind_Tmp + " " + phone_Num + " " + detail + " " + post_Create_Datetime + " " + thumbnail_Img + " " + post_Modify_Datetime;
    }

}