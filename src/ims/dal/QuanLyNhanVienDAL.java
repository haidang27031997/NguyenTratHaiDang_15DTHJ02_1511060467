/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

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
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agfor
     */
public class QuanLyNhanVienDAL extends Database{

    public static Connection conn = null;
    public static Statement stmt = null;;
     public ArrayList<ThongTinNhanVien> readNhanVien() {

        ArrayList<ThongTinNhanVien> nhanVienlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaNV, HoTen, NgaySinh, NoiSinh FROM thongtinnhanvien";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                ThongTinNhanVien nhanVien = new ThongTinNhanVien();
                nhanVien.setMaNV(rs.getString("MaNV"));
                nhanVien.setHoTen(rs.getString("HoTen"));
                nhanVien.setNgaySinh(rs.getDate("NgaySinh"));
                nhanVien.setNoiSinh(rs.getString("NoiSinh"));
                nhanVienlist.add(nhanVien);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return nhanVienlist;
        }

    }
     public ArrayList<Phong> readPhongDAL() {

        ArrayList<Phong> phongList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaPhong, TenPhong FROM phong";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                Phong phong = new Phong();
                phong.setMaPhong(rs.getString("MaPhong"));
                phong.setTenPhong(rs.getString("TenPhong"));
               
                phongList.add(phong);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return phongList;
        }

    }
   public ArrayList<ChucVu> readChucVuDAL() {

        ArrayList<ChucVu> chucVuList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaChucVu, TenChucVu FROM chucvu";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                ChucVu chucVu = new ChucVu();
                chucVu.setMaChucVu(rs.getString("MaChucVu"));
                chucVu.setTenChucVu(rs.getString("TenChucVu"));
               
                chucVuList.add(chucVu);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return chucVuList;
        }

    }
   public ArrayList<ChuyenMon> readChuyenMonDAL() {

        ArrayList<ChuyenMon> chuyenMonList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaChuyenMon, TenChuyenMon FROM chuyenmon";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                ChuyenMon chuyenMon = new ChuyenMon();
                chuyenMon.setMaChuyenMon(rs.getString("MaChuyenMon")); 
                chuyenMon.setTenChuyenMon(rs.getString("TenChuyenMon"));
               
                chuyenMonList.add(chuyenMon);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return chuyenMonList;
        }

    }
   public ArrayList<DanToc> readDanTocDAL() {

        ArrayList<DanToc> danTocList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaDanToc, TenDanToc FROM dantoc";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                DanToc danToc = new DanToc();
                danToc.setMaDanToc(rs.getString("MaDanToc")); 
                danToc.setTenDanToc(rs.getString("TenDanToc"));
               
                danTocList.add(danToc);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return danTocList;
        }

    }
    public ArrayList<GiaDinh> readGiaDinhDAL() {

        ArrayList<GiaDinh> giaDinhList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaGiaDinh, TenGiaDinh FROM giadinh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                GiaDinh giaDinh = new GiaDinh();
                giaDinh.setMaGiaDinh(rs.getString("MaGiaDinh")); 
                giaDinh.setTenGiaDinh(rs.getString("TenGiaDinh"));
               
                giaDinhList.add(giaDinh);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return giaDinhList;
        }

    }
    public ArrayList<GioiTinh> readGioiTinhDAL() {

        ArrayList<GioiTinh> gioiTinhList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaGioiTinh, LoaiGioiTinh FROM gioitinh";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                GioiTinh gioiTinh = new GioiTinh();
                gioiTinh.setMaGioiTinh(rs.getString("MaGioiTinh")); 
                gioiTinh.setLoaiGioiTinh(rs.getString("LoaiGioiTinh"));
               
                gioiTinhList.add(gioiTinh);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return gioiTinhList;
        }

    }
    public ArrayList<HD> readHDDAL() {

        ArrayList<HD> hDList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaHD, TenHD FROM hd";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                HD hD = new HD();
                hD.setMaHD(rs.getString("MaHD")); 
                hD.setTenHD(rs.getString("TenHD"));
               
                hDList.add(hD);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return hDList;
        }

    }
    public ArrayList<BacLuong> readBacLuongDAL() {

        ArrayList<BacLuong> bacLuongList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaBacLuong, TenBacLuong FROM bacluong";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                BacLuong bacLuong = new BacLuong();
                bacLuong.setMaBacLuong(rs.getString("MaBacLuong")); 
                bacLuong.setTenBacLuong(rs.getString("TenBacLuong"));
               
                bacLuongList.add(bacLuong);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return bacLuongList;
        }

    }
    public ArrayList<TonGiao> readTonGiaoDAL() {

        ArrayList<TonGiao> tonGiaoList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaTonGiao, TenTonGiao FROM tongiao";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                TonGiao tonGiao = new TonGiao();
                tonGiao.setMaTonGiao(rs.getString("MaTonGiao")); 
                tonGiao.setTenTonGiao(rs.getString("TenTonGiao"));
               
                tonGiaoList.add(tonGiao);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return tonGiaoList;
        }

    }
     public ArrayList<TrinhDo> readTrinhDoDAL() {

        ArrayList<TrinhDo> trinhDoList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaTrinhDo, TenTrinhDo FROM trinhdo";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                TrinhDo trinhDo = new TrinhDo();
                trinhDo.setMaTrinhDo(rs.getString("MaTrinhDo")); 
                trinhDo.setTenTrinhDo(rs.getString("TenTrinhDo"));
               
                trinhDoList.add(trinhDo);

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return trinhDoList;
        }

    }
    public Phong readMa1phongDAL(String mp) {

        Phong p = new Phong();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        String sql = "SELECT MaPhong, TenPhong FROM phong WHERE MaPhong = '" + mp + "'";
        ResultSet rs = null;
        rs = stmt.executeQuery(sql);
        if(rs.next()){
        p.setMaPhong(rs.getString("MaPhong")); 
        p.setTenPhong(rs.getString("TenPhong"));
        }
        }catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return p;
        }

    }
     public ChucVu readMa1chucvuDAL(String mcv) {

        ChucVu cv = new ChucVu();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        String sql = "SELECT MaChucVu, TenChucVu FROM chucvu WHERE MaChucVu = '" + mcv + "'";
        ResultSet rs = null;
        rs = stmt.executeQuery(sql);
        if(rs.next()){
        cv.setMaChucVu(rs.getString("MaChucVu")); 
        cv.setTenChucVu(rs.getString("TenChucVu"));
        }
        }catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return cv;
        }

    }
     public TrinhDo readMa1trinhdoDAL(String mtd) {

        TrinhDo td = new TrinhDo();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        String sql = "SELECT MaTrinhDo, TenTrinhDo FROM trinhdo WHERE MaTrinhDo = '" + mtd + "'";
        ResultSet rs = null;
        rs = stmt.executeQuery(sql);
        if(rs.next()){
        td.setMaTrinhDo(rs.getString("MaTrinhDo")); 
        td.setTenTrinhDo(rs.getString("TenTrinhDo"));
        }
        }catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return td;
        }
        

    }
      public ChuyenMon readMa1chuyenmonDAL(String mcm) {

        ChuyenMon cm = new ChuyenMon();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        String sql = "SELECT MaChuyenMon, TenChuyenMon FROM chuyenmon WHERE MaChuyenMon = '" + mcm + "'";
        ResultSet rs = null;
        rs = stmt.executeQuery(sql);
        if(rs.next()){
        cm.setMaChuyenMon(rs.getString("MaChuyenMon")); 
        cm.setTenChuyenMon(rs.getString("TenChuyenMon"));
        }
        }catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return cm;
        }

    }
      
      public void addNewNhanVienDAL(ThongTinNhanVien nV){
         conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String maNV = nV.getMaNV();
            String hoTen = nV.getHoTen();
            Date ngaySinh = nV.getNgaySinh();
            String noiSinh = nV.getNoiSinh();
            String soCMND =nV.getSoCMND();
            String queQuan = nV.getQueQuan();
            String choOHienTai = nV.getChoOHienTai();
            String dienThoaiDD = nV.getDienThoaiDD();
            int phuCapCV = nV.getPhuCapCV();
            String hdldSo = nV.getHdldSo();
            String loaiHD = nV.getLoaiHD();
            Date ngayHD = nV.getNgayHD();
            Date ngayBD = nV.getNgayBD();
            Date ngayKT = nV.getNgayKT();
            String gioiTinh = nV.getMaGioiTinh();
            String maPhong = nV.getMaPhong();
            String chucVu = nV.getMaChucVu();
            String trinhDo = nV.getMaTrinhDo();
            String chuyenMon = nV.getMaChuyenMon();
            String giaDinh = nV.getMaGiaDinh();
            String danToc = nV.getMaDanToc();
            String tonGiao = nV.getMaTonGiao();
            String bacLuong = nV.getMaBacLuong();
            String maHD = nV.getMaHD();
            
            
//            String sql = "INSERT INTO `thongtinnhanvien`(`MaNV`, `HoTen`, `MaPhong`, `MaChucVu`, `MaTrinhDo`, "
//                    + "`MaChuyenMon`, `MaGioiTinh`, `MaGiaDinh`, `MaDanToc`, `MaTonGiao`, `NgaySinh`, `NoiSinh`, "
//                    + "`SoCMND`, `QueQuan`, `ChoOHienTai`, `DienThoaiDD`, `MaBacLuong`, `PhuCapCV`, `HDLDSO`, "
//                    + "`MaHD`, `LoaiHD`, `NgayHD`, `NgayBD`, `NgayKT`) VALUES ('"+ maNV +"','"+ hoTen +"','"+ maPhong +"',"
//                    + "'"+ chucVu +"','"+ trinhDo +"','"+ chuyenMon +"','"+ gioiTinh +"','"+ giaDinh +"','1','1','1997/03/27',"
//                    + "'"+ noiSinh +"','"+ soCMND +"','"+ queQuan +"','"+ choOHienTai +"','"+ dienThoaiDD +"','3','"+ phuCapCV +"','"+ hdldSo +"',"
//                    + "'DH','"+ loaiHD +"','2019/01/09','2019/01/01','2019/01/31')";
            String sql ="INSERT INTO `thongtinnhanvien`(`MaNV`, `HoTen`, `MaPhong`, `MaChucVu`, `MaTrinhDo`, `MaChuyenMon`, `MaGioiTinh`, `MaGiaDinh`, `MaDanToc`, `MaTonGiao`, `NgaySinh`, `NoiSinh`, `SoCMND`, `QueQuan`, `ChoOHienTai`, `DienThoaiDD`, `MaBacLuong`, `PhuCapCV`, `HdldSo`,`MaHD`, `LoaiHD`, `NgayHD`, `NgayBD`, `NgayKT`) VALUES "
                    + "('"+maNV+"','"+hoTen+"','"+maPhong+"','"+chucVu+"','"+trinhDo+"','"+chuyenMon+"','"+gioiTinh+"','"+giaDinh+"','"+danToc+"','"+tonGiao+"','1997/03/27', 'noiSinh','soCMND','queQuan','choOHienTai','dienThoaiDD','"+bacLuong+"',phuCapCV,'"+hdldSo+"','"+maHD +"','loaiHD','2019/01/09','2019/01/01','2019/01/31')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //LẤY MÃ CBO
    public GioiTinh takeMaGioiTinhDAL(String loaiGioiTinh) {
        GioiTinh gt = new GioiTinh();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaGioiTinh, LoaiGioiTinh FROM gioitinh WHERE LoaiGioiTinh = '" + loaiGioiTinh + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                gt.setMaGioiTinh(rs.getString("MaGioiTinh"));
                gt.setLoaiGioiTinh(rs.getString("LoaiGioiTinh"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return gt;
        }
    }
    public GiaDinh takeMaGiaDinhDAL(String tenGiaDinh) {
        GiaDinh gd = new GiaDinh();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaGiaDinh, TenGiaDinh FROM giadinh WHERE TenGiaDinh = '" + tenGiaDinh + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                gd.setMaGiaDinh(rs.getString("MaGiaDinh"));
                gd.setTenGiaDinh(rs.getString("TenGiaDinh"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return gd;
        }
    }
    public DanToc takeMaDanTocDAL(String tenDanToc) {
        DanToc dt = new DanToc();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaDanToc, TenDanToc FROM dantoc WHERE TenDanToc = '" + tenDanToc + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                dt.setMaDanToc(rs.getString("MaDanToc"));
                dt.setTenDanToc(rs.getString("TenDanToc"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return dt;
        }
    }
    public TonGiao takeMaTonGiaoDAL(String tenTonGiao) {
        TonGiao tg = new TonGiao();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaTonGiao, TenTonGiao FROM tongiao WHERE TenTonGiao = '" + tenTonGiao + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                tg.setMaTonGiao(rs.getString("MaTonGiao"));
                tg.setTenTonGiao(rs.getString("TenTonGiao"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return tg;
        }
    }
    public BacLuong takeMaBacLuongDAL(String tenBacLuong) {
        BacLuong bl = new BacLuong();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaBacLuong, TenBacLuong FROM bacluong WHERE TenBacLuong = '" + tenBacLuong + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                bl.setMaBacLuong(rs.getString("MaBacLuong"));
                bl.setTenBacLuong(rs.getString("TenBacLuong"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return bl;
        }
    }
    public HD takeMaHDDAL(String tenHD) {
        HD hd = new HD();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaHD, TenHD FROM HD WHERE TenHD = '" + tenHD + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                hd.setMaHD(rs.getString("MaHD"));
                hd.setTenHD(rs.getString("TenHD"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QuanLyNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);           
        }   finally {
            return hd;
        }
    }
    public void deleteNhanVienDAL (String id){
        try{
            conn = getConnection();
            stmt = conn.createStatement();
            String sql = "DELETE FROM thongtinnhanvien WHERE MaNV = " +id;
            stmt.executeUpdate(sql);
                    
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}



