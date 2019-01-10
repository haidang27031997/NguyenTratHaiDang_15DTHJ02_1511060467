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
public class GioiTinh {

    public GioiTinh(String maGioiTinh, String loaiGioiTinh) {
        this.maGioiTinh = maGioiTinh;
        this.loaiGioiTinh = loaiGioiTinh;
    }
    public GioiTinh(){
    }
private String maGioiTinh;  
private String loaiGioiTinh;

    public String getMaGioiTinh() {
        return maGioiTinh;
    }

    public void setMaGioiTinh(String maGioiTinh) {
        this.maGioiTinh = maGioiTinh;
    }

    public String getLoaiGioiTinh() {
        return loaiGioiTinh;
    }

    public void setLoaiGioiTinh(String loaiGioiTinh) {
        this.loaiGioiTinh = loaiGioiTinh;
    }
}
