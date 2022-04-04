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
public class HangTon {
    private String IDKho,Ten;
    private int SL;

    public HangTon() {
    }

    public HangTon(String IDKho, String Ten, int SL) {
        this.IDKho = IDKho;
        this.Ten = Ten;
        this.SL = SL;
    }

    public String getIDKho() {
        return IDKho;
    }

    public void setIDKho(String IDKho) {
        this.IDKho = IDKho;
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
