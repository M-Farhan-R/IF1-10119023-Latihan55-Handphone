/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan55.handphone;

/**
 *
 * @author Muhammad Farhan R <farhan.10119023@mahasiswa.email.ac.id>
 */
public class Handphone {
    protected String manufacture,operatingSystem,model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        manufacture = man;
        operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
            System.out.println("Manufacture : "+manufacture);
            System.out.println("OS : "+operatingSystem);
            System.out.println("Model : "+model);
            System.out.println("Harga : "+harga);
    }
}
