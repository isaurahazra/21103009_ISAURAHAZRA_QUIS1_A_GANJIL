/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isaurahazra21103009.teoripbo.quis1_a_ganjil;

/**
 *
 * @author Lenovo
 */
public class Dosen {
    String NIDN,gol;
    int gajiPokok,tunjangan;
    double gajitotal;
    String NIK;
    String nama;
    int umur;
    String alamat;
    
    public double totalPendapatan(){
        switch(gol){
            case "IIIA":
                tunjangan = 300000;
            break;
            case "IIIB":
                tunjangan = 500000;
            break;
            case "IIIC":
                tunjangan = 700000;
            break;
        }
        gajitotal = gajiPokok + tunjangan;
        return gajitotal;
    }
    public void tampilDataDosen(){
        tampilDataPenduduk();
        System.out.println("NIDN        : "+NIDN);
        System.out.println("Golongan    : "+gol);
        System.out.println("Gaji Pokok  : "+gajiPokok);
    }

    private void tampilDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

