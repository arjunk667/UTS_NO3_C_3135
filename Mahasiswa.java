/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NO3;

/**
 *
 * @author user
 */
public class Mahasiswa {

    protected String NIM, Nama, Jurusan;
    protected int IPK;
    public void Mahasiswa(){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Jurusan = Jurusan;
        this.IPK = IPK;
    }

    public void setnim(String nim) {
        NIM = nim;
    }

    public void setnama(String nama) {
        Nama = nama;
    }

    public void setjurusan(String jurusan) {
        Jurusan = jurusan;
    }

    public void setipk(int ipk) {
        IPK = ipk;
    }

    public String getnim() {
        return NIM;
    }

    public String getnama() {
        return Nama;
    }

    public String getjurusan() {
        return Jurusan;
    }

    public int getipk() {
        return IPK;
    }
    public void tampildataMHS(){
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("jurusan : " + Jurusan);
        System.out.println("IPK : " + IPK);
    }
}
