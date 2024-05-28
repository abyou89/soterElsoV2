
package gitprogtetelek;


public class GitProgtetelek {
    
    public static int[] szamok = {1,4,9,5,6};

    public static void main(String[] args) {
        szamokTombKiir();
        progTetelek();
        maximumKivalasztas();
        minimumKivalasztas();

        
    }
    
    private static void progTetelek() {
        osszegzes();
        megszamlalas();
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
    
}
