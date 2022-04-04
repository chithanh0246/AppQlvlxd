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
public class KhachHang {
    String IDKH;
    String TenKH;
    String DiaChi;
    String SDT;

    public KhachHang() {
    }

    public KhachHang(String IDKH, String TenKH, String DiaChi, String SDT) {
        this.IDKH = IDKH;
        this.TenKH = TenKH;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public String getIDKH() {
        return IDKH;
    }

    public void setIDKH(String IDKH) {
        this.IDKH = IDKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
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
