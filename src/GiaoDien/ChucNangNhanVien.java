/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaoDien;

import Entity.NhanVienEntity;
import Repository.NhanVienRepository;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SingPC
 */
public class ChucNangNhanVien extends javax.swing.JPanel {
private NhanVienRepository nvvv = new NhanVienRepository();
private DefaultTableModel md = new DefaultTableModel();

    /**
     * Creates new form ChucNangNhanVien
     */
    public ChucNangNhanVien() {
        initComponents();
        HienThiDuLieu(nvvv.layDuLieuNhanVien());
        HienThiDuLieuNghiLam(nvvv.layDuLieuNhanVienNghilam());
    }

    private void HienThiDuLieu(ArrayList<NhanVienEntity> nhanVien) {
        md = (DefaultTableModel) tbl_DangLamViec.getModel();
        md.setRowCount(0);
        for (NhanVienEntity nhanVienEntity : nhanVien) {
            md.addRow(new Object[]{
                nhanVienEntity.getMaNhanVien(),
                nhanVienEntity.getTenNhanVien(),
                nhanVienEntity.getEmail(),
                nhanVienEntity.getSoDienThoai(),
                nhanVienEntity.getDiaChi(),
                nhanVienEntity.isTrangThai() ? "Đang Làm" : "Nghỉ Làm",
                nhanVienEntity.isGioiTinh() ? "Nam" : "Nữ"

            });
        }
    }
     private  void HienThiDuLieuNghiLam(ArrayList<NhanVienEntity>nhanVien){
        md = (DefaultTableModel) tbl_NghiViec.getModel();
        md.setRowCount(0);
        for (NhanVienEntity nhanVienEntity : nhanVien) {
            md.addRow(new Object[]{
                 nhanVienEntity.getMaNhanVien(),
                nhanVienEntity.getTenNhanVien(),
                nhanVienEntity.getEmail(),
                nhanVienEntity.getSoDienThoai(),
                nhanVienEntity.getDiaChi(),
                nhanVienEntity.isTrangThai() ? "Đang Làm" : "Nghỉ Làm",
                nhanVienEntity.isGioiTinh() ? "Nam" : "Nữ"

            });
        }
    }
     private NhanVienEntity getFomat(){
         NhanVienEntity nv = new NhanVienEntity();
         nv.setMaNhanVien(txt_maNV.getText());
         nv.setTenNhanVien(txt_TenNV.getText());
         nv.setEmail(txt_Email.getText());
         nv.setSoDienThoai(txt_SDT.getText());
         nv.setDiaChi(txt_DiaChi.getText());
         boolean gioiTinh = rdo_Nam.isSelected();
         nv.setGioiTinh(gioiTinh);
         boolean trangThai = rdo_DangLamViec.isSelected();
         nv.setTrangThai(trangThai);
         return nv;
     }
     private void hienThiDuLieuLenTextFileDangLam(int index){
         // Lấy đối tượng nhân viên từ danh sách tại vị trí indexdex);
         NhanVienEntity nvv = nvvv.layDuLieuNhanVien().get(index);
         txt_maNV.setText(nvv.getMaNhanVien());
         txt_TenNV.setText(nvv.getTenNhanVien());
         txt_Email.setText(nvv.getEmail());
         txt_SDT.setText(nvv.getSoDienThoai());
         txt_DiaChi.setText(nvv.getDiaChi());
         if(nvv.isGioiTinh()){
             rdo_Nam.setSelected(true);
         } else {
             rdo_Nu.setSelected(true);
         }
         if(nvv.isTrangThai()){
             rdo_DangLamViec.setSelected(true);
           }else{
             rdo_NghiViec.setSelected(true);
        }
        }
     private void hienThiDuLieuLenTextFileNghi(int index){
         // Lấy đối tượng nhân viên từ danh sách tại vị trí indexdex);
         NhanVienEntity nvv = nvvv.layDuLieuNhanVien().get(index);
         txt_maNV.setText(nvv.getMaNhanVien());
         txt_TenNV.setText(nvv.getTenNhanVien());
         txt_Email.setText(nvv.getEmail());
         txt_SDT.setText(nvv.getSoDienThoai());
         txt_DiaChi.setText(nvv.getDiaChi());
         if(nvv.isGioiTinh()){
             rdo_Nam.setSelected(true);
         } else {
             rdo_Nu.setSelected(true);
         }
         if(nvv.isTrangThai()){
             rdo_DangLamViec.setSelected(true);
           }else{
             rdo_NghiViec.setSelected(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel_Nen = new javax.swing.JPanel();
        cbo_VaiTro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_MatKhau = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        txt_TenNV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_Email = new javax.swing.JTextField();
        txt_SDT = new javax.swing.JTextField();
        rdo_DangLamViec = new javax.swing.JRadioButton();
        rdo_NghiViec = new javax.swing.JRadioButton();
        btn_Them = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdo_Nam = new javax.swing.JRadioButton();
        rdo_Nu = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_maNV = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbo_LocGioiTinh = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbo_LocVaiTro = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btn_Tim = new javax.swing.JButton();
        txt_TimKiem = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DangLamViec = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_NghiViec = new javax.swing.JTable();

        jPanel_Nen.setBackground(new java.awt.Color(255, 255, 255));

        cbo_VaiTro.setBackground(new java.awt.Color(255, 255, 255));
        cbo_VaiTro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiết Lập Thông Tin Nhân Viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tên NV:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Mật Khẩu:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Vai Trò:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Địa Chỉ:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Điện Thoại:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Giới Tính:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Trạng Thái:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản Lý", "Nhân Viên Bán Hàng", "Nhân Viên IT", "Nhân Viên Kiểm Kho", "Nhân Viên Giao Hàng" }));

        buttonGroup2.add(rdo_DangLamViec);
        rdo_DangLamViec.setText("Đang Làm");

        buttonGroup2.add(rdo_NghiViec);
        rdo_NghiViec.setText("Nghỉ Làm");

        btn_Them.setBackground(new java.awt.Color(255, 204, 0));
        btn_Them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_LamMoi.setBackground(new java.awt.Color(255, 204, 0));
        btn_LamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_LamMoi.setText("Làm Mới");

        btn_Sua.setBackground(new java.awt.Color(255, 204, 0));
        btn_Sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo_Nam);
        rdo_Nam.setText("Nam");

        buttonGroup1.add(rdo_Nu);
        rdo_Nu.setText("Nữ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdo_Nam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(rdo_Nu)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo_Nam)
                    .addComponent(rdo_Nu))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setText("MÃ Nhân Viên");

        javax.swing.GroupLayout cbo_VaiTroLayout = new javax.swing.GroupLayout(cbo_VaiTro);
        cbo_VaiTro.setLayout(cbo_VaiTroLayout);
        cbo_VaiTroLayout.setHorizontalGroup(
            cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cbo_VaiTroLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbo_VaiTroLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbo_VaiTroLayout.createSequentialGroup()
                            .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(cbo_VaiTroLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cbo_VaiTroLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_MatKhau)
                                .addComponent(jComboBox1, 0, 200, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbo_VaiTroLayout.createSequentialGroup()
                            .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(cbo_VaiTroLayout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(txt_maNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31)
                .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cbo_VaiTroLayout.createSequentialGroup()
                        .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cbo_VaiTroLayout.createSequentialGroup()
                                .addComponent(rdo_DangLamViec)
                                .addGap(18, 18, 18)
                                .addComponent(rdo_NghiViec))
                            .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cbo_VaiTroLayout.createSequentialGroup()
                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_LamMoi)
                        .addGap(218, 218, 218)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cbo_VaiTroLayout.setVerticalGroup(
            cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cbo_VaiTroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cbo_VaiTroLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(rdo_DangLamViec)
                    .addComponent(rdo_NghiViec))
                .addGap(18, 18, 18)
                .addGroup(cbo_VaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them)
                    .addComponent(btn_LamMoi)
                    .addComponent(btn_Sua))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lọc", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Lọc Theo Giới Tính:");

        cbo_LocGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Nam", "Nữ" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Lọc Theo Vai Trò:");

        cbo_LocVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Quản Lý", "Nhân Viên Bán Hàng", "Nhân Viên IT", "Nhân Viên Kiểm Kho", "Nhân Viên Giao Hàng" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(cbo_LocGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(cbo_LocVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbo_LocGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbo_LocVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btn_Tim.setBackground(new java.awt.Color(255, 204, 0));
        btn_Tim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Tim.setText("Tìm");
        btn_Tim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TimMouseClicked(evt);
            }
        });

        txt_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Tim)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Tim)
                    .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));

        tbl_DangLamViec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Mật Khẩu", "Tên Nhân Viên", "Vai Trò", "Địa Chỉ", "Điện Thoại", "Ngày Sinh", "Giới Tính", "Email", "Trạng Thái"
            }
        ));
        tbl_DangLamViec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DangLamViecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_DangLamViec);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Đang Làm Việc", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tbl_NghiViec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Mật Khẩu", "Tên Nhân Viên", "Vai Trò", "Địa Chỉ", "Điện Thoại", "Ngày Sinh", "Giới Tính", "Email", "Trạng Thái"
            }
        ));
        tbl_NghiViec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NghiViecMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_NghiViec);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nghỉ Việc", jPanel5);

        javax.swing.GroupLayout jPanel_NenLayout = new javax.swing.GroupLayout(jPanel_Nen);
        jPanel_Nen.setLayout(jPanel_NenLayout);
        jPanel_NenLayout.setHorizontalGroup(
            jPanel_NenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NenLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel_NenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_VaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_NenLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_NenLayout.setVerticalGroup(
            jPanel_NenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_VaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_NenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Nen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Nen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
        nvvv.ThemNhanVien(getFomat());
        HienThiDuLieu(nvvv.layDuLieuNhanVien());
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void tbl_DangLamViecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DangLamViecMouseClicked
        // TODO add your handling code here:
        int index = tbl_DangLamViec.getSelectedRow();
       hienThiDuLieuLenTextFileDangLam(index);
    }//GEN-LAST:event_tbl_DangLamViecMouseClicked

    private void tbl_NghiViecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NghiViecMouseClicked
        // TODO add your handling code here:
        int index = tbl_NghiViec.getSelectedRow();
        hienThiDuLieuLenTextFileNghi(index);
    }//GEN-LAST:event_tbl_NghiViecMouseClicked

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:
        NhanVienEntity nv = getFomat();
        boolean ketQua = nvvv.updateNhanVien(nv, nv.getMaNhanVien());
        if(ketQua){
            JOptionPane.showMessageDialog(jPanel_Nen, "Cập nhập Thành Công");
            HienThiDuLieu(nvvv.layDuLieuNhanVien());
            HienThiDuLieuNghiLam(nvvv.layDuLieuNhanVienNghilam());
        }else{
            JOptionPane.showMessageDialog(jPanel_Nen, "Cập Nhập thất Bại");
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void txt_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TimKiemActionPerformed

    private void btn_TimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TimMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btn_TimMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Tim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbo_LocGioiTinh;
    private javax.swing.JComboBox<String> cbo_LocVaiTro;
    private javax.swing.JPanel cbo_VaiTro;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_Nen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdo_DangLamViec;
    private javax.swing.JRadioButton rdo_Nam;
    private javax.swing.JRadioButton rdo_NghiViec;
    private javax.swing.JRadioButton rdo_Nu;
    private javax.swing.JTable tbl_DangLamViec;
    private javax.swing.JTable tbl_NghiViec;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_MatKhau;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TenNV;
    private javax.swing.JTextField txt_TimKiem;
    private javax.swing.JLabel txt_maNV;
    // End of variables declaration//GEN-END:variables
}
