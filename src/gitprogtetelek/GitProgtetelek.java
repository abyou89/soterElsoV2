
package gitprogtetelek;


public class GitProgtetelek {
    
    public static int[] szamok = {1,4,9,5,6};

    public static void main(String[] args) {
        
        progTetelek();

        
    }

    private static void progTetelek() {
        osszegzes();
    }

    private static void osszegzes() {
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++) {
            osszeg += szamok[i];
        }
        System.out.println("A számok osszege: " + osszeg);
    }
    
}
