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
public class ChuyenMon {

    public ChuyenMon(String maChuyenMon, String tenChuyenMon) {
        this.maChuyenMon = maChuyenMon;
        this.tenChuyenMon = tenChuyenMon;
    }
      public ChuyenMon() {
        
      }
    public String getMaChuyenMon() {
        return maChuyenMon;
    }

    public void setMaChuyenMon(String maChuyenMon) {
        this.maChuyenMon = maChuyenMon;
    }

    public String getTenChuyenMon() {
        return tenChuyenMon;
    }

    public void setTenChuyenMon(String tenChuyenMon) {
        this.tenChuyenMon = tenChuyenMon;
    }
private String maChuyenMon; 
private String tenChuyenMon;
}
