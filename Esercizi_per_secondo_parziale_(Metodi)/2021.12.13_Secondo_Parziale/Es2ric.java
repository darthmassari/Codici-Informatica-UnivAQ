public class Es2ric {
    public static void main(String[] args) {
        String[] a = { "apqpwp", "gwwg", "jxxh", "y", "qq", "rzrr" };
        char[] c = { 'p', 'g', 'x', 'z', 'q', 'r' };
        String[] b = metodo2ric(a, c);
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);

    }

    /*
     * Esercizio 2. Scrivere un metodo statico iterativo che, dati un array
     * monodimensionale di
     * stringhe a ed un array monodimensionale di caratteri c, restituisce un array
     * monodimensio-
     * nale di stringhe b tale che b[i] è la stringa ottenuta da ai] senza le
     * occorrenze del carattere
     * c{i].
     * Esempio: se a = {"apqpwp","gwwg","jxxh","y","qq", "rzrr"} e c =
     * {'p’,'g','x','z','q','r'},
     * il metodo restituisce l'array b = {"aqw","ww","jh","y","","z"}.
     * Si assuma che gli array a e c abbiano lunghezza uguale
     */
    public static String[] metodo2ric(String[] a, char[] c) {
        String[] b = new String[a.length];
        return metodo2ric(a, c, b, 0, 0);
    }

    public static String[] metodo2ric(String[] a, char[] c, String[] b, int i, int j) {
        if (i >= a.length)
            return b;

        if (j >= a[i].length()) {
            return metodo2ric(a, c, b, i + 1, 0);
        }

        if(j==0)
            b[i] = "";

        if (a[i].charAt(j) != c[i]) {
            b[i] += a[i].charAt(j);
        }

        return metodo2ric(a, c, b, i, j + 1);

    }

}