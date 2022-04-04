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
public class cthdx {
    int IDX;
    String IDKho;
    String IDHDX;
    String IDVT;
    String Ten;
    String DVT;
    String TenKH;
    String SDT;
    String DiaChi;
    String NgayLapHDXuat;
    int SL;
    int SLX;
    int DGX;
    int ThanhTien;

    public cthdx() {
    }

    public cthdx(int IDX, String IDKho, String IDHDX, String IDVT, String Ten, String DVT, String TenKH, String SDT, String DiaChi, String NgayLapHDXuat, int SL, int SLX, int DGX, int ThanhTien) {
        this.IDX = IDX;
        this.IDKho = IDKho;
        this.IDHDX = IDHDX;
        this.IDVT = IDVT;
        this.Ten = Ten;
        this.DVT = DVT;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.NgayLapHDXuat = NgayLapHDXuat;
        this.SL = SL;
        this.SLX = SLX;
        this.DGX = DGX;
        this.ThanhTien = ThanhTien;
    }

    





    public cthdx(int IDX, String IDKho, String IDHDX, int SLX, int DGX) {
        this.IDX = IDX;
        this.IDKho = IDKho;
        this.IDHDX = IDHDX;
        this.SLX = SLX;
        this.DGX = DGX;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public String getIDVT() {
        return IDVT;
    }

    public void setIDVT(String IDVT) {
        this.IDVT = IDVT;
    }
    

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getIDX() {
        return IDX;
    }

    public void setIDX(int IDX) {
        this.IDX = IDX;
    }

    public String getIDKho() {
        return IDKho;
    }

    public void setIDKho(String IDKho) {
        this.IDKho = IDKho;
    }

    public String getIDHDX() {
        return IDHDX;
    }

    public void setIDHDX(String IDHDX) {
        this.IDHDX = IDHDX;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getNgayLapHDXuat() {
        return NgayLapHDXuat;
    }

    public void setNgayLapHDXuat(String NgayLapHDXuat) {
        this.NgayLapHDXuat = NgayLapHDXuat;
    }

    public int getSLX() {
        return SLX;
    }

    public void setSLX(int SLX) {
        this.SLX = SLX;
    }

    public int getDGX() {
        return DGX;
    }

    public void setDGX(int DGX) {
        this.DGX = DGX;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
}