/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmahasiswa_3019;

/**
 *
 * @author Asus
 */
public class Mahasiswa_3019 {
     String nim_3019;
    String nama_3019;
    String Jurusan_3019;
    int ipk_3019;
    
    public Mahasiswa_3019(){
        
    }
    
    public Mahasiswa_3019(String nim_3019, String nama_3019, String Jurusan_3019, int ipk_3019){
        this.nim_3019 = nim_3019;
        this.nama_3019 = nama_3019;
        this.Jurusan_3019 = Jurusan_3019;
        this.ipk_3019 = ipk_3019;
    }
    
    public void tampilDataMhs(){
        System.out.println("nim : " + nim_3019);
        System.out.println("nama: " + nama_3019);
        System.out.println("Jurusan : " + Jurusan_3019);
        System.out.println("ipk : " + ipk_3019);
    }
}
