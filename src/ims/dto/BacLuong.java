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
public class BacLuong {

    public BacLuong(String maBacLuong, String tenBacLuong) {
        this.maBacLuong = maBacLuong;
        this.tenBacLuong = tenBacLuong;
    }
    public BacLuong() {
    }

    public String getMaBacLuong() {
        return maBacLuong;
    }

    public void setMaBacLuong(String maBacLuong) {
        this.maBacLuong = maBacLuong;
    }

    public String getTenBacLuong() {
        return tenBacLuong;
    }

    public void setTenBacLuong(String tenBacLuong) {
        this.tenBacLuong = tenBacLuong;
    }
    private String maBacLuong;
    private String tenBacLuong;
}
