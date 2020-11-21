/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan55.handphone;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R <farhan.10119023@mahasiswa.email.ac.id> 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : 
 *
 */
public class IF110119023Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Handphone[] hp = new Handphone[3];
        hp[0] = new Android("Samsung","Android","Grand",3_000_000);
        hp[1] = new BlackBerry("BlackB","RIM","Curve",2_000_000);
        hp[2] = new WindowsPhone("Nokia","Win8","Lumia",1_000_000);
        
        //memanggil method dalam subclass dengan polymorphism
        //((class)polymorphVariable)
        ((Android)hp[0]).setKeyStore("234ibfd3840fo");
        ((BlackBerry)hp[1]).setPinBB("BHS249");
        ((WindowsPhone)hp[2]).setWpKeyStore("UUUQIJWORJ");
        
        String[] a = new String[3];
        a[0] = "Android Key Store : "+((Android)hp[0]).getKeyStore();
        a[1] = "PIN : "+((BlackBerry)hp[1]).getPinBB();
        a[2] = "Wp Key Store : "+((WindowsPhone)hp[2]).getWpKeyStore();
        
        
        for (int i = 0;i < hp.length;i++){
            hp[i].displayProduct();
            System.out.println(a[i]+"\n");
        }

    }
}
