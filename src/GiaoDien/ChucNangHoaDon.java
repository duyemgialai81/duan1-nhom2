/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaoDien;

import Entity.HoaDonXemDuLieu;
import Repository.HoaDonrepository;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SingPC
 */
public class ChucNangHoaDon extends javax.swing.JPanel {
private HoaDonrepository hd = new HoaDonrepository();
private DefaultTableModel md = new DefaultTableModel();
    /**
     * Creates new form ChucNangHoaDon
     */
    public ChucNangHoaDon() {
        initComponents();
        md = (DefaultTableModel) tbl_hoaDon.getModel();
        hienThiDuLieu(hd.getAllChiTietHoaDon());
    }
    public void hienThiDuLieu(ArrayList<HoaDonXemDuLieu> hoaDon){
        md.setRowCount(0);
        for (HoaDonXemDuLieu hoaDonXemDuLieu : hoaDon) {
            md.addRow(new Object[]{
                hoaDonXemDuLieu.getMaHoaDon(), hoaDonXemDuLieu.getTongTien(), hoaDonXemDuLieu.getHinhThuc(), hoaDonXemDuLieu.getNgayLap(), hoaDonXemDuLieu.getTrangThai(),hoaDonXemDuLieu.getMaNhanVien(), hoaDonXemDuLieu.getTenNhanVien(), hoaDonXemDuLieu.getMaKhachHang(), hoaDonXemDuLieu.getTenKhachHang()
            });
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_HoaDon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_timKiemHoaDon = new javax.swing.JTextField();
        jPanel_TrangThaiThanhToan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbo_trangThaiThanhToan = new javax.swing.JComboBox<>();
        jPanel_HinhThucGiaoHang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbo_hinhThucGiaoHang = new javax.swing.JComboBox<>();
        jPanel_HinhThucThanhToan = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbo_hinhThucThanhToan = new javax.swing.JComboBox<>();
        jPanel_TongTien = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbo_tongTien = new javax.swing.JComboBox<>();
        btn_timKiem = new javax.swing.JButton();
        jPanel_HoaDonChiTiet = new javax.swing.JPanel();
        jPanel_Date = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hoaDon = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_hoaDonChiTiet = new javax.swing.JTable();

        jPanel_HoaDon.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_HoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hoá Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tìm Kiếm Hoá Đơn:");

        txt_timKiemHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timKiemHoaDonActionPerformed(evt);
            }
        });

        jPanel_TrangThaiThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_TrangThaiThanhToan.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Trạng Thái Thanh Toán:");

        cbo_trangThaiThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Chờ Thanh Toán", "Đã Thanh Toán", "Đã Huỷ" }));

        javax.swing.GroupLayout jPanel_TrangThaiThanhToanLayout = new javax.swing.GroupLayout(jPanel_TrangThaiThanhToan);
        jPanel_TrangThaiThanhToan.setLayout(jPanel_TrangThaiThanhToanLayout);
        jPanel_TrangThaiThanhToanLayout.setHorizontalGroup(
            jPanel_TrangThaiThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TrangThaiThanhToanLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_TrangThaiThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbo_trangThaiThanhToan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel_TrangThaiThanhToanLayout.setVerticalGroup(
            jPanel_TrangThaiThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TrangThaiThanhToanLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_trangThaiThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel_HinhThucGiaoHang.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_HinhThucGiaoHang.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Hình Thức Giao Hàng:");

        cbo_hinhThucGiaoHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Bán Trực Tiếp", "Khác" }));

        javax.swing.GroupLayout jPanel_HinhThucGiaoHangLayout = new javax.swing.GroupLayout(jPanel_HinhThucGiaoHang);
        jPanel_HinhThucGiaoHang.setLayout(jPanel_HinhThucGiaoHangLayout);
        jPanel_HinhThucGiaoHangLayout.setHorizontalGroup(
            jPanel_HinhThucGiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HinhThucGiaoHangLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_HinhThucGiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbo_hinhThucGiaoHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel_HinhThucGiaoHangLayout.setVerticalGroup(
            jPanel_HinhThucGiaoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HinhThucGiaoHangLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_hinhThucGiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel_HinhThucThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_HinhThucThanhToan.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Hình Thức Thanh Toán:");

        cbo_hinhThucThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Tiền Mặt", "Chuyển Khoản", "Quẹt Thẻ" }));

        javax.swing.GroupLayout jPanel_HinhThucThanhToanLayout = new javax.swing.GroupLayout(jPanel_HinhThucThanhToan);
        jPanel_HinhThucThanhToan.setLayout(jPanel_HinhThucThanhToanLayout);
        jPanel_HinhThucThanhToanLayout.setHorizontalGroup(
            jPanel_HinhThucThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HinhThucThanhToanLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_HinhThucThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbo_hinhThucThanhToan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel_HinhThucThanhToanLayout.setVerticalGroup(
            jPanel_HinhThucThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HinhThucThanhToanLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbo_hinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel_TongTien.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_TongTien.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tổng Tiền:");

        cbo_tongTien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "0 VNĐ - 50,000 VNĐ", "50,000 VNĐ - 100,000 VNĐ", "100,000 VNĐ - 150,000 VNĐ", "150,000 VNĐ - 200,000 VNĐ", "200,000 VNĐ - 250,000 VNĐ", "250,000 VNĐ - 300,000 VNĐ", "300,000 VNĐ - 350,000 VNĐ", "350,000 VNĐ - 400,000 VNĐ", "400,000 VNĐ - 450,000 VNĐ", "450,000 VNĐ - 500,000 VNĐ" }));

        javax.swing.GroupLayout jPanel_TongTienLayout = new javax.swing.GroupLayout(jPanel_TongTien);
        jPanel_TongTien.setLayout(jPanel_TongTienLayout);
        jPanel_TongTienLayout.setHorizontalGroup(
            jPanel_TongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TongTienLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_TongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel_TongTienLayout.setVerticalGroup(
            jPanel_TongTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TongTienLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btn_timKiem.setBackground(new java.awt.Color(255, 204, 0));
        btn_timKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_timKiem.setText("Tìm Kiếm");

        jPanel_HoaDonChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_HoaDonChiTiet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hoá Đơn Chi Tiết", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jPanel_Date.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Date.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tháng:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Năm:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", " " }));

        javax.swing.GroupLayout jPanel_DateLayout = new javax.swing.GroupLayout(jPanel_Date);
        jPanel_Date.setLayout(jPanel_DateLayout);
        jPanel_DateLayout.setHorizontalGroup(
            jPanel_DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DateLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel_DateLayout.setVerticalGroup(
            jPanel_DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DateLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel_DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_HoaDonChiTietLayout = new javax.swing.GroupLayout(jPanel_HoaDonChiTiet);
        jPanel_HoaDonChiTiet.setLayout(jPanel_HoaDonChiTietLayout);
        jPanel_HoaDonChiTietLayout.setHorizontalGroup(
            jPanel_HoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HoaDonChiTietLayout.createSequentialGroup()
                .addContainerGap(829, Short.MAX_VALUE)
                .addComponent(jPanel_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel_HoaDonChiTietLayout.setVerticalGroup(
            jPanel_HoaDonChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HoaDonChiTietLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_hoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hoá Đơn", "Tổng Tiền", "Thanh Toán", "Tiền Thừa Trả Khách", "Hình Thức Giao Hàng", "Hình Thức Thanh Toán", "Ngày Lập Hoá Đơn"
            }
        ));
        jScrollPane1.setViewportView(tbl_hoaDon);

        javax.swing.GroupLayout jPanel_HoaDonLayout = new javax.swing.GroupLayout(jPanel_HoaDon);
        jPanel_HoaDon.setLayout(jPanel_HoaDonLayout);
        jPanel_HoaDonLayout.setHorizontalGroup(
            jPanel_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HoaDonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HoaDonLayout.createSequentialGroup()
                        .addComponent(jPanel_TrangThaiThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_HinhThucGiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jPanel_HinhThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jPanel_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel_HoaDonLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(txt_timKiemHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_timKiem))
                    .addGroup(jPanel_HoaDonLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))))
            .addGroup(jPanel_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_HoaDonLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel_HoaDonChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel_HoaDonLayout.setVerticalGroup(
            jPanel_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HoaDonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timKiemHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_HinhThucThanhToan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_TongTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_HinhThucGiaoHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_TrangThaiThanhToan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HoaDonLayout.createSequentialGroup()
                    .addContainerGap(57, Short.MAX_VALUE)
                    .addComponent(jPanel_HoaDonChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(267, 267, 267)))
        );

        tbl_hoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Mã Sản Phẩm", "Tên Sản Phẩm Chi Tiết", "Số Lượng", "Đơn Giá", "Thành Tiền"
            }
        ));
        jScrollPane3.setViewportView(tbl_hoaDonChiTiet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_timKiemHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timKiemHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timKiemHoaDonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JComboBox<String> cbo_hinhThucGiaoHang;
    private javax.swing.JComboBox<String> cbo_hinhThucThanhToan;
    private javax.swing.JComboBox<String> cbo_tongTien;
    private javax.swing.JComboBox<String> cbo_trangThaiThanhToan;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_Date;
    private javax.swing.JPanel jPanel_HinhThucGiaoHang;
    private javax.swing.JPanel jPanel_HinhThucThanhToan;
    private javax.swing.JPanel jPanel_HoaDon;
    private javax.swing.JPanel jPanel_HoaDonChiTiet;
    private javax.swing.JPanel jPanel_TongTien;
    private javax.swing.JPanel jPanel_TrangThaiThanhToan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_hoaDon;
    private javax.swing.JTable tbl_hoaDonChiTiet;
    private javax.swing.JTextField txt_timKiemHoaDon;
    // End of variables declaration//GEN-END:variables
}
