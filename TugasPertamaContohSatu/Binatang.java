/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertamaContohSatu;

/**
 *
 * @author Huawei
 */
public class Binatang extends MakhlukHidup {

    /**
     * @return the reproduksi
     */
    protected String getReproduksi() {
        return reproduksi;
    }

    /**
     * @param reproduksi the reproduksi to set
     */
    protected void setReproduksi(String reproduksi) {
        this.reproduksi = reproduksi;
    }

    /**
     * @return the jumlahKaki
     */
    protected int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    protected void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    /**
     * @return the jumlahMata
     */
    protected int getJumlahMata() {
        return jumlahMata;
    }

    /**
     * @param jumlahMata the jumlahMata to set
     */
    protected void setJumlahMata(int jumlahMata) {
        this.jumlahMata = jumlahMata;
    }

    /**
     * @return the warnaBulu
     */
    protected String getWarnaBulu() {
        return warnaBulu;
    }

    /**
     * @param warnaBulu the warnaBulu to set
     */
    protected void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    /**
     * @return the caraberjalan
     */
    protected String getCaraberjalan() {
        return caraberjalan;
    }

    /**
     * @param caraberjalan the caraberjalan to set
     */
    protected void setCaraberjalan(String caraberjalan) {
        this.caraberjalan = caraberjalan;
    }

    private int jumlahKaki;
    private int jumlahMata;
    private String warnaBulu;
    private String caraberjalan;
    private String reproduksi;
}
