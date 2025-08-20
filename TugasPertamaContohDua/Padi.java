/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertamaContohDua;

/**
 *
 * @author Huawei
 */
public class Padi extends Tumbuhan {

    /**
     * @return the namaIlmiah
     */
    protected String getNamaIlmiah() {
        return namaIlmiah;
    }

    /**
     * @param namaIlmiah the namaIlmiah to set
     */
    protected void setNamaIlmiah(String namaIlmiah) {
        this.namaIlmiah = namaIlmiah;
    }

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

    private String namaIlmiah;
    private String reproduksi;
    
    public static void main(String[] args) {

        Padi padi = new Padi();
        padi.setBentukTulangDaun("sejajar");
        padi.setBerkambium("tidak berkambium");
        padi.setCaraBernafas("fotosintesis");
        padi.setJenisAkar("serabut");
        padi.setJenisBiji("berbiji tertutup");
        padi.setJumlahKeping(1);
        padi.setJumlahkelopak(3);
        padi.setTempatTumbuh("tanah lembab, biasanya di sawah");
        padi.setWarnaDaun("hijau");
        padi.setJenisKeping("monokotil");
        padi.setNamaIlmiah("Oryza sativa");
        padi.setReproduksi("generatif");

        System.out.println("Padi memiliki nama ilmiah "+ padi.getNamaIlmiah()
                +"\nPadi termasuk tumbuhan " + padi.getJenisBiji()
                +"\nPadi berkembang biak dengan cara "+padi.getReproduksi()
                + "\nWarna daunnya sendiri " + padi.getWarnaDaun()
                + "\nPadi mempunyai jumlah keping " + padi.getJumlahKeping()
                + ", sehingga ia masuk dalam tumbuhan " + padi.getJenisKeping()
                + "\nPadi mempunyai bentuk tulang daun yang " + padi.getBentukTulangDaun()
                + "\nBatang padi " + padi.getBerkambium()
                + "\nPadi mempunyai jumlah kelompak kelipatan " + padi.getJumlahkelopak()
                + "\nPadi sendiri tumbuh di " + padi.getTempatTumbuh()
                + "\nPadi bernafas dengan cara " + padi.getCaraBernafas());
    }
}
