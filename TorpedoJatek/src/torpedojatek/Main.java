/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torpedojatek;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hallgato
 */
public class Main {

    private static void vege() {
        System.out.println("Kifutottál a tippekből. Játék vége!");
    }





    public class Hajo {
        
        Random rnd = new Random();
     
//        pozicio[0] = 

        public Hajo(int elsoHely, int masodikHely, int HarmadikHely) {

            Hajo hajo = new Hajo(2, 3, 4);  
            
             
        }

        int[] pozicio = new int[3];
        String t;
        int tipp;

    }
//    private static void tesztLoves() {
//
//        int poz;
//
//    }

    private static void TorpedoTeszt() {

        String t = "";
        assert t.equals("talalt");

    }

//    public static class Hajo {
//
//        public Hajo(int par, int par1, int par2) {
//
//            Hajo hajo = new Hajo(2, 3, 4);
//            int[] pozicio = new int[3];
//            String t;
//            int tipp;
//
//        }
//    }
    public static void main(String[] args) {

//        tesztLoves();
//        TorpedoTeszt();
        jatekKezd();
//        talalatEll();

    }

        private static void jatekKezd() {
        
//        int mekkoraHajo = 3; 
        int minimum = 0;
        int mezokSzama = 10;
        int[] mezok = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("kezdődik a játék!");
        Scanner sc = new Scanner(System.in);

//        assert tipp >= mezokSzama;
//        int[] hajoPoz= new int[3];
        int  veletlen = (int)((Math.random() * (mezokSzama - minimum)) + minimum);
        int[] hajoHelye = new int[3];
        
//            System.out.println(veletlen);
        
            
        if (veletlen == 0){
//        
//            hajoHelye[0] = mezok[veletlen];
            hajoHelye[0] = 1; //veletlen;
            hajoHelye[1] = 2;//veletlen++;
            hajoHelye[2] = 3;}
        
        if (veletlen == 10){
        
            hajoHelye[0] = 10;//veletlen;
            hajoHelye[1] = 9;//veletlen--;
            hajoHelye[2] = 8;}
        
        else{
            hajoHelye[0] = veletlen;
            hajoHelye[1] = veletlen--;
            hajoHelye[2] = veletlen++;
        }       
            
           
//            System.out.println(hajoHelye[0]);
//            System.out.println(hajoHelye[1]);
//            System.out.println(hajoHelye[2]);
        
       int maxTipp = 3;
       int tippelesSzam = 0;
       int hajoElet = 3;
        
        for (int i = 0; i < maxTipp; i++) {
            

        System.out.println("Add meg a tippet");
        int tipp = sc.nextInt();
        
        if (tippelesSzam == maxTipp){
            
                vege();
            }
        if (hajoElet == 0){
        
            System.out.println("Kilőtted a hajót!");
        }
        
        if (tipp == hajoHelye[i]){
                
                System.out.println("Talált!");
                hajoElet --;
                tippelesSzam --;
                
            
                
            }else{ 
                System.out.println("Mellé!");
                        tippelesSzam++; }
        }
            
        }
        
        
//        talalat();
        
        

    }
    
//    
//    static void talalat(tipp, pozicio, t) {
//        int tipp = 0;
//        int[]pozicio = {2};
//        String t = "";
//        int[] hajo ={} ;
//       int maxTipp = 3;
//       int tippelesSzam = 0;
//       int hajoElet = 3;
//        
//        for (int i = 0; i < maxTipp; i++) {
//            if (tipp == hajoHelye[i]){
//                
//                System.out.println("Talált!");
//                hajoElet --;
//                tippelesSzam ++;
//                
//            if (tippelesSzam == maxTipp){
//            
//                vege();
//            }
//                
//            }else{ 
//                System.out.println("Mellé!");
//                        tippelesSzam++; }
//        }
//            
//        }
        
        
        
//
//        for (int i = 0; i < pozicio.length; i++) {
//
//            if (tipp == hajo[i]) {
//                t += "találat!"
//            }
//
//        }else {
//                    t += "mellé!"}
//
//    }
//
//        private static void talalatEll() {
//        
//            
//            
//    }
//    
//}
