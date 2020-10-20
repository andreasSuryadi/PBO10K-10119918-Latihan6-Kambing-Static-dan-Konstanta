/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPBO6;

/**
 *
 * @author andreas
 */
public class KambingStatic {
    
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
