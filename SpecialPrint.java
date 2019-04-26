public class SpecialPrint{
    public static void letraALetra(String frase) {
        letraALetra(frase, 20);
    }
    public static void letraALetra(String frase, int sleep) {
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(frase.charAt(i));
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {}
        }
        System.out.println();
    }
}
