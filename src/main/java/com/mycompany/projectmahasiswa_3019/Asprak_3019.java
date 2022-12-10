/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmahasiswa_3019;

/**
 *
 * @author Asus
 */
public class Asprak_3019 extends Mahasiswa_3019 implements iPendapatan_3019{
    String MKasistensi_3019;
    int jmlhPertemuan_3019;
    double totalPendapatan_3019;

    public Asprak_3019(){
        
    }
    
    public Asprak_3019(String nim, String nama, String Jurusan, int ipk, 
            String MKasistensi, int jmlhPertemuan){
        super(nim,nama,Jurusan,ipk);
        this.MKasistensi_3019 = MKasistensi_3019;
        this.jmlhPertemuan_3019 = jmlhPertemuan_3019;
        
    }
    
    public void infoAsprak(){
        System.out.println("MKasistensi : " + MKasistensi_3019);
        System.out.println("jmlhPertemuan : " + jmlhPertemuan_3019);
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infoAsprak();
    }
    
    public double totalPendapatan_3019(){
        return totalPendapatan_3019 = (double) (jmlhPertemuan_3019 * 50000);
    }
}
    

