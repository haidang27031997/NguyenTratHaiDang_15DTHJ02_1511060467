/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.QuanLyNhanVienDAL;
import ims.dto.BacLuong;
import ims.dto.ChucVu;
import ims.dto.ChuyenMon;
import ims.dto.DanToc;
import ims.dto.GiaDinh;
import ims.dto.GioiTinh;
import ims.dto.HD;
import ims.dto.Phong;
import ims.dto.ThongTinNhanVien;
import ims.dto.TonGiao;
import ims.dto.TrinhDo;
import java.util.ArrayList;

/**
 *
 * @author haida
 */
public class QuanLyNhanVienBLL {
QuanLyNhanVienDAL dal = new QuanLyNhanVienDAL();

    public ArrayList<ThongTinNhanVien> ReadNhanVienBLL() {
        ArrayList<ThongTinNhanVien> listNhanVien = new ArrayList<>();
        listNhanVien = dal.readNhanVien();
        return listNhanVien;    

    }
    public ArrayList<Phong> ReadPhongBLL() {
        ArrayList<Phong> listPhong = new ArrayList<>();
        listPhong = dal.readPhongDAL();
        return listPhong;    

    }
    public ArrayList<ChucVu> ReadChucVuBLL() {
        ArrayList<ChucVu> listChucVu = new ArrayList<>();
        listChucVu = dal.readChucVuDAL();
        return listChucVu;    
    }
    public ArrayList<ChuyenMon> ReadChuyenMonBLL() {
        ArrayList<ChuyenMon> listChuyenMon = new ArrayList<>();
        listChuyenMon = dal.readChuyenMonDAL();
        return listChuyenMon;    
    }
    public ArrayList<DanToc> ReadDanTocBLL() {
        ArrayList<DanToc> listDanToc = new ArrayList<>();
        listDanToc = dal.readDanTocDAL();
        return listDanToc;    
    }
    public ArrayList<GiaDinh> ReadGiaDinhBLL() {
        ArrayList<GiaDinh> listGiaDinh = new ArrayList<>();
        listGiaDinh = dal.readGiaDinhDAL();
        return listGiaDinh;    
    }
    public ArrayList<GioiTinh> ReadGioiTinhBLL() {
        ArrayList<GioiTinh> listGioiTinh = new ArrayList<>();
        listGioiTinh = dal.readGioiTinhDAL();
        return listGioiTinh;    
    }
    public ArrayList<HD> ReadHDBLL() {
        ArrayList<HD> listHD = new ArrayList<>();
        listHD = dal.readHDDAL();
        return listHD;    
    }
    public ArrayList<BacLuong> ReadBacLuongBLL() {
        ArrayList<BacLuong> listBacLuong = new ArrayList<>();
        listBacLuong = dal.readBacLuongDAL();
        return listBacLuong;    
    }
    public ArrayList<TonGiao> ReadTonGiaoBLL() {
        ArrayList<TonGiao> listTonGiao = new ArrayList<>();
        listTonGiao = dal.readTonGiaoDAL();
        return listTonGiao;    
    }
    public ArrayList<TrinhDo> ReadTrinhDoBLL() {
        ArrayList<TrinhDo> listTrinhDo = new ArrayList<>();
        listTrinhDo = dal.readTrinhDoDAL();
        return listTrinhDo;    
    }
    public ChucVu ReadMa1chucvuBLL(String mcv) {
        ChucVu cv = new ChucVu();
        cv = dal.readMa1chucvuDAL(mcv);
        return cv;    
    }
    public Phong ReadMa1phongBLL(String mp) {
        Phong p = new Phong();
        p = dal.readMa1phongDAL(mp);
        return p;    
    }
    public TrinhDo ReadMa1trinhdoBLL(String mtd) {
        TrinhDo td = new TrinhDo();
        td = dal.readMa1trinhdoDAL(mtd);
        return td;    
    }
    public ChuyenMon ReadMa1chuyenmonBLL(String mcm) {
        ChuyenMon cm = new ChuyenMon();
        cm = dal.readMa1chuyenmonDAL(mcm);
        return cm;    
    }
    public void addNewNhanVienBLL (ThongTinNhanVien nhanVien){
        dal.addNewNhanVienDAL(nhanVien);
        
}
     public GioiTinh takeMaGioiTinhBLL(String loaiGioiTinh) {
         GioiTinh gt = new GioiTinh();
         gt = dal.takeMaGioiTinhDAL(loaiGioiTinh);
         return gt;
     }
     public GiaDinh takeMaGiaDinhBLL(String tenGiaDinh) {
         GiaDinh gd = new GiaDinh();
         gd = dal.takeMaGiaDinhDAL(tenGiaDinh);
         return gd;
     }
     public DanToc takeMaDanTocBLL(String tenDanToc) {
         DanToc dt = new DanToc();
         dt = dal.takeMaDanTocDAL(tenDanToc);
         return dt;
     }
     public TonGiao takeMaTonGiaoBLL(String tenTonGiao) {
         TonGiao tg = new TonGiao();
         tg = dal.takeMaTonGiaoDAL(tenTonGiao);
         return tg;
     }
     public BacLuong takeMaBacLuongBLL(String tenBacLuong) {
         BacLuong bl = new BacLuong();
         bl = dal.takeMaBacLuongDAL(tenBacLuong);
         return bl;
     }
     public HD takeMaHDBLL(String tenHD) {
         HD hd = new HD();
         hd = dal.takeMaHDDAL(tenHD);
         return hd;
     }
     public void deleteNhanVienBLL (String id){
         dal.deleteNhanVienDAL(id);
     }
}

