public class Es6 {

    public static void main(String[] args) {
        String[][] a = { { "anna", "lea", "liliana" }, { "mario", "paolo" }, { "enrica", "luca", "ugo", "laura" } };
        int[] b = { 5, 3, 4 };
        String[][] d = metodo6(a, b);
        for (int i = 0; i < d.length; i++)
            for (int j = 0; j < d[i].length; j++)
                System.out.println(d[i][j]);
    }

    /*
     * Esercizio 6.Scrivere un metodo che, dati un array bidimensionale di
     * stringheaed un arraymonodimensionale di interib, restituisce un array
     * bidimensionale di stringhectale che larigac[i] contiene le sottostringhe
     * degli elementia[i][j] costituite dai primib[i] caratteri dia[i][j]. Seb[i] `e
     * maggiore della lunghezza dia[i][j], allorac[i][j] vale"-". Ad esempio,
     * sea={{"anna","lea","liliana"},{"mario","paolo"},{"enrica","luca","ugo",
     * "laura"}}eb={5,3,4}, il metodo
     * restituiscec={{"-","-","lilia"},{"mar","pao"},{"enri","luca","-","laur"}}.
     */
    public static String[][] metodo6(String[][] a, int b[]) {
        String[][] c = new String[a.length][];
        for (int i = 0; i < a.length; i++) {
            c[i] = new String[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                if (b[i] > a[i][j].length()) {
                    c[i][j] = "-";
                } else {
                    c[i][j] = a[i][j].substring(0, b[i]);
                }

            }
        }
        return c;
    }
}