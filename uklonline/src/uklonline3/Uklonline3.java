/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklonline3;

/**
 *
 * @author ASUS
 */
public class Uklonline3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code aplication logic here    
        int nilaisukupertama = 6;
        int selisih = 8;   
        int sisimatriks = 6;
        int deret = nilaisukupertama;
        int total = 0;
        
        for(int i=0;i<sisimatriks;i++){//baris
            for(int j=0; j<=i; j++){//kolom
                System.out.print(deret+"\t");
                deret += selisih;
            }
            System.out.println("");
        }
        
    }
}
    
    

