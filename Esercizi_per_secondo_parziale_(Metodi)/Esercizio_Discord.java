class EsercizioDiscord {
    public static void main(String[] args) {
        int[][] a = { { 3, -2, 7, 4, 1, 5 }, { 4, 1, 3, -1 }, { 3, 5, -2 } };
        int[] v = { 5, 2, 7 };
        boolean[] d = metodoDis(a, v);
        for (int i = 0; i < d.length; i++)
            System.out.println(d[i]);
    }

    /*
     * Esercizio 1)
     * Scrivere un metodo statico iterativo che, dati un array bidimensionale di
     * interi a ed un array monodimensionale di interi v, restituisce
     * un array monodimensionale di booleani b tale che b[i] vale true
     * se nella riga a[i] esiste almeno una coppia di elementi
     * adiacenti la cui somma e uguale a v[i], altrimenti b[i] vale false.
     * Si assuma che gli array a e v abbiano lunghezza uguale.
     * N.B. Occorre passare alla riga successiva non appena e stata trovata la prima
     * coppia di
     * interi che soddisfa la condizione data.
     * Input:
     * a = {
     * {3,-2,7,4,1,5},
     * {4,1,3,-1},
     * {3,5,-2}
     * }
     * v = {5,2,7}
     * Output:
     * {true,true,false}
     */

    public static boolean[] metodoDis(int[][] a, int[] v) {
        boolean[] toReturn = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length-1 && toReturn[i] == false; j++) {
                if (a[i][j] + a[i][j+1] == v[i])
                    toReturn[i] = true;
            }
        }
        return toReturn;
    }
}