/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertamaContohSatu;

/**
 *
 * @author Huawei
 */
public class Paus extends Binatang {

    /**
     * @return the komunikasi
     */
    protected String getKomunikasi() {
        return komunikasi;
    }

    /**
     * @param komunikasi the komunikasi to set
     */
    protected void setKomunikasi(String komunikasi) {
        this.komunikasi = komunikasi;
    }

    /**
     * @return the kemampuan
     */
    protected String getKemampuan() {
        return kemampuan;
    }

    /**
     * @param kemampuan the kemampuan to set
     */
    protected void setKemampuan(String kemampuan) {
        this.kemampuan = kemampuan;
    }

    /**
     * @return the frekuensi
     */
    protected String getFrekuensi() {
        return frekuensi;
    }

    /**
     * @param frekuensi the frekuensi to set
     */
    protected void setFrekuensi(String frekuensi) {
        this.frekuensi = frekuensi;
    }

    private String komunikasi;
    private String kemampuan;
    private String frekuensi;

    public static void main(String[] args) {

        Paus paus = new Paus();
        paus.setCaraBernafas("paru-paru");
        paus.setJumlahKaki(0);
        paus.setJumlahMata(2);
        paus.setCaraberjalan("berenang");
        paus.setReproduksi("vivipar (melahirkan)");
        paus.setTempatTumbuh("air");
        paus.setWarnaBulu("Berkulit biru tua");
        paus.setFrekuensi("Rendah");
        paus.setKemampuan("Ekolokasi");
        paus.setKomunikasi("Lewat Nyanyian");

        System.out.println("Paus bernafas menggunakan: " + paus.getCaraBernafas()
                + "\nPaus mempunyai kaki berjumlah: " + paus.getJumlahKaki()
                + "\nPaus mempunyai mata berjumlah: " + paus.getJumlahMata()
                + "\nPaus bergerak dengan cara: " + paus.getCaraberjalan()
                + "\nPaus bereproduksi dengan cara: " + paus.getReproduksi()
                + "\nPaus tumbuh di: " + paus.getTempatTumbuh()
                + "\nPaus mempunyai tidak mempunyai bulu, namun " + paus.getWarnaBulu()
                + "\nPaus mempunyai kemampuan " + paus.getKemampuan() + " yang baik"
                + "\nPaus memiliki frekuensi suara yang " + paus.getFrekuensi()
                + "\nPaus berkomunikasi dengan sesamanya " + paus.getKomunikasi());
    }

}
