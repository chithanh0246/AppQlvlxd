/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan1;

/**
 *
 * @author nguye
 */
public class NhaCungCap {
    String IDNCC;
    String TenNCC;
    String DiaChi;
    String SDT;

    public NhaCungCap() {
    }

    public NhaCungCap(String IDNCC, String TenNCC, String DiaChi, String SDT) {
        this.IDNCC = IDNCC;
        this.TenNCC = TenNCC;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public String getIDNCC() {
        return IDNCC;
    }

    public void setIDNCC(String IDNCC) {
        this.IDNCC = IDNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
}
