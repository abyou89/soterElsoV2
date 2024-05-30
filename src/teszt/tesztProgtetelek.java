
package teszt;

import gitprogtetelek.GitProgtetelek;

public class tesztProgtetelek {
    
    static int[] szamokTeszt = GitProgtetelek.szamok;
            
    public static void main(String[] args) {
        progtetelekTeszt();
    }

    private static void progtetelekTeszt() {
        progTetelElsoNegyTeszt();
        progTetelUtolsoNegyTeszt();
    }

    private static void progTetelElsoNegyTeszt() {
        osszegzesTeszt();
        megszamlalasTeszt();
        maximumKivalasztasTeszt();
        minimumKivalasztasTeszt();
    
    }

    private static void progTetelUtolsoNegyTeszt() {
        vanLegalabbEgyTeszt();
        mindTeszt();
        kivalasztasTeszt();
        linearisKeresesTeszt();
    
    }

    private static void osszegzesTeszt() {
        int osszeg = 0;
        for (int i = 0; i < szamokTeszt.length; i++) {
            osszeg += szamokTeszt[i];
        }
        assert osszeg == 25 : "Hiba, a tomb elemeinek osszege nem 25";
    }

    private static void megszamlalasTeszt() {
        int darab = 0;
        for (int i = 0; i < szamokTeszt.length; i++) {
            if(szamokTeszt[i] % 2 == 0){
                darab++;
            }
        }
        assert darab == 2 : "Hiba, a paros elemek szama nem 2";
    }

    private static void maximumKivalasztasTeszt() {
       int maxIndex = 0;
        for (int i = 0; i < szamokTeszt.length; i++) {
            if(szamokTeszt[i] > szamokTeszt[maxIndex]){
                maxIndex = i;
            }
        }
        assert maxIndex == 2 : "Hiba, a legnagyobb elem nem a 2. helyen van";
    }

    private static void minimumKivalasztasTeszt() {
        int minIndex = 0;
        for (int i = 0; i < szamokTeszt.length; i++) {
            if(szamokTeszt[i] < szamokTeszt[minIndex]){
                minIndex = i;
            }
        }
        assert minIndex == 0 : "Hiba, a legkisebb elem nem a 0. helyen van";
    }

    private static void vanLegalabbEgyTeszt() {
        int ker = 5;
        int i = 0;
        while(i < szamokTeszt.length && !(szamokTeszt[i] > ker)){
            i++;
        }
        boolean valasz = i < szamokTeszt.length;  
        assert valasz == true : "Hiba, nincs 5-nel nagyobb elem a srozatban";
    }

    private static void mindTeszt() {
       int ker = 0;
       int i = 0;
       while(i < szamokTeszt.length && szamokTeszt[i] > ker){
           i++;
       }
       boolean valasz = i >= szamokTeszt.length; 
       assert valasz == true : "Hiba, nem minden elem nagyobb mint 0";
    }

    private static void kivalasztasTeszt() {
        int ker = 5;
        int i = 0;
        while(i < szamokTeszt.length && !(szamokTeszt[i] == ker)){
            i++;
        }
        boolean valasz = i < szamokTeszt.length; 
        assert valasz == true : "Hiba, A sorozatban nem szerepel 5";
    }

    private static void linearisKeresesTeszt() {
       int ker = 8;
        int i = 0;
        while(i < szamokTeszt.length && !(szamokTeszt[i] > ker)){
            i++;
        }
        boolean van = i < szamokTeszt.length;  
        assert van == true : "Hiba, nincs a sorozatban a keresett elemnél nagyobb";
    }
}
