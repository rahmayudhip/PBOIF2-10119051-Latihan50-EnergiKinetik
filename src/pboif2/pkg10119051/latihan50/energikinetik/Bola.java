/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan50.energikinetik;

/**
 *
 * @author RYP
 */
class Bola {
    private int massa;
    private int kecepatan;
    
    public Bola(int massa, int kecepatan){
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    public int getMassa() {
        return massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    
    private double hitungEnergiKinetik(int parMassa, int parKecepatan){
        return 0.5 * parMassa * Math.pow(parKecepatan, 2);
    }
    
    private double hitungUsaha(int parMassa, int parKecepatan){
        double ekAwal = 0;
        double ekAkhir = hitungEnergiKinetik(parMassa, parKecepatan);
        return ekAkhir - ekAwal;
    }
    
    public void tampilData(int parMassa, int parKecepatan){
        System.out.println("Diketahui sebuah bola baseball dengan :");
        System.out.println("Massa       : "+parMassa+" gram");
        System.out.println("Kecepatan   : "+parKecepatan+" m/s");
        System.out.println("");
        System.out.println("Energi Kinetik : "+hitungEnergiKinetik(parMassa, parKecepatan)+" J");
        System.out.println("Usaha yang dilakukan untuk mencapai kecepatan : "+hitungUsaha(parMassa, parKecepatan)+" J");
    }
}
