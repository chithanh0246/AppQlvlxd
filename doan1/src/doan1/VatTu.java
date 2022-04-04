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
public class VatTu {
    String IDVT;
    String Ten;
    String DVT;

    public VatTu() {
    }

    public VatTu(String IDVT, String Ten, String DVT) {
        this.IDVT = IDVT;
        this.Ten = Ten;
        this.DVT = DVT;
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

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }
    
}
