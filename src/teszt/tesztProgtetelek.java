
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
        assert maxIndex == 2 : "Hiba, a legnagyobb elem nem a 2. helyen szerepel";
    }

    private static void minimumKivalasztasTeszt() {
        int minIndex = 0;
        for (int i = 0; i < szamokTeszt.length; i++) {
            if(szamokTeszt[i] < szamokTeszt[minIndex]){
                minIndex = i;
            }
        }
        System.out.println("A sorozat legkisebb eleme: " + szamokTeszt[minIndex]);
        System.out.println("A legkisebb elem helye: " + minIndex);
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
