/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finaltermproject;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.mycompany.createGUI.customerReturnInvoiceGUI.ReturnInvoiceDetail;
import com.mycompany.createGUI.salesInvoiceGUI.SalesInvoiceDetail;
import com.sqlConnection.JDBCUtil;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author letri
 */
public class CustomerReturnInvoiceGUI extends javax.swing.JFrame {

    DefaultTableModel phieuTraTableModel;

    /**
     * Creates new form ImportUI
     */
    public CustomerReturnInvoiceGUI() {
        initComponents();
        phieuTraTableModel = (DefaultTableModel) phieuTraTable.getModel();
        confirmBtn.setEnabled(false);
        killNoteBtn.setEnabled(false);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        backToMenuBtn = new javax.swing.JButton();
        resetNoteBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        killNoteBtn = new javax.swing.JButton();
        detailNoteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        phieuTraTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setIcon(new FlatSVGIcon("./icon/import.svg"));
        jLabel2.setPreferredSize(new java.awt.Dimension(72, 72));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Phiếu trả hàng");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        backToMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backToMenuBtn.setText("Back");
        backToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel3.add(backToMenuBtn, gridBagConstraints);

        resetNoteBtn.setBackground(new java.awt.Color(102, 204, 255));
        resetNoteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resetNoteBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetNoteBtn.setText("Làm mới");
        resetNoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetNoteBtn(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel3.add(resetNoteBtn, gridBagConstraints);

        confirmBtn.setBackground(new java.awt.Color(102, 204, 0));
        confirmBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmBtn.setText("Xác nhận");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel3.add(confirmBtn, gridBagConstraints);

        killNoteBtn.setBackground(new java.awt.Color(255, 102, 102));
        killNoteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        killNoteBtn.setForeground(new java.awt.Color(255, 255, 255));
        killNoteBtn.setText("Hủy phiếu");
        killNoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                killNoteBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel3.add(killNoteBtn, gridBagConstraints);

        detailNoteBtn.setBackground(new java.awt.Color(153, 153, 255));
        detailNoteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        detailNoteBtn.setForeground(new java.awt.Color(255, 255, 255));
        detailNoteBtn.setText("Chi tiết phiếu");
        detailNoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailNoteBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        jPanel3.add(detailNoteBtn, gridBagConstraints);

        getContentPane().add(jPanel3);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        phieuTraTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phieuTraTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Thời gian", "Trạng thái", "Mã phiếu bán", "ID khách hàng", "Account ID", "Số lượng", "Tổng tiền"
            }
        ));
        phieuTraTable.setGridColor(new java.awt.Color(204, 204, 204));
        phieuTraTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phieuTraTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(phieuTraTable);

        jScrollPane1.getViewport().setBackground(new Color(204,255,255));

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuBtnActionPerformed
        mainUI mainUI = new mainUI();
        mainUI.setLocation(this.getX(), this.getY());
        mainUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backToMenuBtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            Connection con = JDBCUtil.getConnection();
            String query = "SELECT "
                    + "pt.ma_phieu_tra, "
                    + "pt.thoi_gian, "
                    + "pt.trang_thai, "
                    + "pb.ma_phieu_ban, "
                    + "pb.khach_hang, "
                    + "pt.account_id, "
                    + "SUM(ct.quantity_returned) AS tong_quantity, "
                    + "SUM(ct.quantity_returned * CAST(ct.don_gia AS INT)) AS tong_tien "
                    + "FROM "
                    + "phieu_tra pt "
                    + "LEFT JOIN "
                    + "phieuban pb ON pt.ma_phieu_ban = pb.ma_phieu_ban "
                    + "LEFT JOIN "
                    + "ctphieuban ct ON pb.ma_phieu_ban = ct.ma_phieu_ban "
                    + "GROUP BY "
                    + "pt.ma_phieu_tra, pt.thoi_gian, pt.trang_thai, pb.ma_phieu_ban, pb.khach_hang, pt.account_id";

            ResultSet resultSet = JDBCUtil.getResultSet(con, query);
            ResultSetMetaData resultSetMetaData = JDBCUtil.getMetaData(resultSet);

            phieuTraTableModel.setRowCount(0);

            String id, thoiGian, trangThai, idPhieuBan, idKhachHang, accountId, tongQuantity, tongTien;
            while (resultSet.next()) {
                id = resultSet.getString(1);              // Mã phiếu trả
                thoiGian = resultSet.getString(2);       // Thời gian trả
                trangThai = resultSet.getString(3);      // Trạng thái phiếu trả
                idPhieuBan = resultSet.getString(4);     // Mã phiếu bán liên kết
                idKhachHang = resultSet.getString(5);    // Khách hàng liên kết
                accountId = resultSet.getString(6);      // Nhân viên xử lý
                tongQuantity = resultSet.getString(7);   // Tổng số lượng trả
                tongTien = resultSet.getString(8);       // Tổng tiền trả
                String[] row = {id, thoiGian, trangThai, idPhieuBan, idKhachHang, accountId, tongQuantity, tongTien};
                phieuTraTableModel.addRow(row);
            }
            JDBCUtil.closeConnection(con);

            // Tạo renderer tùy chỉnh cho cột Trạng thái
            phieuTraTable.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    // Gọi phương thức gốc
                    Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                    // Kiểm tra giá trị của cột và thay đổi hiển thị
                    if (value != null) {
                        int status = Integer.parseInt((String) value); // Lấy giá trị String và chuyển thành Integer
                        switch (status) {
                            case 0 -> {
                                setText("Đang xử lý");
                                setForeground(Color.BLUE);  // Màu chữ xanh cho "Đang xử lý"
                            }
                            case 1 -> {
                                setText("Hoàn thành");
                                setForeground(Color.GREEN);  // Màu chữ xanh lá cho "Hoàn thành"
                            }
                            case 2 -> {
                                setText("Đã hủy");
                                setForeground(Color.RED);  // Màu chữ đỏ cho "Đã hủy"
                            }
                            default -> {
                                setText("Không xác định");
                                comp.setBackground(Color.WHITE); // Màu nền trắng cho giá trị không xác định
                                setForeground(Color.BLACK);  // Màu chữ đen cho giá trị không xác định
                            }
                        }
                    }
                    return comp;
                }
            });
            phieuTraTable.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    JLabel label = new JLabel("<html><u>" + value.toString() + "</u></html>");
                    label.setForeground(Color.BLUE); // Đặt màu xanh cho liên kết
                    label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Hiển thị con trỏ hình bàn tay
                    return label;
                }
            });

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
        }

    }//GEN-LAST:event_formWindowActivated

    private void resetNoteBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetNoteBtn
        try {
            // Kết nối cơ sở dữ liệu
            Connection con = JDBCUtil.getConnection();

            // Truy vấn để lấy tất cả phiếu trả
            String query = "SELECT pt.ma_phieu_tra, pt.thoi_gian, pt.trang_thai, pb.ma_phieu_ban, pb.khach_hang, pt.account_id "
                    + "FROM phieu_tra pt "
                    + "LEFT JOIN phieuban pb ON pt.ma_phieu_ban = pb.ma_phieu_ban";

            // Thực hiện truy vấn và lấy dữ liệu
            ResultSet resultSet = JDBCUtil.getResultSet(con, query);

            // Làm rỗng bảng trước khi thêm dữ liệu mới
            phieuTraTableModel.setRowCount(0);

            // Thêm dữ liệu từ ResultSet vào bảng
            while (resultSet.next()) {
                String maPhieuTra = resultSet.getString("ma_phieu_tra");
                String thoiGian = resultSet.getString("thoi_gian");
                String trangThai = resultSet.getString("trang_thai");
                String maPhieuBan = resultSet.getString("ma_phieu_ban");
                String khachHang = resultSet.getString("khach_hang");
                String accountId = resultSet.getString("account_id");

                // Thêm dòng mới vào bảng
                phieuTraTableModel.addRow(new Object[]{maPhieuTra, thoiGian, trangThai, maPhieuBan, khachHang, accountId});
            }

            // Đóng kết nối
            JDBCUtil.closeConnection(con);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi làm mới bảng: " + ex.getMessage());
        }
    }//GEN-LAST:event_resetNoteBtn

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
// Kiểm tra dòng được chọn
        int selectedRow = phieuTraTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trong bảng!");
            return;
        }

// Lấy giá trị ID từ dòng được chọn
        String maPhieuTra = phieuTraTable.getValueAt(selectedRow, 0).toString();

        try (Connection con = JDBCUtil.getConnection()) {
            // Bắt đầu transaction
            con.setAutoCommit(false);

            // 1. Cập nhật số lượng sản phẩm trong bảng products
            String updateProductsQuery = "UPDATE products p "
                    + "SET p.quantity = p.quantity + ("
                    + "    SELECT SUM(ct.quantity_returned) "
                    + "    FROM ctphieuban ct "
                    + "    JOIN phieuban pb ON ct.ma_phieu_ban = pb.ma_phieu_ban "
                    + "    WHERE pb.ma_phieu_ban = (SELECT ma_phieu_ban FROM phieu_tra WHERE ma_phieu_tra = ?) "
                    + "    AND ct.ma_san_pham = p.id"
                    + ") "
                    + "WHERE EXISTS ("
                    + "    SELECT 1 "
                    + "    FROM ctphieuban ct "
                    + "    JOIN phieuban pb ON ct.ma_phieu_ban = pb.ma_phieu_ban "
                    + "    WHERE pb.ma_phieu_ban = (SELECT ma_phieu_ban FROM phieu_tra WHERE ma_phieu_tra = ?) "
                    + "    AND ct.ma_san_pham = p.id"
                    + ")";
            try (PreparedStatement updateProducts = con.prepareStatement(updateProductsQuery)) {
                updateProducts.setString(1, maPhieuTra); // Tham số đầu tiên
                updateProducts.setString(2, maPhieuTra); // Tham số thứ hai
                int productRowsUpdated = updateProducts.executeUpdate();

                if (productRowsUpdated == 0) {
                    throw new SQLException("Không có sản phẩm nào được cập nhật.");
                }
            }

            // 2. Thay đổi trạng thái phiếu trả
            String updatePhieuTraQuery = "UPDATE phieu_tra SET trang_thai = 1 WHERE ma_phieu_tra = ?";
            try (PreparedStatement updatePhieuTra = con.prepareStatement(updatePhieuTraQuery)) {
                updatePhieuTra.setString(1, maPhieuTra);
                int rowsUpdated = updatePhieuTra.executeUpdate();

                if (rowsUpdated == 0) {
                    throw new SQLException("Không tìm thấy phiếu trả cần xác nhận.");
                }
            }

            // Commit transaction nếu cả hai bước thành công
            con.commit();
            JOptionPane.showMessageDialog(this, "Xác nhận phiếu trả thành công!");
            // Cập nhật trạng thái trong JTable
            phieuTraTableModel.setValueAt(1, selectedRow, 2); // Giả sử cột trạng thái là cột thứ 2

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(this, "Lỗi khi hoàn tác: " + ex.getMessage());
        }


    }//GEN-LAST:event_confirmBtnActionPerformed

    private void phieuTraTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phieuTraTableMouseClicked
        int selectedRow = phieuTraTable.getSelectedRow();
        boolean isRowSelected = selectedRow >= 0;
        String trangThai = null;
        if (selectedRow != -1) {
            // Get values from the selected row
            trangThai = phieuTraTable.getValueAt(selectedRow, 2).toString();
        }

        int column = phieuTraTable.columnAtPoint(evt.getPoint());
        // Kiểm tra nếu người dùng nhấp vào cột mã phiếu bán
        if (column == 3) { // Giả sử cột mã phiếu bán là cột thứ 3
            String maPhieuBan = phieuTraTable.getValueAt(selectedRow, column).toString();

            SalesInvoiceDetail salesInvoiceDetail = new SalesInvoiceDetail(maPhieuBan, trangThai);
            salesInvoiceDetail.setLocation(this.getX() + 20, this.getY() + 20);
            salesInvoiceDetail.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            salesInvoiceDetail.setVisible(true);
        }

        switch (trangThai) {
            case "0" -> {
                confirmBtn.setEnabled(true);
                killNoteBtn.setEnabled(true);
            }
            case "1" -> {
                confirmBtn.setEnabled(false);
                killNoteBtn.setEnabled(false);
            }
            default -> {
                confirmBtn.setEnabled(false);
                killNoteBtn.setEnabled(false);
            }
        }
    }//GEN-LAST:event_phieuTraTableMouseClicked

    private void detailNoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailNoteBtnActionPerformed
        // Kiểm tra dòng được chọn
        int selectedRow = phieuTraTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trong bảng!");
            return;
        }

        // Lấy giá trị ID từ dòng được chọn
        String id = phieuTraTable.getValueAt(selectedRow, 0).toString();
        String trangThai = phieuTraTable.getValueAt(selectedRow, 2).toString();
        ReturnInvoiceDetail returnInvoiceDetail = new ReturnInvoiceDetail(id, trangThai);
        returnInvoiceDetail.setLocation(this.getX() + 20, this.getY() + 20);
        returnInvoiceDetail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_detailNoteBtnActionPerformed

    private void killNoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_killNoteBtnActionPerformed
// Kiểm tra dòng được chọn
        int selectedRow = phieuTraTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng trong bảng!");
            return;
        }

// Lấy giá trị ID từ dòng được chọn
        String maPhieuTra = phieuTraTable.getValueAt(selectedRow, 0).toString();

        try (Connection con = JDBCUtil.getConnection()) {
            // Bắt đầu transaction
            con.setAutoCommit(false);

            // 1. Thay đổi trạng thái phiếu trả thành 2 (đã hủy)
            String updatePhieuTraQuery = "UPDATE phieu_tra SET trang_thai = 2 WHERE ma_phieu_tra = ?";
            try (PreparedStatement updatePhieuTra = con.prepareStatement(updatePhieuTraQuery)) {
                updatePhieuTra.setString(1, maPhieuTra);
                int rowsUpdated = updatePhieuTra.executeUpdate();

                if (rowsUpdated == 0) {
                    throw new SQLException("Không tìm thấy phiếu trả cần hủy.");
                }
            }

            // 2. Đặt lại returned_quantity về 0 trong bảng ctphieuban
            String resetReturnedQuantityQuery = "UPDATE ctphieuban "
                    + "SET quantity_returned = 0 "
                    + "WHERE ma_phieu_ban = (SELECT ma_phieu_ban FROM phieu_tra WHERE ma_phieu_tra = ?)";
            try (PreparedStatement resetReturnedQuantity = con.prepareStatement(resetReturnedQuantityQuery)) {
                resetReturnedQuantity.setString(1, maPhieuTra);
                int rowsUpdated = resetReturnedQuantity.executeUpdate();

                if (rowsUpdated == 0) {
                    throw new SQLException("Không có sản phẩm nào được đặt lại.");
                }
            }

            // Commit transaction nếu cả hai bước thành công
            con.commit();
            JOptionPane.showMessageDialog(this, "Phiếu trả đã được hủy thành công!");
            // Cập nhật trạng thái trong JTable
            phieuTraTableModel.setValueAt(2, selectedRow, 2); // Giả sử cột trạng thái là cột thứ 2

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi " + ex.getMessage());
        }

    }//GEN-LAST:event_killNoteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerReturnInvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerReturnInvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerReturnInvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerReturnInvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerReturnInvoiceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton detailNoteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton killNoteBtn;
    private javax.swing.JTable phieuTraTable;
    private javax.swing.JButton resetNoteBtn;
    // End of variables declaration//GEN-END:variables
}
