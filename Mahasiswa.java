/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isaurahazra21103009.teoripbo.quis1_a_ganjil;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    String nim;
    float ipk;
    String NIK;
    String nama;
    int umur;
    String alamat;
    
    public void tampilDataMahasiswa(){
        tampilDataPenduduk();
        System.out.println("NIM     : "+nim);
        System.out.println("IPK     : "+ipk);
    }
    public void tampilDataBeasiswa(){
        if(ipk > 3.5){
            String nama = null;
            System.out.println("Mahasiswa bernama "+nama+" berhak mendapatkan beasiswa");
        }else{
            String nama = null;
            System.out.println("Mahasiswa bernama "+nama+" tidak berhak mendapatkan beasiswa");
        }
    }

    private void tampilDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
