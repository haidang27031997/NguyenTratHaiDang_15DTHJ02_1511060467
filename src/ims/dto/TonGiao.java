/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

/**
 *
 * @author haida
 */
public class TonGiao {

    public TonGiao(String maTonGiao, String tenTonGiao) {
        this.maTonGiao = maTonGiao;
        this.tenTonGiao = tenTonGiao;
    }
    public TonGiao() {      
    }

    public String getMaTonGiao() {
        return maTonGiao;
    }

    public void setMaTonGiao(String maTonGiao) {
        this.maTonGiao = maTonGiao;
    }

    public String getTenTonGiao() {
        return tenTonGiao;
    }

    public void setTenTonGiao(String tenTonGiao) {
        this.tenTonGiao = tenTonGiao;
    }
private String maTonGiao;
private String tenTonGiao;
}
