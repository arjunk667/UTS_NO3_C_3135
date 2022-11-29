/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NO3;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main {
    public static void main(String[] args) throws IOException {
        AssistenPraktikum ap = new AssistenPraktikum();
        StudentStaff st = new StudentStaff();
        System.out.println("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Input Data Asisten Praktkum
        System.out.println("=== Input Data Asisten Praktikum ===");
        System.out.println("NIM : ");
        ap.setnim(br.readLine());
        System.out.println("Nama : ");
        ap.setnama(br.readLine());
        System.out.println("Jurusan : ");
        ap.setjurusan(br.readLine());
        System.out.println("IPK : ");
        ap.setipk(Integer.parseInt(br.readLine()));
        System.out.println("MK Asistensi : ");
        ap.setmkAsistensi(br.readLine());
        System.out.println("Jumlah Pertemuan : ");
        ap.setjmlhPer(Integer.parseInt(br.readLine()));
        
        ap.tampildataMHS();
        
        //inputan Data Student staff
        System.out.println("=== Input Data Student Staff ===");
        System.out.println("NIM : ");
        st.setnim(br.readLine());
        System.out.println("Nama : ");
        st.setnama(br.readLine());
        System.out.println("Jurusan : ");
        st.setjurusan(br.readLine());
        System.out.println("IPK : ");
        st.setipk(Integer.parseInt(br.readLine()));
        System.out.println("Unit Kerja : ");
        st.setunitkrj(br.readLine());
        System.out.println("Jam Kerja : ");
        st.setjmkrj(Integer.parseInt(br.readLine()));
        
        st.tampildataMHS();
    }
}
