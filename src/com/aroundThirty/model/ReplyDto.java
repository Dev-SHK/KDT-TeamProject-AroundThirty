package com.aroundThirty.model;

public class ReplyDto {
    public String replyCreateDt = null; // 게시글 작성 날짜 및 시간
    public String replyModifyDt = null; // 게시글 수정 날짜 및 시간
    public String detail = null; // 게시글 수정 날짜 및 시간
    public String userId = null; // 계정 정보
    public int no = 0; // Primary Key
    public int postNo = 1;

    // postNo로 게시물에 맞는 댓글을 골라서 가져 오기 위해 postNo가 들어간다.
    public ReplyDto(String replyCreateDt, String replyModifyDt, String detail, String userId, int no, int postNo) {
        this.replyCreateDt = replyCreateDt;
        this.replyModifyDt = replyModifyDt;
        this.detail = detail;
        this.userId = userId;
        this.no = no;
        this.postNo = postNo;
    }

    public ReplyDto(String detail, String replyModifyDt, int no) {
        this.detail = detail;
        this.replyModifyDt = replyModifyDt;
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getPostNo() {
        return postNo;
    }

    public void setPostNo(int postNo) {
        this.postNo = postNo;
    }

    public String getReplyCreateDt() {
        return replyCreateDt;
    }

    public void setReplyCreateDt(String replyCreateDt) {
        this.replyCreateDt = replyCreateDt;
    }

    public String getReplyModifyDt() {
        return replyModifyDt;
    }

    public void setReplyModifyDt(String replyModifyDt) {
        this.replyModifyDt = replyModifyDt;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
