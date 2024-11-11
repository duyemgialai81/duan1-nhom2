/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Entity.NhanVienEntity;
import java.util.ArrayList;
import java.sql.*;
import KetNoiSQL.ketnoi;
/**
 *
 * @author SingPC
 */
public class NhanVienRepository {
   public ArrayList<NhanVienEntity> getAll() {
    ArrayList<NhanVienEntity> ls = new ArrayList<>();
    String sql = """
                 select ma_nhan_vien, ten_nhan_vien, so_dien_thoai, email, dia_chi , id_role
                 from NhanVien nv
                 join Role r on nv.id_role = r.id_ma_role
                 """;
    try (Connection con = ketnoi.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            NhanVienEntity nv = new NhanVienEntity();
            nv.setMaNhanVien(rs.getString("ma_nhan_vien"));
            nv.setTenNhanVien(rs.getString("ten_nhan_vien"));
            nv.setSoDienThoai(rs.getString("so_dien_thoai"));
            nv.setEmail(rs.getString("email"));
            nv.setDiaChi(rs.getString("dia_chi"));
            nv.setIdRole(rs.getInt("id_role"));  // Nếu bạn có thuộc tính idRole trong NhanVienEntity
            ls.add(nv);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return ls;
}
   public boolean delete(String maNhanVien){
       int check =0;
       String sql ="""
                   delete NhanVien
                  where ma_nhan_vien =?
                   """;
       try {
           Connection con = ketnoi.getConnection();
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setObject(1,maNhanVien);
           check =ps.executeUpdate();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return check  >0;
   }
  public ArrayList<NhanVienEntity> layDuLieuNhanVien(){
      ArrayList<NhanVienEntity> ls = new ArrayList<>();
      String sql = """
                   select ma_nhan_vien, ten_nhan_vien,email,so_dien_thoai,dia_chi,trang_thai
                   from nhanVien
                   where trang_thai = "Đang Làm"
                   """;
      try {
          Connection con = ketnoi.getConnection();
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet rs  = ps.executeQuery();
          while(rs.next()){
              NhanVienEntity nv = new NhanVienEntity();
              nv.setMaNhanVien(rs.getString("ma_nhan_vien"));
              nv.setTenNhanVien(rs.getString("ten_nhan_vien"));
              nv.setEmail(rs.getString("email"));
              nv.setSoDienThoai(rs.getString("so_dien_thoai"));
              nv.setDiaChi(rs.getString("dia_chi"));
              nv.setTrangThai(rs.getString("trang_thai"));
              ls.add(nv);
          }
      } catch (Exception e) {
          e.printStackTrace();
      }
      return  ls;
  }
}
