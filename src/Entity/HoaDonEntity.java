/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;
import org.bridj.cpp.com.OLEAutomationLibrary;

/**
 *
 * @author SingPC
 */
public class HoaDonEntity {
    private int idDonHang;
    private String maDonHang;
    private Date ngayLap;
    private float tongTien;
    private String tenNhanVien;
    private String tenKhachHang;
    private String trangThai;
    private int idHoaDon;

    public HoaDonEntity() {
    }

    public HoaDonEntity(int idDonHang, String maDonHang, Date ngayLap, float tongTien, String tenNhanVien, String tenKhachHang, String trangThai, int idHoaDon) {
        this.idDonHang = idDonHang;
        this.maDonHang = maDonHang;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.tenNhanVien = tenNhanVien;
        this.tenKhachHang = tenKhachHang;
        this.trangThai = trangThai;
        this.idHoaDon = idHoaDon;
    }

    public int getIdDonHang() {
        return idDonHang;
    }

    public void setIdDonHang(int idDonHang) {
        this.idDonHang = idDonHang;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }
    
}
