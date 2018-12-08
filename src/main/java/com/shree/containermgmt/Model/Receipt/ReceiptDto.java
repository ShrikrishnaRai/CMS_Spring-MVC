/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Model.Receipt;

/**
 *
 * @author cri_r
 */
public class ReceiptDto {

    private int id;
    private String receiverEmail;
    private String receiverPhone;
    private String receiverFirstname;
    private String receiverLastname;
    private String receiverCity;
    private String receiverCountry;
    private String receiverState;
    private String goods;

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getReceiverFirstname() {
        return receiverFirstname;
    }

    public void setReceiverFirstname(String receiverFirstname) {
        this.receiverFirstname = receiverFirstname;
    }

    public String getReceiverLastname() {
        return receiverLastname;
    }

    public void setReceiverLastname(String receiverLastname) {
        this.receiverLastname = receiverLastname;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

}
