/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDien;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author SingPC
 */
public class ChuyenChucNang {

    private JPanel jpnRoot;
    private String kindSelected = "";
    private ArrayList<ChucNang> duyem = null;

    public ChuyenChucNang(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }

    public void setView(JPanel jpnItem, JButton tblItem) {
        kindSelected = "ChucNangBanHang";
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.validate();
        jpnRoot.add(new TrangChu());
        jpnRoot.repaint();
    }

    /**
     *
     * @param duyem
     */
    public void DuyEm(ArrayList<ChucNang> duyem) {
        for (ChucNang ls : duyem) {
            ls.getLpb().addMouseListener(new LaBalEvent(ls.getKind(), ls.getJpn(), ls.getLpb()));
        }
    }

    class LaBalEvent implements MouseListener {

        private JPanel node;

        private String kinh;
        private JPanel jpnItem;
        private JButton tblItem;

        public LaBalEvent() {
        }

        public LaBalEvent(String kinh, JPanel jpnItem, JButton tblItem) {
            this.kinh = kinh;
            this.jpnItem = jpnItem;
            this.tblItem = tblItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kinh) {
                case "TrangChu":
                    node = new TrangChu();
                    break;
                case "ChucNangBanHang":
                    node = new ChucNangBanHang();
                    break;
                case "ChucNangSanPham":
                    node = new ChucNangSanPham();
                    break;
                case "ChucNangKhuyenMai":
                node = new ChucNangKhuyenMai();
                break;
                case "ChucNangHoaDon":
                    node = new ChucNangHoaDon();
                    break;
                case "ChucNangKhachHang":
                    node =  new ChucNangKhachHang();
                    break;
                case "ChucNangNhanVien":
                    node =  new ChucNangNhanVien();
                    break;
                case "ChucNangThongKe":
                    node = new ChucNangThongKe();
                    default:
                    break;

            }
            jpnRoot.removeAll();;
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(node);
            jpnRoot.validate();
            jpnRoot.repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    }
}
