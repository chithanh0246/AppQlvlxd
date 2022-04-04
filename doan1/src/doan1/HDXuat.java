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
public class HDXuat {
    String IDHDX;
    String IDKH;
    String IDNV;
    String TenKH;
    String TenNV;
    String NgayLapHDXuat;

    public HDXuat() {
    }

    public HDXuat(String IDHDX, String IDKH, String IDNV, String TenKH, String TenNV, String NgayLapHDXuat) {
        this.IDHDX = IDHDX;
        this.IDKH = IDKH;
        this.IDNV = IDNV;
        this.TenKH = TenKH;
        this.TenNV = TenNV;
        this.NgayLapHDXuat = NgayLapHDXuat;
    }

    public HDXuat(String IDHDX, String IDKH, String IDNV, String NgayLapHDXuat) {
        this.IDHDX = IDHDX;
        this.IDKH = IDKH;
        this.IDNV = IDNV;
        this.NgayLapHDXuat = NgayLapHDXuat;
    }

    public String getIDHDX() {
        return IDHDX;
    }

    public void setIDHDX(String IDHDX) {
        this.IDHDX = IDHDX;
    }

    public String getIDKH() {
        return IDKH;
    }

    public void setIDKH(String IDKH) {
        this.IDKH = IDKH;
    }

    public String getIDNV() {
        return IDNV;
    }

    public void setIDNV(String IDNV) {
        this.IDNV = IDNV;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getNgayLapHDXuat() {
        return NgayLapHDXuat;
    }

    public void setNgayLapHDX(String NgayLapHDXuat) {
        this.NgayLapHDXuat = NgayLapHDXuat;
    }
    
}
