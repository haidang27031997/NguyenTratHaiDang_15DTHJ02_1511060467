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
public class DanToc {
private String maDanToc;   
private String tenDanToc; 

    public String getMaDanToc() {
        return maDanToc;
    }

    public void setMaDanToc(String maDanToc) {
        this.maDanToc = maDanToc;
    }

    public String getTenDanToc() {
        return tenDanToc;
    }

    public void setTenDanToc(String tenDanToc) {
        this.tenDanToc = tenDanToc;
    }

    public DanToc(String maDanToc, String tenDanToc) {
        this.maDanToc = maDanToc;
        this.tenDanToc = tenDanToc;
    }
    public DanToc() {
       
    }
}
