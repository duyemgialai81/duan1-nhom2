/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDien;

import Entity.NhanVienEntity;
import Entity.TaiKhoanEntity;
import Repository.NhanVienRepository;
import Repository.TaiKhoanRepository;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;  

/**
 *
 * @author SingPC
 */
public class GiaoDienChinh extends javax.swing.JFrame {
    public GiaoDienChinh() {
         initComponents();
         setTitle("Phầm Mềm Quản Lý Và Bán Hàng");
         ChuyenChucNang ccn = new ChuyenChucNang(manhinh);
         ccn.setView(tbltrangchu, tbltrangchu1);
         
         ArrayList<ChucNang> ls  = new ArrayList<>();
         ls.add(new ChucNang("TrangChu", tbltrangchu, tbltrangchu1));
         ls.add(new ChucNang("ChucNangBanHang", tblbanhang1,tblbanhang ));
         ls.add(new ChucNang("ChucNangSanPham", tblsanpham, tblsanpham1));
         ls.add(new ChucNang("ChucNangHoaDon", tblhoadon, tbhhoadon1));
         ls.add(new ChucNang("ChuCNangQuanLyNhanVien",btlnnhanvien1, btlnnhanvien));
       
         ccn.DuyEm(ls);
         hirnThiDuLieu();
    }
        
        
    public void hirnThiDuLieu(){
//        txtTenNhanvien.setText(luuThongTinDangNhap.getTenNhanVien());
        txtTenNhanvien.setText(String.valueOf(luuThongTinDangNhap.getInNhanVien()));
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        hinhMenu = new javax.swing.JPanel();
        txtTenNhanvien = new javax.swing.JLabel();
        chucnangmenu = new javax.swing.JPanel();
        tblbanhang1 = new javax.swing.JPanel();
        tblbanhang = new javax.swing.JButton();
        tbltrangchu = new javax.swing.JPanel();
        tbltrangchu1 = new javax.swing.JButton();
        tblsanpham = new javax.swing.JPanel();
        tblsanpham1 = new javax.swing.JButton();
        tblhoadon = new javax.swing.JPanel();
        tbhhoadon1 = new javax.swing.JButton();
        btlnnhanvien1 = new javax.swing.JPanel();
        btlnnhanvien = new javax.swing.JButton();
        manhinh = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hinhMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTenNhanvien.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtTenNhanvienAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout hinhMenuLayout = new javax.swing.GroupLayout(hinhMenu);
        hinhMenu.setLayout(hinhMenuLayout);
        hinhMenuLayout.setHorizontalGroup(
            hinhMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hinhMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTenNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hinhMenuLayout.setVerticalGroup(
            hinhMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hinhMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTenNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        chucnangmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblbanhang.setBackground(new java.awt.Color(255, 255, 51));
        tblbanhang.setText("BÁN HÀNG");
        //jButton1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tblbanhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbanhangMouseClicked(evt);
            }
        });
        tblbanhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblbanhangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tblbanhang1Layout = new javax.swing.GroupLayout(tblbanhang1);
        tblbanhang1.setLayout(tblbanhang1Layout);
        tblbanhang1Layout.setHorizontalGroup(
            tblbanhang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tblbanhang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblbanhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tblbanhang1Layout.setVerticalGroup(
            tblbanhang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblbanhang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblbanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbltrangchu1.setBackground(new java.awt.Color(255, 255, 51));
        tbltrangchu1.setText("TRANG CHỦ");
        //jButton1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        javax.swing.GroupLayout tbltrangchuLayout = new javax.swing.GroupLayout(tbltrangchu);
        tbltrangchu.setLayout(tbltrangchuLayout);
        tbltrangchuLayout.setHorizontalGroup(
            tbltrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbltrangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbltrangchu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tbltrangchuLayout.setVerticalGroup(
            tbltrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbltrangchuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbltrangchu1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblsanpham1.setBackground(new java.awt.Color(255, 255, 51));
        tblsanpham1.setText("SẢN PHẨM");
        //jButton1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tblsanpham1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsanpham1MouseClicked(evt);
            }
        });
        tblsanpham1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblsanpham1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tblsanphamLayout = new javax.swing.GroupLayout(tblsanpham);
        tblsanpham.setLayout(tblsanphamLayout);
        tblsanphamLayout.setHorizontalGroup(
            tblsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblsanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblsanpham1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tblsanphamLayout.setVerticalGroup(
            tblsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblsanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblsanpham1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tbhhoadon1.setBackground(new java.awt.Color(255, 255, 51));
        tbhhoadon1.setText("HÓA ĐƠN");

        javax.swing.GroupLayout tblhoadonLayout = new javax.swing.GroupLayout(tblhoadon);
        tblhoadon.setLayout(tblhoadonLayout);
        tblhoadonLayout.setHorizontalGroup(
            tblhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblhoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbhhoadon1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tblhoadonLayout.setVerticalGroup(
            tblhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tblhoadonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbhhoadon1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        btlnnhanvien.setText("NHÂN VIÊN");

        javax.swing.GroupLayout btlnnhanvien1Layout = new javax.swing.GroupLayout(btlnnhanvien1);
        btlnnhanvien1.setLayout(btlnnhanvien1Layout);
        btlnnhanvien1Layout.setHorizontalGroup(
            btlnnhanvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btlnnhanvien1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btlnnhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btlnnhanvien1Layout.setVerticalGroup(
            btlnnhanvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btlnnhanvien1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btlnnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout chucnangmenuLayout = new javax.swing.GroupLayout(chucnangmenu);
        chucnangmenu.setLayout(chucnangmenuLayout);
        chucnangmenuLayout.setHorizontalGroup(
            chucnangmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chucnangmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chucnangmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblsanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbltrangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tblbanhang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tblhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btlnnhanvien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        chucnangmenuLayout.setVerticalGroup(
            chucnangmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chucnangmenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tbltrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblbanhang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btlnnhanvien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chucnangmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hinhMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hinhMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chucnangmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        manhinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout manhinhLayout = new javax.swing.GroupLayout(manhinh);
        manhinh.setLayout(manhinhLayout);
        manhinhLayout.setHorizontalGroup(
            manhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        manhinhLayout.setVerticalGroup(
            manhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manhinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manhinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblsanpham1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsanpham1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblsanpham1MouseClicked

    private void tblsanpham1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblsanpham1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblsanpham1ActionPerformed

    private void tblbanhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbanhangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblbanhangMouseClicked

    private void tblbanhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblbanhangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblbanhangActionPerformed

    private void txtTenNhanvienAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtTenNhanvienAncestorAdded
        // TODO add your handling code here:
//hienThiDuLieuLen(0);


    }//GEN-LAST:event_txtTenNhanvienAncestorAdded

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlnnhanvien;
    private javax.swing.JPanel btlnnhanvien1;
    private javax.swing.JPanel chucnangmenu;
    private javax.swing.JPanel hinhMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel manhinh;
    private javax.swing.JPanel menu;
    private javax.swing.JButton tbhhoadon1;
    private javax.swing.JButton tblbanhang;
    private javax.swing.JPanel tblbanhang1;
    private javax.swing.JPanel tblhoadon;
    private javax.swing.JPanel tblsanpham;
    private javax.swing.JButton tblsanpham1;
    private javax.swing.JPanel tbltrangchu;
    private javax.swing.JButton tbltrangchu1;
    private javax.swing.JLabel txtTenNhanvien;
    // End of variables declaration//GEN-END:variables
}
