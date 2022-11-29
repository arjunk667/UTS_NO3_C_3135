/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NO3;

/**
 *
 * @author user
 */
public class StudentStaff extends Mahasiswa implements iPendapatan {

    private String Unitkerja;
    private int Jamkerja;

    public void setunitkrj(String unitKrj) {
        Unitkerja = unitKrj;
    }

    public void setjmkrj(int jmKrj) {
        Jamkerja = jmKrj;
    }

    public String getunitKrj() {
        return Unitkerja;
    }

    public int getjmKrj() {
        return Jamkerja;
    }

    @Override
    public double totalPendapatan() {
        return Jamkerja * 300000;
    }
     public void tampildataMHS() {
        System.out.println("=== DATA Studen Staff ===");
        super.tampildataMHS(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Unit Kerja : " + Unitkerja);
        System.out.println("Jam Kerja : " + Jamkerja);
         System.out.println("----------------------");
        System.out.println("Total Pendapatan : " + totalPendapatan());
    }
}
