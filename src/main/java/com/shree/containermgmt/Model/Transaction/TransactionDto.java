package com.shree.containermgmt.Model.Transaction;

public class TransactionDto {
	
	public TransactionDto() {
		
	}
	
	public TransactionDto(String receiverFirstName, String receiverLastName, String receiverEmail, String receiverPhone,
			String senderFirstName, String senderLastName, String senderEmail, String senderPhone, String goods,
			String receiverCity, String receiverState, String receiverCountry) {
		super();
		this.receiverFirstName = receiverFirstName;
		this.receiverLastName = receiverLastName;
		this.receiverEmail = receiverEmail;
		this.receiverPhone = receiverPhone;
		this.senderFirstName = senderFirstName;
		this.senderLastName = senderLastName;
		this.senderEmail = senderEmail;
		this.senderPhone = senderPhone;
		this.goods = goods;
		this.receiverCity = receiverCity;
		this.receiverState = receiverState;
		this.receiverCountry = receiverCountry;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private String receiverFirstName;
	private String receiverLastName;
	private String receiverEmail;
	private String receiverPhone;
	private String senderFirstName;
	private String senderLastName;
	private String senderEmail;
	private String senderPhone;
	private String goods;
	private String receiverCity;
	private String receiverState;
	private String receiverCountry;
	public String getReceiverFirstName() {
		return receiverFirstName;
	}
	public void setReceiverFirstName(String receiverFirstName) {
		this.receiverFirstName = receiverFirstName;
	}
	public String getReceiverLastName() {
		return receiverLastName;
	}
	public void setReceiverLastName(String receiverLastName) {
		this.receiverLastName = receiverLastName;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getSenderFirstName() {
		return senderFirstName;
	}
	public void setSenderFirstName(String senderFirstName) {
		this.senderFirstName = senderFirstName;
	}
	public String getSenderLastName() {
		return senderLastName;
	}
	public void setSenderLastName(String senderLastName) {
		this.senderLastName = senderLastName;
	}
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	public String getSenderPhone() {
		return senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getReceiverCity() {
		return receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	public String getReceiverState() {
		return receiverState;
	}
	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}
	public String getReceiverCountry() {
		return receiverCountry;
	}
	public void setReceiverCountry(String receiverCountry) {
		this.receiverCountry = receiverCountry;
	}
	
}
