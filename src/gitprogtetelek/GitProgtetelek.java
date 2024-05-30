
package gitprogtetelek;


public class GitProgtetelek {
    
    public static int[] szamok = {1,4,9,5,6};

    public static void main(String[] args) {
        szamokTombKiir();
        progTetelek();
    }
    
    private static void progTetelek() {
        progtetelElsoNegy();
        progtetelUtolsoNegy();
    }

    private static void progtetelElsoNegy() {
        osszegzes();
        megszamlalas();
        maximumKivalasztas();
        minimumKivalasztas();
    }
    private static void progtetelUtolsoNegy() {
        vanLegalabbEgy();
        mind();
        kivalasztas();
        linearisKereses();
    }
    
    private static void szamokTombKiir() {
        System.out.print("A tomb elemei: ");
        for (int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + " ");
        }
        System.out.println("");
    }

    private static void osszegzes() {
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++) {
            osszeg += szamok[i];
        }
        System.out.println("A szamok osszege: " + osszeg);
    }

    private static void megszamlalas() {
        int darab = 0;
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] % 2 == 0){
                darab++;
            }
        }
        System.out.println("Paros elemek szama: " + darab);
    }

    private static void maximumKivalasztas() {
        int maxIndex = 0;
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] > szamok[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println("A sorozat legnagyobb eleme: " + szamok[maxIndex]);
        System.out.println("A legnagyobb elem helye: " + maxIndex);
    }

    private static void minimumKivalasztas() {
        int minIndex = 0;
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] < szamok[minIndex]){
                minIndex = i;
            }
        }
        System.out.println("A sorozat legkisebb eleme: " + szamok[minIndex]);
        System.out.println("A legkisebb elem helye: " + minIndex);
    
    }

    private static void vanLegalabbEgy() {
        int ker = 5;
        int i = 0;
        while(i < szamok.length && !(szamok[i] > ker)){
            i++;
        }
        boolean valasz = i < szamok.length;  
        if(valasz){
            System.out.println("Van 5-nel nagyobb a sorozatban");
        }else 
            System.out.println("Nincs 5-nel nagyobb a sorozatban");
    }    

    private static void mind() {
        int ker = 0;
        int i = 0;
        while(i < szamok.length && szamok[i] > ker){
            i++;
        }
        boolean valasz = i >= szamok.length; 
        if(valasz){
            System.out.printf("Minden elem nagyobb mint %d\n",ker);
        }else
            System.out.printf("Nem minden elem nagyobb mint %d\n",ker);
    }

    private static void kivalasztas() {
        int ker = 5;
        int i = 0;
        while(i < szamok.length && !(szamok[i] == ker)){
            i++;
        }
        boolean valasz = i < szamok.length; 
        if(valasz){
            System.out.printf("A sorozatban van %d\n",ker);
        }else
            System.out.printf("A sorozatban nincs %d\n",ker);
    
    }

    private static void linearisKereses() {
        int ker = 8;
        int i = 0;
        while(i < szamok.length && !(szamok[i] > ker)){
            i++;
        }
        boolean van = i < szamok.length;  
        /* kiválasztás: */
        if(van){
            System.out.printf("A keresett elem nagyobb mint %d\n",ker);
            System.out.println("helye: " + i);
            System.out.println("erteke: " + szamok[i]);
        }else{
            System.out.printf("nincs a keresesnek megfelelo elem (%d)\n",ker);
            System.out.println("Nincs nagyobb mint " + ker);
        }
    }  
}
