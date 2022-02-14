package com.aroundThirty.model;

import javax.swing.*;

public class ReportCardDto {
    private int no;
    private String title;
    private ImageIcon defaultImg;
    private int btnNum;


    public ReportCardDto(int btnNum) {
        this.btnNum = btnNum;
    }

    public ReportCardDto(ImageIcon defaultImg, int no) {
        this.defaultImg = defaultImg;
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public ImageIcon getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(ImageIcon defaultImg) {
        this.defaultImg = defaultImg;
    }

    public int getBtnNum() {
        return btnNum;
    }

    public void setBtnNum(int btnNum) {
        this.btnNum = btnNum;
    }

    @Override
    public String toString() {
        return no + title + defaultImg;
    }
}
