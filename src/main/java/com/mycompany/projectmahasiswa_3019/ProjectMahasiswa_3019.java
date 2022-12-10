/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectmahasiswa_3019;

/**
 *
 * @author Asus
 */
public class ProjectMahasiswa_3019 {

    public static void main(String[] args) {
        Asprak_3019 A = new Asprak_3019("21121", "aliefino", "Sistem Informasi", 3, "PBO", 19);
        A.tampilDataMhs();
        System.out.println("Total : " + A.totalPendapatan_3019());
        System.out.println("");

        StudentStaff_3019 B = new StudentStaff_3019("121212", "hermawan", "Sistem Informasi", 4, 2, 8);
        B.tampilDataMhs();
        System.out.println("Total : " + B.totalPendapatan_3019());
        System.out.println("");
    }
}
