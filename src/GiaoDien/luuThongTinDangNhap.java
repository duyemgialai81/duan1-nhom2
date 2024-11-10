/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDien;

import Entity.NhanVienEntity;
import KetNoiSQL.ketnoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author SingPC
 */
public class luuThongTinDangNhap {
    private static String taiKhoan;
    private static String vaiTro;
    private static  String maNhanVien;
    private static String tenNhanVien;
    private static int inNhanVien;

    public static int getInNhanVien() {
        return inNhanVien;
    }

    public static void setInNhanVien(int inNhanVien) {
        luuThongTinDangNhap.inNhanVien = inNhanVien;
    }

    public luuThongTinDangNhap() {
    }
     public static void setTenNhanVien(String tenNhanVien) {
        luuThongTinDangNhap.tenNhanVien = tenNhanVien;
    }
 public static String getTenNhanVien() {
        return tenNhanVien;
    }
    public static void setMaNhanVien(String maNhanVien) {
        luuThongTinDangNhap.maNhanVien = maNhanVien;
    }
 public static String getMaNhanVien() {
        return maNhanVien;
    }

    
    public static void setTaiKhoan(String taiKhoan) {
        luuThongTinDangNhap.taiKhoan = taiKhoan;
    }

    public static String getTaiKhoan() {
        return taiKhoan;
    }

    public static void setVaiTro(String vaiTro) {
        luuThongTinDangNhap.vaiTro = vaiTro;
    }

    public static String getVaiTro() {
        return vaiTro;
    }
    
}
