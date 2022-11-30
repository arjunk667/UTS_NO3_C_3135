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
        //pembuatan objek dalam array
        AssistenPraktikum[] ap = new AssistenPraktikum[4];
        ap[0] = new AssistenPraktikum();
        ap[1] = new AssistenPraktikum();
        ap[2] = new AssistenPraktikum();
        ap[3] = new AssistenPraktikum();

        StudentStaff[] st = new StudentStaff[4];
        st[0] = new StudentStaff();
        st[1] = new StudentStaff();
        st[2] = new StudentStaff();
        st[3] = new StudentStaff();
        System.out.println("");
        //Pembuatan objek Bufferedreader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Input Data 
        for (int i = 1; i <= 3; i++) {
        //Input Data Asisten Praktkum melalui array
            System.out.println("Assisten Praktikum Ke : " + i);
            System.out.println("=== Input Data Asisten Praktikum ===");
            System.out.println("NIM : ");
            ap[i].setnim(br.readLine());
            System.out.println("Nama : ");
            ap[i].setnama(br.readLine());
            System.out.println("Jurusan : ");
            ap[i].setjurusan(br.readLine());
            System.out.println("IPK : ");
            ap[i].setipk(Integer.parseInt(br.readLine()));
            System.out.println("MK Asistensi : ");
            ap[i].setmkAsistensi(br.readLine());
            System.out.println("Jumlah Pertemuan : ");
            ap[i].setjmlhPer(Integer.parseInt(br.readLine()));
        //inputan Data Student staff melalui array
            System.out.println("Student Staff Ke - " + i);
            System.out.println("=== Input Data Student Staff ===");
            System.out.println("NIM : ");
            st[i].setnim(br.readLine());
            System.out.println("Nama : ");
            st[i].setnama(br.readLine());
            System.out.println("Jurusan : ");
            st[i].setjurusan(br.readLine());
            System.out.println("IPK : ");
            st[i].setipk(Integer.parseInt(br.readLine()));
            System.out.println("Unit Kerja : ");
            st[i].setunitkrj(br.readLine());
            System.out.println("Jam Kerja : ");
            st[i].setjmkrj(Integer.parseInt(br.readLine()));
        }
        //Menampilkan Data 
        for (int i = 1; i <= 3; i++) {
        //Tampil Data Asisten Praktikum
            System.out.println("Data Assisten Praktikum Ke - " + i);
            ap[i].tampildataMHS();
        //Tampil Data Student Staff
            System.out.println("Data Student Staff Ke - " + i);
            st[i].tampildataMHS();
        }

    }
