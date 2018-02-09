package com.naver.homefood2.vo;

public class Board {
	private int boardSeq;
	private String sellerId;
	private String title;
	private String content;
//	private Date registeDate;
//	private Date updateDate;
//	private Date endDate;
//	private String imagePath;
//	private String location;
//	private char deleteStatus;
//	private Date deleteDate;
    public int getBoardSeq() {
        return boardSeq;
    }
    public void setBoardSeq(int boardSeq) {
        this.boardSeq = boardSeq;
    }
    public String getSellerId() {
        return sellerId;
    }
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }



}
