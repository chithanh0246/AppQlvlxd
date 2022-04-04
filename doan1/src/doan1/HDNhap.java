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
public class HDNhap {
    String IDHDN;
    String IDNCC;
    String IDNV;
    String TenNCC;
    String NgayLapHD;
    String TenNV;

    public HDNhap(String IDHDN, String IDNCC, String IDNV, String NgayLapHD) {
        this.IDHDN = IDHDN;
        this.IDNCC = IDNCC;
        this.IDNV = IDNV;
        this.NgayLapHD = NgayLapHD;
    }

    public HDNhap() {
    }

    public HDNhap(String IDHDN, String IDNCC, String IDNV, String TenNCC, String NgayLapHD, String TenNV) {
        this.IDHDN = IDHDN;
        this.IDNCC = IDNCC;
        this.IDNV = IDNV;
        this.TenNCC = TenNCC;
        this.NgayLapHD = NgayLapHD;
        this.TenNV = TenNV;
    }

    public String getNgayLapHD() {
        return NgayLapHD;
    }

    public void setNgayLapHD(String NgayLapHD) {
        this.NgayLapHD = NgayLapHD;
    }

  

    public String getIDNCC() {
        return IDNCC;
    }

    public void setIDNCC(String IDNCC) {
        this.IDNCC = IDNCC;
    }

    public String getIDNV() {
        return IDNV;
    }

    public void setIDNV(String IDNV) {
        this.IDNV = IDNV;
    }

   

    public String getIDHDN() {
        return IDHDN;
    }

    public void setIDHDN(String IDHDN) {
        this.IDHDN = IDHDN;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

  

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }
    
}
