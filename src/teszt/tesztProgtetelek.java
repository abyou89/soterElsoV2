
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
        
    }

    private static void maximumKivalasztasTeszt() {
       
    }

    private static void minimumKivalasztasTeszt() {
        
    }

    private static void vanLegalabbEgyTeszt() {
        
    }

    private static void mindTeszt() {
       
    }

    private static void kivalasztasTeszt() {
        
    }

    private static void linearisKeresesTeszt() {
       
    }
}
