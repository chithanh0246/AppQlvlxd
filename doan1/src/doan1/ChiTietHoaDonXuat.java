/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author nguye
 */
public class ChiTietHoaDonXuat extends javax.swing.JFrame {

   private String IDHDX;
    List <cthdx> ctxList=new ArrayList<>();
    DefaultTableModel TableModel;
    public ChiTietHoaDonXuat(String IDHDX) {
        initComponents();
         this.IDHDX=IDHDX;
          TableModel= (DefaultTableModel)tblCTHDX.getModel();
        ShowCTHDX();
        txtIDHDX.setText(IDHDX);
        
    }

    private ChiTietHoaDonXuat() {
        
    }
 private void Tong(){
        DecimalFormat x= new DecimalFormat("###,###,###");
        int Tong=0;
        for(int i=0;i<tblCTHDX.getRowCount();i++){
        Tong +=Integer.parseInt(tblCTHDX.getValueAt(i, 10).toString());
        }
        lblTC.setText(""+x.format(Tong)+" "+"VND");
    }
  private void ThanhTien(int SL,int GN){
        DecimalFormat x= new DecimalFormat("###,###,###");
        int Tong=0;
        Tong=GN*SL;
      
        txtThanhTien.setText(""+x.format(Tong)+" "+"VND");
}
    private void ShowCTHDX(){
     ctxList=Connect.FindCTHDX(this.IDHDX);
        TableModel.setRowCount(0);
       ctxList.forEach((cthdx ctx ) -> {
            TableModel.addRow(new Object []{ctx.getIDX(),ctx.getIDKho(),ctx.getIDHDX(),ctx.getTen(),ctx.getDVT(),ctx.getTenKH(),ctx.getSDT(),ctx.getDiaChi(),ctx.getSLX(),ctx.getDGX(),ctx.getThanhTien(),ctx.getIDVT(),ctx.getSL()});
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCTHDX = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSLX = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDVT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDGX = new javax.swing.JTextField();
        txtIDKho = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTenVT = new javax.swing.JTextField();
        txtIDX = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIDHDX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnTT = new javax.swing.JButton();
        txtTenKH = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtIDVT = new javax.swing.JTextField();
        txtSLKho = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTC = new javax.swing.JLabel();
        btnTC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCTHDX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chi  tiết hóa đơn", "Mã kho", "Mã hóa đơn xuất", "Tên vật tư", "Đơn vị tính ", "Tên khách hàng", "Số điện thoại", "Địa chỉ", "Số lượng xuất", "Đơn giá xuất", "Thành Tiền", "Mã Vật Tư", "SLKho"
            }
        ));
        tblCTHDX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTHDXMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCTHDX);

        jButton5.setText("Quay Lại");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("Chi Tiết Hóa Đơn Xuất");

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel6.setText("Mã Kho ");

        jLabel7.setText("Số Lượng Xuất");

        jLabel8.setText("Đơn Vị Tính ");

        txtDVT.setEditable(false);

        jLabel9.setText("Đơn Giá Xuất");

        jLabel11.setText("Tên Vật Tư");

        txtTenVT.setEditable(false);

        jLabel1.setText("Mã Chi Tiết Hóa Đơn Xuất");

        txtIDHDX.setEditable(false);

        txtThanhTien.setEditable(false);

        jLabel4.setText("Mã Hóa Đơn Xuất");

        btnTT.setText("Thành tiền");
        btnTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTActionPerformed(evt);
            }
        });

        txtTenKH.setEditable(false);

        jLabel10.setText("Tên Khách Hàng");

        txtDiaChi.setEditable(false);

        jLabel12.setText("Địa chỉ");

        txtSDT.setEditable(false);

        jLabel13.setText("Số Điện Thoại");

        txtIDVT.setEditable(false);

        txtSLKho.setEditable(false);

        jLabel14.setText("Số lượng kho");

        jLabel3.setText("Mã vật tư");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 368, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(387, 387, 387))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTenVT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDKho, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(txtIDX)
                    .addComponent(txtDVT))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSLX, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addComponent(txtDGX))
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(299, 299, 299)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIDHDX)
                                        .addComponent(txtIDVT))
                                    .addGap(76, 76, 76))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtSLKho, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtSDT)
                                    .addGap(62, 62, 62)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnTT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDGX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtIDHDX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIDVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIDKho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtSLX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(jLabel6))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnSua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTT)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtTenVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(txtDVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                    .addComponent(txtSLKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        lblTC.setText("Tổng cộng");

        btnTC.setText("Tổng cộng");
        btnTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTC)
                                .addGap(18, 18, 18)
                                .addComponent(lblTC)
                                .addGap(54, 54, 54))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTC)
                    .addComponent(btnTC))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCTHDXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTHDXMouseClicked
        DecimalFormat x= new DecimalFormat("###,###,###");
        int i = tblCTHDX.getSelectedRow();
        TableModel model=tblCTHDX.getModel();
        txtIDX.setText(model.getValueAt(i,0).toString());
        txtIDKho.setText(model.getValueAt(i,1).toString());
        txtIDHDX.setText(model.getValueAt(i,2).toString());
        txtTenVT.setText(model.getValueAt(i, 3).toString());
        txtDVT.setText(model.getValueAt(i, 4).toString());
        txtTenKH.setText(model.getValueAt(i,5).toString());
        txtSDT.setText(model.getValueAt(i, 6).toString());
        txtDiaChi.setText(model.getValueAt(i, 7).toString());
        txtSLX.setText(model.getValueAt(i, 8).toString());
        txtDGX.setText(model.getValueAt(i, 9).toString());
        txtThanhTien.setText(""+x.format(model.getValueAt(i,10))+" "+"VND");
        txtIDVT.setText(model.getValueAt(i, 11).toString());
        txtSLKho.setText(model.getValueAt(i, 12).toString());
    }//GEN-LAST:event_tblCTHDXMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedIndex=  tblCTHDX.getSelectedRow();
        if(selectedIndex>=0){
            cthdx ctx= ctxList.get(selectedIndex);
            int option = JOptionPane.showConfirmDialog(this,"Bạn muốn xóa chi tiết  Hóa Đơn Xuất?");
            System.out.println("option:"+option);
            if(option==0){
                Connect.deleteCTHDX(ctx.getIDX());
                ShowCTHDX();
            }
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int ID = Integer.parseInt(txtIDX.getText());
        String IDVT=txtIDKho.getText();
        String IDHDN=txtIDHDX.getText();
        int SLN=Integer.parseInt(txtSLX.getText());
        int GiaNhap=Integer.parseInt(txtDGX.getText());
        cthdx ctx=new cthdx(ID,IDVT,IDHDN,SLN,GiaNhap);
        Connect.updateCTHDX(ctx);
        ShowCTHDX();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int IDX=Integer.parseInt(txtIDX.getText());
        String IDKho=txtIDKho.getText();
        String IDHDX=txtIDHDX.getText();
        int SLX=Integer.parseInt(txtSLX.getText());
        int DGX=Integer.parseInt(txtDGX.getText());
        cthdx ctx=new cthdx(IDX,IDKho,IDHDX,SLX,DGX);
        Connect.insertCTHDX(ctx);
        ShowCTHDX();

    }//GEN-LAST:event_btnThemActionPerformed
private int tru(int a,int b){
    int Tru=0;
    Tru=a-b;
    return Tru;
}
    private void btnTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTActionPerformed
        int SLX=Integer.parseInt(txtSLX.getText());
        int DGX=Integer.parseInt(txtDGX.getText());
        ThanhTien(SLX,DGX);
        String IDKho=txtIDKho.getText();
        String IDVT=txtIDVT.getText();
        int a=Integer.parseInt(txtSLKho.getText());
        int b =Integer.parseInt(txtSLX.getText());
        int SL=tru(a,b);
        KhoVT k = new KhoVT(IDKho,IDVT,SL);
        Connect.updateKho(k);
    }//GEN-LAST:event_btnTTActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        HoaDonXuat hdx =new HoaDonXuat();
        hdx.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTCActionPerformed
       Tong();
    }//GEN-LAST:event_btnTCActionPerformed
    
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
            java.util.logging.Logger.getLogger(ChiTietHoaDonXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDonXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChiTietHoaDonXuat().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTC;
    private javax.swing.JButton btnTT;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTC;
    private javax.swing.JTable tblCTHDX;
    private javax.swing.JTextField txtDGX;
    private javax.swing.JTextField txtDVT;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtIDHDX;
    private javax.swing.JTextField txtIDKho;
    private javax.swing.JTextField txtIDVT;
    private javax.swing.JTextField txtIDX;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSLKho;
    private javax.swing.JTextField txtSLX;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenVT;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}
