package com.aroundThirty.model;

public class AdoptCardDto {
    private int no;
    private String title;
    private String image;

    public AdoptCardDto() {
        this(0, "", "");
    }

    public AdoptCardDto(int no, String title, String image) {
        this.no = no;
        this.title = title;
        this.image = image;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return no + title + image;
    }
}