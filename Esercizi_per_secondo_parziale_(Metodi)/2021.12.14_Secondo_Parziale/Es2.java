public class Es2 {
    public static void main(String[] args) {
        String[] a = {"aabcda","fhhgf","mkmt","xxy"};
        char [] c = {'a','h','m','z'};
        String[] b = metodo2(a, c);
        for(int i=0; i<b.length; i++)
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

    public static String[] metodo2(String[] a, char[] c) {
        String[] b = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = "";
            
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) == c[i])
                    b[i] = b[i] + '*';
                else
                    b[i] += a[i].charAt(j);
                
            }
        }
        return b;
    }
}
