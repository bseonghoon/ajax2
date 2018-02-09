package com.naver.homefood2.vo;

public class OrderInfo {
	private int seq;
	private String sellerId;
	private String consumerId;
	private char sellerStatus;
	private char consumerStatus;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public char getSellerStatus() {
		return sellerStatus;
	}

	public void setSellerStatus(char sellerStatus) {
		this.sellerStatus = sellerStatus;
	}

	public char getConsumerStatus() {
		return consumerStatus;
	}

	public void setConsumerStatus(char consumerStatus) {
		this.consumerStatus = consumerStatus;
	}

}
