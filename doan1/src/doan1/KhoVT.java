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
public class KhoVT {
    String IDKho;
    String IDVT;
    String Ten;
    int SL;

    public KhoVT() {
    }

    public KhoVT(String IDKho, String IDVT, int SL) {
        this.IDKho = IDKho;
        this.IDVT = IDVT;
        this.SL = SL;
    }

    public KhoVT(String IDKho, String IDVT, String Ten, int SL) {
        this.IDKho = IDKho;
        this.IDVT = IDVT;
        this.Ten = Ten;
        this.SL = SL;
    }

    public String getIDKho() {
        return IDKho;
    }

    public void setIDKho(String IDKho) {
        this.IDKho = IDKho;
    }

 

    public String getIDVT() {
        return IDVT;
    }

    public void setIDVT(String IDVT) {
        this.IDVT = IDVT;
    }

 

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }
    
}
