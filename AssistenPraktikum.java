/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NO3;

/**
 *
 * @author user
 */
public class AssistenPraktikum extends Mahasiswa implements iPendapatan {

    private String mkAsistensi;
    private int jmlPertemuan;
    
    public AssistenPraktikum()
    {
        super.Mahasiswa();
        this.mkAsistensi = mkAsistensi;
        this.jmlPertemuan = jmlPertemuan;
    }

    public void setmkAsistensi(String mka) {
        mkAsistensi = mka;
    }

    public void setjmlhPer(int jmlP) {
        jmlPertemuan = jmlP;
    }

    public String getmkasistensi() {
        return mkAsistensi;
    }

    public int getjmlhPer() {
        return jmlPertemuan;
    }

    @Override
    public double totalPendapatan() {
        return jmlPertemuan * 50000;
    }

    @Override
    public void tampildataMHS() {
        System.out.println("=== DATA ASISTEN PRAKTIKUM ===");
        super.tampildataMHS(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("MK Asistensi : " + mkAsistensi);
        System.out.println("Jumlah Pertemuan : " + jmlPertemuan);
        System.out.println("----------------------------------");
        System.out.println("Total Pendapatan : " + totalPendapatan());
    }
}
