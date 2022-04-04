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
public class cthdn {
    int ID;
    String IDVT;
    String IDHDN;
    String Ten;
    String DVT;
    String NgayNhap;
    int SLN;
    int GiaNhap;
    int ThanhTien;

    public cthdn() {
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }
    

    public int getID() {
        return ID;
    }

    public String getIDVT() {
        return IDVT;
    }

    public String getIDHDN() {
        return IDHDN;
    }

    public String getTen() {
        return Ten;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public int getSLN() {
        return SLN;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIDVT(String IDVT) {
        this.IDVT = IDVT;
    }

    public void setIDHDN(String IDHDN) {
        this.IDHDN = IDHDN;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public void setSLN(int SLN) {
        this.SLN = SLN;
    }

    public void setGiaNhap(int GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public cthdn(int ID, String IDVT, String IDHDN, String Ten, String DVT, String NgayNhap, int SLN, int GiaNhap, int ThanhTien) {
        this.ID = ID;
        this.IDVT = IDVT;
        this.IDHDN = IDHDN;
        this.Ten = Ten;
        this.DVT = DVT;
        this.NgayNhap = NgayNhap;
        this.SLN = SLN;
        this.GiaNhap = GiaNhap;
        this.ThanhTien = ThanhTien;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public cthdn(int ID, String IDVT, String IDHDN, int SLN, int GiaNhap) {
        this.ID = ID;
        this.IDVT = IDVT;
        this.IDHDN = IDHDN;
        this.SLN = SLN;
        this.GiaNhap = GiaNhap;
    }


    
}
