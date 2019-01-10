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
public class GiaDinh {

    public GiaDinh(String maGiaDinh, String tenGiaDinh) {
        this.maGiaDinh = maGiaDinh;
        this.tenGiaDinh = tenGiaDinh;
    }
        public GiaDinh() {
        
    }
    
    public String getMaGiaDinh() {
        return maGiaDinh;
    }

    public void setMaGiaDinh(String maGiaDinh) {
        this.maGiaDinh = maGiaDinh;
    }

    public String getTenGiaDinh() {
        return tenGiaDinh;
    }

    public void setTenGiaDinh(String tenGiaDinh) {
        this.tenGiaDinh = tenGiaDinh;
    }
private String maGiaDinh;   
private String tenGiaDinh; 
}
