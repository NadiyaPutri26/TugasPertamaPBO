/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertamaContohTiga;

/**
 *
 * @author Huawei
 */
public class Singa extends Hewan {

    /**
     * @return the famili
     */
    protected String getFamili() {
        return famili;
    }

    /**
     * @param famili the famili to set
     */
    protected void setFamili(String famili) {
        this.famili = famili;
    }

    /**
     * @return the julukan
     */
    protected String getJulukan() {
        return julukan;
    }

    /**
     * @param julukan the julukan to set
     */
    protected void setJulukan(String julukan) {
        this.julukan = julukan;
    }

    private String julukan;
    private String famili;

    public static void main(String[] args) {
        Singa singa = new Singa();
        singa.setCaraBernafas("paru-paru");
        singa.setJenisMakanan("karnivora");
        singa.setJumlahKaki(4);
        singa.setJumlahMata(2);
        singa.setKelompok("mamalia");
        singa.setReproduksi("vivipar (melahirkan)");
        singa.setTempatTumbuh("alam liar");
        singa.setTulangBelakang("vertebrata");
        singa.setJulukan("Raja Hutan");
        singa.setFamili("kucing");

        System.out.println("Singa termasuk dalam hewan " + singa.getTulangBelakang()
                + "\nSinga masuk dalam kelompok " + singa.getKelompok()
                + "\nSinga satu famili dengan " + singa.getFamili()
                + "\nSinga memiliki julukan " + singa.getJulukan()
                + "\nSinga memiliki kaki berjumlah " + singa.getJumlahKaki()
                + "\nSinga memiliki mata berjumlah " + singa.getJumlahMata()
                + "\nSinga sering ditemui di " + singa.getTempatTumbuh()
                + "\nSinga bernafas menggunakan " + singa.getCaraBernafas()
                + "\nSinga bereproduksi dengan cara " + singa.getReproduksi()
                + "\nSinga masuk dalam hewan " + singa.getJenisMakanan());
    }
}
