/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmahasiswa_3019;

/**
 *
 * @author Asus
 */
public class StudentStaff_3019 extends Mahasiswa_3019 implements iPendapatan_3019 {

    int unitKerja_3019;
    int jamKerja_3019;
    double totalPendapatan_3019;

    public StudentStaff_3019() {

    }

    public StudentStaff_3019(String nim, String nama, String Jurusan, int ipk,
            int unitKerja, int jamKerja) {
        super(nim, nama, Jurusan, ipk);
        this.unitKerja_3019 = unitKerja_3019;
        this.jamKerja_3019 = jamKerja_3019;
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infostuden();
    }
    
    public void infostuden(){
        System.out.println("unitKerja : " + unitKerja_3019);
        System.out.println("jamKerja : " + jamKerja_3019);
    }

    
    public double totalPendapatan_3019() {
        return totalPendapatan_3019 = (int) (jamKerja_3019 * 30000);
    }
}

    

